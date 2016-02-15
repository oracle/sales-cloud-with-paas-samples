#README for Oracle Cloud - PaaS for SaaS Sample

## Sample Name
Sales Merchandise Tracker

## Author
Arvind Srinivasamoorthy, Oracle A-Team

## Source Code Location
* GitHub: [https://github.com/oracle/sales-cloud-with-paas.git](https://github.com/oracle/sales-cloud-with-paas.git)
* OTN: [http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html](http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html)

## Oracle Cloud Products Involved
*  Oracle Java Cloud Service - SaaS Extension
*  Oracle Sales Cloud
*  Oracle Database Cloud Service (Database Schema)
*  Oracle JDeveloper Cloud specific version (11.1.1.7.1 or higher) / Oracle Enterprise pack for Eclipse available at [this](http://www.oracle.com/technetwork/topics/cloud/downloads/index.html) location on OTN


## Demonstrates

This sample demonstrates the following aspects of Oracle Cloud integration:  

#### Primary Goals

*  Using SAML as an authentication mechanism when an application in JCS - SaaS Extension invokes a web service on Oracle Sales Cloud. This sample demonstrates that no SAML set up is required for this interaction. 
*  Using SAML to demonstrate user based access to Oracle Sales Cloud data. Users logged into the application on JCS - SaaS Extension can only retrieve or modify Oracle Sales Cloud data for which they have access (modify not shown in this sample). 

#### Secondary Goals

*   Using Oracle Database Cloud Service (Database Schema) as the data store for the application deployed on JCS - SaaS Extension.

## Functional Overview

Merchandise tracker is an application used by sales representatives to keep a log of company-branded merchandise that was given away to customers and prospects as part of a standard sales process. A sales representative is able to enter the value of the merchandise issued for a specific customer. The sales representative is also able to see his or her historical merchandise issuance data. Although not implemented in this sample for sake of simplicity, this information will likely be used for tracking purposes by a manager to see statistics such as the total merchandise that was given away to a specific customer in a quarter, the total value of merchandise issued by a sales rep to all of his or her prospects and customers, and the total value of goods given by a sales team in a quarter.

## Technical Overview

The Sales Merchandise Tracker application is deployed to JCS - SaaS Extension. This application stores all data in the associated Oracle Database Cloud Service (Database Schema). During the process of logging a merchandise issuance transaction, the application will query for Accounts (returning only those that are accessible) for the logged in user. This list is retrieved through a web service, using SAML as a security mechanism. The purpose of this sample is to demonstrate that no SAML set up is required between JCS - SaaS Extension and Oracle Sales Cloud for this web service interaction. The only prerequisite is that the Sales Representative must exist as a user in both JCS - SaaS Extension and Oracle Sales Cloud identity stores. Passwords are irrelevant.

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only. The objective of this sample is only to demonstrate the goals defined above and may not represent other best practices, functional or technical.These sample code examples have not been thoroughly tested under all conditions.   Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code.   All sample code contained herein are provided to you AS IS without any warranties of any kind.   The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

## User and Role Setup

### Setting up the Sample
1. The JCS - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) and [Security Strategies for JCS - SaaS Extension and Oracle Sales Cloud interactions](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
2. For JCS - SaaS Extension, a user with the *Java Administrator* Role to deploy an application to the JCS - SaaS Extension instance is required. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) for more details about the *Java Administrator* Role.  Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.

### Running the Sample
1. Create a new user or use an existing user that exists in both Oracle Sales Cloud and JCS - SaaS Extension. 
2. The role of this user in Oracle Sales Cloud could be Sales Representative (in order to demonstrate user-based and role-based access to data). There is no role logic for the user in JCS - SaaS Extension in this sample.

## Install Instructions

Clone the git repository to your local working directory. You can also download the code from OTN to your local working directory and follow the same steps below. However the remaining steps will assume that you are using git. The steps below should be executed using a user as defined in User and Role Setup Setting up the Sample section above.

### Oracle Database Cloud Service (Database Schema)
Run the SQL scripts included in the source code using the SQL command in Oracle Database Cloud Service (Database Schema). Refer to the SQL Script section of [Creating Data Models in Oracle Database Cloud Service - Database Schema](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-0B2A2A62-BFB1-48C3-9398-23B7896E0E89) for more details about the steps to access the SQL command:

 1. To create the necessary tables: s2_table_creation.sql
 2. To create the necessary seed data (the merchandise product detail): s2_seed_data.sql 

### JCS - SaaS Extension

1. Open the .jws in JDeveloper or Eclipse. Refer to [Configuring IDEs for Developing with JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-645953AE-3C6F-40DD-AF06-03D466DEFECE) for more details about configuring JDeveloper or Eclipse. Further steps in this readme will refer to JDeveloper although similar steps can be performed in Eclipse.
2. In JDeveloper, in the model project under oracle.cloud.sampleapps > salesmerchtracker > model, open the file SalesMerchandiseTrkrAM.xml, click on configurations, double click on each of the configurations, and under the Connection type, the existing value will be YourDbCSDataSourceName. Change this to the JNDI name of the Datasource as provided in the JCS - SaaS Extension console. During development/debug time, you will likely be working with a local instance (instead of JCS - SaaS Extension). In that case, you can change the connection type to JDBC URL and provide the JDBC URL of the local database.
3. This sample uses a web service proxy to communicate with Oracle Sales Cloud. This proxy can be found in the model project under oracle.cloud.sampleapps > salesmerchtracker > model > proxy with the name SalesPartyServiceProxy. Since this proxy was generated based on the WSDL in an Oracle-internal Oracle Sales Cloud instance, it may not account for any customization done in your Oracle Sales Cloud instance. To account for your customization, you should regenerate the proxy that this sample is shipped with: 
  1. Right-click the proxy and select Properties. You will see the WSDL Document URL as https://your_sales_cloud_URL/crmCommonSalesParties/SalesPartyService?WSDL. Change this to the Sales Party Service WSDL of your Sales Cloud instance.
  2. Follow the instructions in "Regenerating a Web Service Proxy" in [Using ADF Web Service Proxies](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-47DF9896-9B8B-4C8A-B19D-7395839B623E) for more details about the steps to regenerate to complete the regeneration of the proxy.
4. *Optional* - This application is built based on a Façade that is built on top of this proxy rather than directly using the proxy. The façade also defines the SAML Client policy that is being used by this sample. You can optionally use a different policy such as username_token policy for the purpose of debugging. Refer to "Creating a Façade for a Web Service Proxy" in [Using ADF Web Service Proxies](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-47DF9896-9B8B-4C8A-B19D-7395839B623E) for more details. The facade can be found under oracle.cloud.sampleapps > salesmerchtracker > model > proxy > facade > SalesPartyFacade.java.
5. Deploy the application to your JCS - SaaS Extension instance. Refer to [Deploying Applications Individually Using JCS - SaaS Extension Control](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Sales Cloud

 1. Create a few Accounts in case there is none existing. 
 2. *Optional* - The standard security settings in Oracle Sales Cloud allow users with Sales Representative or Sales Manager Job role to view all accounts (customers) in your organization. If you require that this access be limited such that Sales Reps and Sales Managers are only able to view accounts where they are members, owners, or manager of a member or owner, then you must configure custom security. The steps to achieve this are documented in detail at this Oracle Support Note: [Customer Object: Restrict “All Customer” Access for Sales Reps & Sales Managers - Doc ID 1620475.1](https://support.oracle.com/epmos/faces/DocumentDisplay?_afrLoop=380931209896883&id=1620475.1&_adf.ctrl-state=q0rajq1ad_57)


## Running the Sample
To run the sample:

1. Log out of Oracle Sales Cloud and JCS - SaaS Extension. 
2. Launch the JCS - SaaS Extension application. For more details, refer to [Launching Your JCS - SaaS Extension Web Application Standalone](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-A29DD873-7AE4-4048-A9CD-A38E50FDF5D6).
3. You will be prompted to log in. Provide the credentials of a user that exists in both Oracle Sales Cloud and JCS - SaaS Extension (as described in the User and Role Setup Running the Sample section above).	
4. Once you are logged in, you will see the list of existing merchandise issuance. This list will be empty if the logged in user has not created any entries in the past. Note: You will only see the merchandise issuance of the logged in user. Data of other users will not be displayed. You will see the logged in user in the top right corner of the application. The data in the history table also displays the user that created that issuance record.
  * You can report a new merchandise issuance using the Report New Merchandise issuance button.
  * In this page, as you start typing an account name, account names for which the logged in user has access will be suggested. The suggestions are provided using a SAML web service call. Since the logged in user also exists in Oracle Sales Cloud, SAML ID propagation will ensure that only accounts for which the logged in user has access will be displayed. 
5. Select a particular account from the displayed list. 
**Note:** The standard security settings in Oracle Sales Cloud allow users with Sales Representative or Sales Manager Job role to view all accounts (customers) in your organization. Therefore, you will see all accounts that exist in your organization. However, if you implement the optional security set up as defined in step 2 of the Sales Cloud setup of this README, the drop down will only list accounts for which you are a member of the team, owner of the account, or manager of member or owner.
7. Provide data for other fields and click Submit. The new record is shown in the history table.

## Additional information

For more details about this sample and other related samples, refer to Oracle Cloud Solutions at <https://cloud.oracle.com/developer/solutions>.

## Uninstall Instructions

### Oracle Database Cloud Service (Database Schema)
Run the s2_table_drop.sql included in the source code (under sales-merch-tracker-soap-saml/DbCS/sql/) using the SQL command in Oracle Database Cloud Service (Database Schema). Refer to the SQL Script section of [Creating Data Models in Oracle Database Cloud Service Database Schema](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-0B2A2A62-BFB1-48C3-9398-23B7896E0E89) for more details about the steps to access the SQL command.

### JCS - SaaS Extension
Undeploy the application from JCS - SaaS Extension.  Refer to the Undeploy section in [Deploying Applications Individually to JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Oracle Sales Cloud
No undeploy instructions required unless you decide it is necessary to undo the optional security settings that limit sales representative role and/or sales manager role access to accounts. Refer to MOS Knowledge base note [1620475.1](https://support.oracle.com/epmos/faces/DocumentDisplay?_afrLoop=380931209896883&id=1620475.1&_adf.ctrl-state=q0rajq1ad_57) referenced above to revert to the default security model for accounts.

## Documentation
To learn how to further extend this sample, explore other implementation options, or develop your own application following a similar implementation pattern, visit the [Sales Merchandise Tracker Solutions page](https://cloud.oracle.com/developer/solutions?scenarioid=1430652276872) in the [Oracle Cloud Developer Portal](https://cloud.oracle.com/developer).

## Known Issues
| # | Isssue | Workaround |
| - | ------ | ---------- |
| 1 | In the page to report a new merchandise issuance, the Sales rep is allowed to type out an Account that is not in the returned list of valid accounts. This is likely not desirable scenario in real world implementation | This validation has not been implemented in this sample to avoid additional complexity.  It can be implemented using ADF code. |


Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved
