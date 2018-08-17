#README for Oracle Cloud - PaaS for SaaS Sample

## Sample Name
Sales Preparation Insight

## Source Code Location
* GitHub: [https://github.com/oracle/sales-cloud-with-paas-samples](https://github.com/oracle/sales-cloud-with-paas-samples)
* Oracle Technology Network: [https://www.oracle.com/technetwork/indexes/samplecode/solutions-architectures-samples-5012412.html](https://www.oracle.com/technetwork/indexes/samplecode/solutions-architectures-samples-5012412.html)

## Oracle Cloud Products Involved
* Oracle Java Cloud Service - SaaS Extension
* Oracle Sales Cloud
* Oracle Database Cloud Service (Database Schema)
* Oracle JDeveloper Cloud specific version (11.1.1.7.1 or higher) / Oracle Enterprise pack for Eclipse available at [this](http://www.oracle.com/technetwork/topics/cloud/downloads/index.html) location on OTN

## Demonstrates
This sample demonstrates the following aspects of Oracle Cloud integration:

### Primary Goals
*   Showcase Oracle Java Cloud Service - SaaS Extension as an option to build UI extensions to Oracle Sales Cloud. An ADF application is deployed in Oracle Java Cloud Service - SaaS Extension with the same look and feel as Oracle Sales Cloud. This extended UI will be embedded within the Oracle Sales Cloud UI.
*	To leverage pre-wired SSO between Oracle Sales Cloud and Oracle Java Cloud Service - SaaS Extension such that the embedded application (which by itself is protected) does not challenge an already logged-in Oracle Sales Cloud user. 

### Secondary Goals
*   To showcase Oracle Database Cloud Service (Database Schema) as the data store for the application deployed on Oracle Java Cloud Service - SaaS Extension.

## Functional Overview

Prior to meeting their existing accounts for additional sales opportunities, the sales representatives of XYZ Inc. would like to know if these accounts have any critical or long pending Service Requests (SRs) that are open and relevant to their sales process. With this insight the representatives are able to reach out to internal teams to understand more about these SRs. The sales reps would like to see the list of these SRs along with their statuses automatically show up for each account on Oracle Sales Cloud, rather than having to reach out to the Service team of their organization to obtain the same information. Additionally, the reps would also like to be current on the latest news about their accounts such as leadership changes, recent announcements, or anything else that may impact their selling ability. This insight could come from their internal research team or public websites. 

## Technical Overview

The Sales Preparation Insight application is deployed to Oracle Java Cloud Service - SaaS Extension and displays the open SRs related to a given customer. The application also provides news articles from internal sources and public news that match the account name or the industry name. For the sake of simplicity this application mocks up all this data. The mock data is stored in Oracle Database Cloud Service (Database Schema). Based on the account ID, which is passed as a URL parameter to this application, different mock data is shown.

This application is then embedded as an iFrame within the Account widget of the Oracle Sales Cloud UI. Whenever a sales rep opens an account, he or she can click a sub-tab for that account that displays this embedded application. 

The key objective of this sample is to show that the embedded application, although running as a protected application on Oracle Java Cloud Service - SaaS Extension, does not show a log in page when a sales rep navigates to the sub-tab. This is because of the pre-wired SSO configuration between Oracle Sales Cloud and Oracle Java Cloud Service - SaaS Extension. Since the sales rep is already signed into Oracle Sales Cloud, the embedded page is directly displayed. (See the Known Issues section at the end of this README if you encounter problems.)

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only.  The objective of these samples is to demonstrate the goals defined above and may not represent other best practices, either functional or technical. These sample code examples have not been thoroughly tested under all conditions. Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code. All sample code contained herein are provided to you "AS IS" without any warranties of any kind. The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

## User and Role Setup:

### Setting up the Sample
1. The Oracle Java Cloud Service - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Learn About Signing Up for an Oracle Cloud Subscription](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions&id=GCSSL) and [Learn About Authorization Strategies for Oracle Java Cloud Service - SaaS Extension and Oracle SaaS Interactions](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions/call-java-cloud-soap-app-from-sales-cloud&id=GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
2. For Oracle Java Cloud Service - SaaS Extension, a user with the *Java Administrator* Role to deploy an application to the Oracle Java Cloud Service - SaaS Extension instance is required. Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.

### Running the Sample
Create a new user or use an existing user that exists in both Oracle Sales Cloud and Oracle Java Cloud Service - SaaS Extension. The role of this user in Oracle Sales Cloud could be *Sales Administrator*. There is no role logic for the user in Oracle Java Cloud Service - SaaS Extension in this sample.


## Install Instructions

Clone the Git repository to your local working directory. The steps below will assume that you are using git. However you can also download the code from OTN to your local working directory and follow the same steps below.

### Oracle Database Cloud Service (Database Schema)
Run the SQL scripts included in the source code using the SQL command in Oracle Database Cloud Service (Database Schema).

*git-home*/sales-prep-insight-sso/DbCS/SalesPrepCreateInsert.sql

### Oracle Java Cloud Service - SaaS Extension
Use JDeveloper to build the ADF application EAR and deploy it to Oracle Java Cloud Service - SaaS Extension:

1. Open the .jws in JDeveloper or Eclipse. Further steps in this readme will refer to JDeveloper although similar steps can be performed in Eclipse.
2. 	In the IDE, open the file AccountDetailsAM.xml under Model > Application Sources > oracle.cloud.sampleapps > accountdetails > model > AccountDetailsAM, click on configurations, double click AccountDetailsAMLocal, and under the Connection type, the existing value will be YourDbCSDataSourceName. Change this to the JNDI name of the Datasource. Login to Oracle Java Cloud Service - SaaS Extension console, expand Data sources, then JNDI Location. You will find the JNDI Name.  During development/debug time, you will likely be working with a local instance (instead of Oracle Java Cloud Service - SaaS Extension). In that case, you can change the connection type to *JDBC URL* and provide the JDBC URL of the local database.
3.  ADF applications are automatically configured for framebusting to prevent other applications from embedding them. This measure is normally used to ensure the correct formatting and to prevent click-jacking. Because, in this special Oracle Cloud to Oracle Cloud extension use case, we require embedding, the ADF Application should be manually configured to disable Framebusting (refer to Known Issues for more details). In the IDE, open the file web.xml under ViewController > Web Content > WEB-INF. Click on the Source Tab. At the end of the last context-param XML tag and before the beginning of the filter XML tag, paste the following code:

        <context-param>
          <!-- Setting FRAME_BUSTING to NEVER avoids this error - Refused to display 'http://...' in a frame because it set 'X-Frame-Options' to 'sameorigin'-->
          <description> Security precaution to prevent clickjacking- bust frames if the ancestor window domain (protocol, host, and port) and the frame domain are different. Another options for this parameter are always and never </description>
                <param-name>org.apache.myfaces.trinidad.security.FRAME_BUSTING</param-name>
                <param-value>never</param-value>
        </context-param>
        
4.  Deploy the application to your Oracle Java Cloud Service - SaaS Extension instance. Refer to [Deploy Applications Individually Using Oracle Java Cloud Service - SaaS Extension Control](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions/embed-java-saas-extension-app-in-sales-cloud&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Oracle Sales Cloud
Make customizations to Oracle Sales Cloud to embed the ADF UI.

**NOTE**:  It is critical to perform all Oracle Sales Cloud development/customization work in an activated sandbox.  Not only does this aid in testing and debugging, but it also greatly simplifies un-installing/rolling back sample application extensions when required.  Given that all customizations will be isolated to a sandbox, it is necessary to communicate sandbox details to others so that they can interact with sample application customizations while acting in different roles.

The steps involved in rolling back Oracle Sales Cloud customizations published from sandboxes to the main code line will not be documented here.

1. Create or activate a sandbox as required. 
2. Register AccountDetails as a third party app. 
  * *Application Name:* AccountDetails
  * *Partner Name:* AccountDetails
  * *Full URL:* https://your_sales_cloud_URL/AccountDetails. 
  
3. Add a subtab to the Account page details interface: 
  1. Click the Navigator icon to open the Navigator menu. 
  2. Click the Tools icon, if necessary to expand its contents, then click Application Composer.
  3. Expand *Standard Objects* under the Objects item on the left. 
  4. Expand *Account* and click *Pages*. 
  5. At the Account: Pages screen, on the *Simplified Pages* tab, select the *Default Layout* row in the table under the "Details Page Layout" section.  
  6. Click Actions > Edit Layout
  7. This will open the Details Layout: Default Layout screen. It resembles the live *Account Details* screen. Along the left side will be a set of vertical tabs. At the bottom of those tabs will be a green plus Add icon that will allow a new tab to be added. Click the Add icon. 
  8. At the Details Layout: Default Layout: Create Subtab screen, select *Web Content.* A Web content subtab exposes content from an external Web site. 
  9. Click Next. 
  10. In the *Basic Information* section, enter *Service Requests* for *Display Label* and *Service Requests and News* for the Description. 
  11. In the *URL Definition* section, copy the content from the ServiceRequestSubTab.groovy file found under: *git-home*/sales-prep-insight-sso/SalesCloud/common/standard/account/pages/details-page-layout _into the Groovy editor. 
  12. Click *Save and Close.* 
  13. Click Done. 
  
## Running the Sample
To run the sample:

1. Log out of Oracle Sales Cloud and Oracle Java Cloud Service - SaaS Extension. 
2. Launch the Oracle Sales Cloud application.
3. Log in as a user with Sales Administrator privileges. This role allows access to sales functions required to run the sample as well as allowing access to sandbox management.  As discussed earlier, this user should exist in Oracle Java Cloud Service - SaaS Extension as well.
4. Click the Home icon in the navigation menu. 
5. Click the Accounts icon. 
6. Click on an Account in the search results. *Note*: An account may need to be created if none are present. 
7. Click the "Service Requests" subtab. 
8. During the first time you do this, you may be prompted with a login page. Select *Remember my choice* and click on *Sign In Using Company*. This is a one time setup. You will not be prompted the next time, until you log out of Oracle Sales Cloud (see Known Issues for additional information).
9. Now the AccountDetails ADF application will be displayed within a subtab of the Oracle Sales Cloud Account. 

## Uninstall Instructions

### Oracle Database Cloud Service (Database Schema)

Run the SQL script SalesPrepDropTables.sql included in the source code (under /sales-prep-insight-sso/DbCS/sql/) using the SQL command in Oracle Database Cloud Service (Database Schema).

### Oracle Java Cloud Service - SaaS Extension

Undeploy the application from Oracle Java Cloud Service - SaaS Extension.  Refer to the Undeploy section in [Deploy Applications Individually Using Oracle Java Cloud Service - SaaS Extension Control](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions/embed-java-saas-extension-app-in-sales-cloud&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Oracle Sales Cloud

Remove the customizations from Oracle Sales Cloud.

1. Deactivate and delete the development sandbox. This will roll back all customizations to Oracle Sales Cloud.

## Documentation
To learn how to further extend this sample, explore other implementation options, or develop your own application, visit the Oracle Cloud Solutions page at <https://docs.oracle.com/solutions>.


## Known Issues
| # | Issue | Workaround |
| - | ----- | ---------- |
| 1 | After clicking the newly added "Service Requests" tab and authenticating, the ADF page that is supposed to be embedded in the Oracle Sales Cloud's Account Details area takes up the full browser display area. Additionaly, sometimes after authenticating, a 500 error will occur and the ADF page will not display at all. If, however, the user is already authenticated with Oracle Java Cloud Service - SaaS Extension, either by authenticating directly with the Oracle Java Cloud Service - SaaS Extension login or by clicking the new tab and choosing "Sign in Using Company" previously, the ADF page will appear embedded in the *Service Requests* tab. | Log into Oracle Java Cloud Service - SaaS Extension prior to clicking the *Service Requests* tab. |
| 2 | ADF applications are automatically configured for framebusting to prevent other applications from embedding them. This measure is normally used to ensure the correct formatting and to prevent click-jacking. Because in this special Oracle Cloud to Oracle Cloud extension use case, we require embedding, the ADF Application should be manually configured to disable Framebusting. | Oracle will provide automated mechanisms for ensuring that framebusting is automatically disabled only for Oracle Cloud-Oracle Cloud interactions. Until then, please apply the workaround mentioned in the install steps. *Note*: Ensure that you always protect your ADF application for authentication |



Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved
