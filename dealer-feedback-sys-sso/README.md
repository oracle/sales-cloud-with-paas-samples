#README for Oracle Cloud -- SaaS for PaaS Sample

## Sample Name
Dealer Feedback System

## Author
Jian Liang, Oracle A-Team

## Source Code Location
* GitHub: [https://github.com/oracle/sales-cloud-with-paas.git](https://github.com/oracle/sales-cloud-with-paas.git)
* OTN: [http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html](http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html)

##Oracle Cloud Products Involved
* Oracle Java Cloud Service - SaaS Extension
* Oracle Sales Cloud
* Oracle Database Cloud Service (Database Schema)
* Oracle JDeveloper Cloud specific version (11.1.1.7.1 or higher) / Oracle Enterprise pack for Eclipse available at [this](http://www.oracle.com/technetwork/topics/cloud/downloads/index.html) location on OTN

## Demonstrates

This sample demonstrates the following aspects of Oracle Cloud integration:

### Primary Goals
* Demonstrate SSO and non-SSO based authentication. Users that have an Oracle SaaS Applications ID can choose to authenticate with a JCS - SaaS Extension application using a SSO-mechanism based on the Oracle Application ID. Other users can authenticate directly in JCS - SaaS Extension, using non-SSO-based authentication.
* Embedding an external link in Oracle Sales Cloud
* Security Role-based access to the JCS - SaaS Extension application

### Secondary Goals
* Using AngularJS to build a web application deployed to JCS - SaaS Extension
* Exposing RESTful services in JSON format from Oracle Database Cloud Service (Database Schema)

## Functional Overview

This sample requires having two users: one is the dealer manager who has access to both Oracle Sales Cloud and JCS - SaaS Extension, while the other is a dealer who has access to JCS - SaaS Extension only.

The dealer manager works in Oracle Sales Cloud and wants to check the feedback received from all dealers. All of the feedback received is managed by the Dealer Feedback System deployed on JCS - SaaS Extension.

The dealer manager authenticates to Oracle Sales Cloud, and can then click on the embedded link to list the feedback stored in the Dealer Feedback System. Oracle Sales Cloud uses SSO to allow the user to access the external Dealer Feedback System without having to also authenticate with JCS - SaaS Extension.

An individual dealer is only allowed to access the Dealer Feedback System and does not have credentials to log in to Sales Cloud. The dealer can only create his own feedback.

Both dealer manager (from the embedded link in Oracle Sales Cloud) and dealer (direct from a browser) access the same URL on JCS - SaaS Extension. The Dealer Feedback Web Application will show different contents based on user role: the dealer manager will see a list of feedback received while an individual dealer will see a form to create his own feedback.

## Technical Overview

The Dealer Feedback System is deployed to JCS - SaaS Extension. It uses an associated Oracle Database Cloud Service (Database Schema) instance to store dealer feedback items in a database table. The application is set up with two security roles:  a dealer who can only create feedback and a dealer manager who can see all feedback.  Elements of the application are protected by role.  The dealer manager role has a federated login on an associated Oracle Sales Cloud instance, and while logged in to Oracle Sales Cloud can access the dealer feedback system using a menu link without being challenged again for user credentials.

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only. The objective of this sample is only to demonstrate the goals defined above and may not represent other best practices, functional or technical.These sample code examples have not been thoroughly tested under all conditions. Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code. All sample code contained herein are provided to you AS IS without any warranties of any kind. The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

## User and Role Setup

### Setting up the Sample

1. The JCS - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) and [Security Strategies for JCS - SaaS Extension and Oracle Sales Cloud interactions](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
2. For JCS - SaaS Extension, a user with the *Java Administrator* Role to deploy an application to the JCS - SaaS Extension instance is required. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) for more details about the *Java Administrator* Role.  Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.

### Running the Sample
This sample aims to show the use of security roles in JCS-SaaS Extension. Creating two users, each of which with a different role, is a prerequisite of this sample application:

* A dealer manager to be created in both Oracle Sales Cloud and JCS - SaaS Extension.
* A dealer to be created in JCS - SaaS Extension only.

The following steps illustrate how to set up users and roles for this sample:

#### JCS - SaaS Extension

For each of the following steps, refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details.

1. Create two Custom Roles in JCS - SaaS Extension. Note that the roles created here will be mapped to Application Role in weblogic.xml so it is critical to use these exact role names:
    * Dealer Manager (rolename: DealerManager)
    * Dealer (rolename: Dealer)
2. Create Users in JCS - SaaS Extension. The names used below are suggestions only, but are referred to by example in the README:
    * dealer1
    * dealermanager1
3. Assign the Custom Roles to users:
    * Assign the role "Dealer" to dealer1
    * Assign the role "Dealer Manager" to dealermanager1

#### Oracle Sales Cloud

In Oracle Sales Cloud, a user with an identical user ID as the dealer manager (e.g. dealermanager1) is needed to demonstrate SSO capability. **Please note that the user ID for this user in Oracle Sales Cloud and in JCS - SaaS Extension must be identical.**  This user also requires access to development sandboxes. The easiest way to meet this requirement is to create a sample application test user who has the *Sales Administrator* role. See Chapter 5, "About Oracle Sales Cloud Users", in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud132&id=OSCUS1288015) for more details on creating users with specific roles. This role is completely independent of the Custom role that we use in JCS - SaaS Extension. It is only used to manage the access to the corresponding resources in Oracle Sales Cloud. For example, a user can have the Sales Administrator role in Oracle Sales Cloud and also be assigned the dealer manager role in JCS - SaaS Extension. 

## Install Instructions
The steps below will assume that you are using git. However you can also download the code from OTN to your local working directory and follow the same steps below.

### Database Cloud Service (Schema)

1. Upload and Run <git-home>/dealer-feedback-sys-sso/DbCS/sql/DEALER_FEEDBACK_DDL.sql to Oracle Database Cloud Service (Database Schema).
2. Import the RESTful Service Configuration from <git-home>/dealer-feedback-sys-sso/DbCS/sql/oracle_cloud_sampleapps_dealerfeedback.sql. See the documentation for details <link here>.
3. It is possible, though not required, to secure the Oracle Database Cloud Service (Database Schema) RESTful services using OAUTH2.  Refer to the "Securing Rest Services" section in [Manipulating Data in Oracle Database Cloud Service (Database Schema) Using REST Services](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-98B929AD-6843-4B96-82FD-3A5235B5A385) for more details.
4. Test
  1. Click the GET Handler under dealerfeedbacks/ Template.
  2. Click the "Test" button and you should be able to see the pre-populated record.

### JCS - SaaS Extension

1. Clone the git repository to your local working directory
2. Open the application (.jws file) in JDeveloper or Eclipse. There is a need to make these changes to account for your specific data source:
    1. Open dealer-project/Web Content/WEB-INF/web.xml.
    2. Change the value of the parameter "dbcs-url" context-param to the Oracle Database Cloud Service (Database Schema) URL. This parameter is ready by the java server pages to connect to the JCS - Saas Extension datasource.
    3. If action was taken to secure the Oracle Database Cloud Service (Database Schema) services, change the value of the parameter "access-token" context-param to the obtained access token.
3. Deploy the Angular application to a war file and deploy as documented in [Deploying Applications Individually Using JCS - SaaS Extension Control](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339).
4. Test the application by accessing the URL on JCS - SaaS Extension (https://jcs-sx-url/dealer-feedback) as dealer1 to render the dealer feedback form.

### Oracle Sales Cloud

**NOTE**:  It is critical to perform all Oracle Sales Cloud development/customization work in an activated sandbox.  Not only does this aid in testing and debugging, but it also greatly simplifies un-installing/rolling back sample application extensions when required.  Given that all customizations will be isolated to a sandbox, it is necessary to communicate sandbox details to others so that they can interact with sample application customizations while acting in different roles.

The steps involved in rolling back Oracle Sales Cloud customizations published from sandboxes to the main code line will not be documented here.

Customize Oracle Sales Cloud to embed a URL link pointing to the Dealer Feedback System application deployed to JCS - SaaS Extension:

1. Log in as a customization user with access to Application Composer.  Create or activate a sandbox as required.  Refer to [Understanding the Basics of Oracle Sales Cloud Customization and Integration Features](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-73F02E54-38FB-4081-BD9D-4570DD26CDBD) for details.
2. Register dealer-feedback as a third party application.  Refer to [Creating a Third Party Application](http://www.oracle.com/pls/topic/lookup?ctx=cloud132&id=OACEX1683514) for more details:
	* Application Name: DealerFeedback
	* Full URL: https://jcs-sx-url/dealer-feedback/
	* Parter Name: Dealer Feedback
3. Go to Tools -> Structure and create a Page Entry:
	* Name: Dealer Feedback
	* Icon: Select your favorite icon
	* Category: Sales
	* Visible: Yes
	* Link Type: Static
	* Destination: #{EndPointProvider.externalEndpointByModuleShortName['DealerFeedback']}

## Running the Sample

To run the sample:

1. Login to Oracle Sales Cloud as dealermanager1.
2. Go to Sales and click the Dealer Feedback icon.
3. If a page shows up for authentication, click "Sign in using Company", and you should be able to login into the Dealer Feedback System without authenticating again. Then, you should see the list of feedback without the need to authenticate again.
4. You can update the "Follow-up?" and "Follow-up by" fields and Save.
5. Open a new browser, connect to JCS - SaaS Extension (for example, https://jcs-sx-url/dealer-feedback), and authenticate as dealer1. You will be able to see a form to create a feedback.
6. Fill out the form and click Submit.

**Note**: Be aware of session-sharing behaviors across multiple tabs in browsers. You may need to use different browser sessions or private windows when testing with different users simultaneously.

## Additional information
For more details about this sample and other related samples refer to Oracle Cloud Solutions at <https://cloud.oracle.com/developer/solutions>.

## Uninstall Instructions

### Oracle Database Cloud Service (Database Schema)
1. Drop the dealer_feedback table.
2. Delete the scripts.
3. Delete the oracle.cloud.sampleapps.dealerfeedback RESTful module.
4. If action was taken to secure the Oracle Database Cloud Service (Database Schema) services, delete the registered client, privilege, etc.

### JCS - SaaS Extension
Undeploy the application from JCS  -SaaS Extension. Refer to the Undeploy section in [Deploying Applications Individually to JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Oracle Sales Cloud
Deactivate and delete the sandbox.  This will roll back all Oracle Sales Cloud customizations.

## Documentation
To learn how to further extend this sample, explore other implementation options, or develop your own application following a similar implementation pattern, visit the [Dealer Feedback System Solutions page](https://cloud.oracle.com/developer/solutions?scenarioid=1431006984482) in the [Oracle Cloud Developer Portal](https://cloud.oracle.com/developer).


## Known Issues
| # | Issue | Workaround |
| - | ------ | ---------- |
| 1 | Some versions of Internet Explorer may display content incorrectly. | Use Firefox or Chrome to continue the sample test. |



Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved
