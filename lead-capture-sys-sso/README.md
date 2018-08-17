#README for Oracle Cloud -- SaaS for PaaS Sample

## Sample Name
Lead Capture with Single Sign On

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

* This sample demonstrates single-sign-on (SSO) from a Java Cloud Service - SaaS Extension application linking out to Oracle Sales Cloud.

### Secondary Goals

* Using Oracle Database Cloud Service (Database Schema) as the data store for the application deployed on Java Cloud Service - SaaS Extension.

## Functional Overview

Information and status pertaining to leads is kept in an ADF application deployed to Java Cloud Service - SaaS Extension. External users of this system are given limited access to Oracle Sales Cloud leads and contacts for updating purposes. These users do not have access to other Oracle Sales Cloud system functions; what appears in menus and navigation is a slimmed-down subset of Oracle Sales Cloud features. 

## Technical Overview

The Java/ADF application is deployed to Java Cloud Service - Saas Extension and also uses Oracle Database Cloud Service (Database Schema) to display additional data. A link to Oracle Sales Cloud is provided so a business user can quickly use the information displayed in the Java Cloud Service - SaaS Extension application to work with Oracle Sales Cloud. Single Sign-On (SSO) is used to allow a user to access the Java Application without having to authenticate with Oracle Sales Cloud again, after being already authenticated with Java Cloud Service - SaaS Extension.

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only. The objective of this sample is only to demonstrate the goals defined above and may not represent other best practices, functional or technical. These sample code examples have not been thoroughly tested under all conditions. Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code. All sample code contained herein are provided to you AS IS without any warranties of any kind. The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

## User and Role Setup:

### Setting up the Sample
1. The Oracle Java Cloud Service - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Learn About Signing Up for an Oracle Cloud Subscription](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions&id=GCSSL) and [Learn About Authorization Strategies for Oracle Java Cloud Service - SaaS Extension and Oracle SaaS Interactions](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions/call-java-cloud-soap-app-from-sales-cloud&id=GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
2. For Oracle Java Cloud Service - SaaS Extension, a user with the *Java Administrator* Role to deploy an application to the Oracle Java Cloud Service - SaaS Extension instance is required. Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.

## Running the Sample

1. Create a new user or use an existing user that exists in both Oracle Sales Cloud and Java Cloud Service-SaaS Extension. For Java Cloud Service - SaaS Extension, refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details. For Sales Cloud, refer to Chapter 5, "About Oracle Sales Cloud Users" in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OSCUS1288015).

2. A Sales Cloud user needs to be assigned a custom role. This role needs to be created in Sales Cloud. Refer to Chapter 12, "Customizing Security" in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OSCUS1239294) for details.

## Install Instructions 

### Installation Steps

Clone the Git repository locally. You can also download the code from OTN to your local working directory and follow the same steps below. However the remaining steps will assume that you are using git.

### Oracle Database Cloud Service (Database Schema)
Run the SQL scripts included in the source code using the SQL command in Oracle Database Cloud Service (Database Schema).  

*git-home*/lead-capture-app-sso/DbCS/sql/crTable_LEAD_CAPTURE_SYS_SSO.sql

To confirm script execution, verify that the `LEAD_CAPTURE_SYS_SSO` table has been created in the Oracle Database Cloud Service (Database Schema) console.

### Java Cloud Service - SaaS Extension

Use JDeveloper to build the ADF application EAR and deploy it to Java Cloud Service - SaaS Extension:

1. Open the .jws in JDeveloper or Eclipse. Further steps in this readme will refer to JDeveloper although similar steps can be performed in Eclipse.
2. Change in the IE or with an editor the values for the token *@@datasource-servicename@@* in the file JCS-SX/ModelLeadCaptureSys/src/oracle/cloud/sampleaapps/leadcapturesys/model/common/bc4j.xcfg and for token *@@your_sales_cloud_URL@@* in file JCS-SX/ViewLCS/public_html/LeadCapture.jspx. 
3. Deploy the application to your Java Cloud Service - SaaS Extension instance. Refer to [Deploy Applications Individually Using Oracle Java Cloud Service - SaaS Extension Control](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions/link-sales-cloud-from-java-cloud-saas&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

Create an application user for testing purposes.


### Oracle Sales Cloud

Create a test user in Oracle Sales Cloud with the same user ID as the one created in Java Cloud Service - SaaS Extension. 

1. See Chapter 5, "About Oracle Sales Cloud Users", in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OSCUS1288015) for details.
2. Special consideration for custom role. Refer to Chapter 12, "Customizing Security", in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OSCUS1239294) for details.  Also refer to documents listed below for additional information:
    * [How to Create a Custom Role with Restricted Privileges in Fusion Applications - Doc ID 1451022.1](https://support.oracle.com/epmos/faces/DocumentDisplay?_afrLoop=288586409880989&id=1451022.1)
    * [Mapping Of Duty Roles To Top Level Menu Entries in Fusion Applications - Doc ID 1459828.1](https://support.oracle.com/epmos/faces/DocumentDisplay?_afrLoop=288586409880989&id=1459828.1)
    * [Mapping Of Roles, Duties and Privileges in Fusion Applications - Doc ID 1460486.1](https://support.oracle.com/epmos/faces/DocumentDisplay?_afrLoop=288586409880989&id=1460486.1)
    * [Information Center: Oracle Fusion Application - Fusion Security - "User - Role Administration"  - Doc ID 1631632.2](https://support.oracle.com/epmos/faces/DocumentDisplay?_afrLoop=288586409880989&id=1631632.2)

## Running the Sample Application

To run the sample:

1. After being deployed the ADF application for Lead Capture can be opened using this link: 

    **https://your\_jcs-sx\_url/LeadCaptureSys-ViewLCS-context-root**

2. To test the functionality:
    1.  Open the URL to the Java Cloud Service - SaaS Extension page (the URL above) in a different window.
    2.  When the Login Page appears, click the "Sign in using Company" link on the bottom. You will be redirected to the Oracle Sales Cloud login page.
    3.  Enter the login credentials. You will be redirected again to your Java application.
    4.  After seeing the page displayed correctly, click the Manage Leads and Contacts button. You should be taken to the Oracle Sales Cloud instances where you can continue with your activities. You should not be prompted to login again. 

## Additional information

For more details about this sample and other related samples, refer to Oracle Cloud Solutions at <https://docs.oracle.com/solutions>.

## Uninstall Instructions

### Oracle Database Cloud Service (Database Schema)
Drop the table and sequence from Oracle Database Cloud Service (Database Schema). You can borrow the two drop statements from the `crTable_LEAD_CAPTURE_SYS_SSO.sql` script.

### Java Cloud Service - SaaS Extension
1.  Undeploy the application from Java Cloud Service - SaaS Extension. Refer to the Undeploy section in [Deploy Applications Individually Using Oracle Java Cloud Service - SaaS Extension Control](https://docs.oracle.com/pls/topic/lookup?ctx=en/solutions/link-sales-cloud-from-java-cloud-saas&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details. 
2.  Remove the application from JDeveloper.
3.  Remove the files from your local file system.

### Oracle Sales Cloud
1. Deactivate the restricted user in Oracle Sales Cloud.
2. If necessary, delete the custom role that was created to support this application.

## Documentation
To learn how to further extend this sample, explore other implementation options, or develop your own application, visit the Oracle Cloud Solutions page at <https://docs.oracle.com/solutions>.

## Known Issues

There are no known issues with the sample.



Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved
