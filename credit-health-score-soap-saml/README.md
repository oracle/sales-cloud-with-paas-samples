README for Oracle Cloud - PaaS for SaaS Sample
==============================================

## Sample Name
Credit Health Score

## Author
Jian Liang, Oracle A-Team

## Source Code Location
* GitHub: [https://github.com/oracle/sales-cloud-with-paas-samples](https://github.com/oracle/sales-cloud-with-paas-samples)
* OTN: [http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html](http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html)

## Oracle Cloud Products Involved
* Oracle Java Cloud Service - SaaS Extension
* Oracle Sales Cloud
* Oracle JDeveloper Cloud specific version (11.1.1.7.1 or higher) / Oracle Enterprise pack for Eclipse available at [this](http://www.oracle.com/technetwork/topics/cloud/downloads/index.html) location on OTN

## Demonstrates

This sample demonstrates the following aspects of Oracle Cloud integration:

#### Primary Goals

* Using SAML as an authentication mechanism when Oracle Sales Cloud invokes a SOAP web service deployed to JCS - SaaS extension. This sample demonstrates that no SAML setup is required for this interaction.

#### Secondary Goals

* Displaying the results of an external web service invocation in the Oracle Sales Cloud UI

## Functional Overview

ABC Inc, attaches a Credit Health Score to every account/opportunity. This score ranges from 1 to 10 and is calculated based on a complex logic involving data from several internal and external systems. This score is used by the Sales Team, Service team, and Order Management team. The score logic is developed and maintained by a dedicated development team. In addition to providing the credit score for a given account, this application also logs each request to credit score. This logging mechanism is not implemented in this sample for the sake of simplicity.

## Technical Overview

The Credit Health Score logic is exposed as a JAX-WS web service deployed on JCS - SaaS Extension. Oracle Sales Cloud invokes this web service by passing an account ID as an input parameter and getting back the credit score which is then displayed in the Oracle Sales Cloud UI. In a more realistic implementation, this ID will be used to fetch additional information from Oracle Sales Cloud prior to calculating the credit score. For the sake of simplicity this web service is implemented with no real logic and simply returns a randomly generated credit score. The purpose of this sample is to demonstrate that no SAML set up is required between JCS - SaaS Extension and Oracle Sales Cloud for this web service interaction. The only prerequisite is that the same user ID should exist in both JCS - SaaS Extension and Oracle Sales Cloud identity stores. Because they are associated, Oracle Sales Cloud is automatically set up for SAML-based authentication with the JCS - SaaS Extension instance, so there is no need to provide a user account password during the web service call.

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only. The objective of this sample is only to demonstrate the goals defined above and may not represent other best practices, functional or technical.These sample code examples have not been thoroughly tested under all conditions. Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code. All sample code contained herein are provided to you AS IS without any warranties of any kind. The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

## User and Role Setup

### Setting up the Sample

1. The JCS - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) and [Security Strategies for JCS - SaaS Extension and Oracle Sales Cloud interactions](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
2. For JCS - SaaS Extension, a user with the *Java Administrator* Role to deploy an application to the JCS - SaaS Extension instance is required. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) for more details about the *Java Administrator* Role.  Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.

### Running the Sample

Create a new user or use an existing user that exists in both Oracle Sales Cloud and JCS - SaaS Extension. The role of this user in Oracle Sales Cloud could be *Sales Administrator*. There is no role logic for the user in JCS - SaaS Extension in this sample.

## Install Instructions

### JCS-SaaS Extension

1. Clone the git repository to your local working directory. You can also download the code from OTN to your local working directory and follow the same steps below. However the remaining steps will assume that you are using git. The steps below should be executed using a user as defined in User and Role Setup Setting up the Sample section above.
2. Open the .jws in JDeveloper or Eclipse. Refer to [Configuring IDEs for Developing with JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-645953AE-3C6F-40DD-AF06-03D466DEFECE) for more details about configuring JDeveloper or Eclipse. Further steps in this readme will refer to JDeveloper although similar steps can be performed in Eclipse.
3. Deploy the application (CHSApp-CHS.war) to your JCS - SaaS Extension instance. You can deploy a WAR using the same process as deploying an EAR. Refer to [Deploying Applications Individually Using JCS - SaaS Extension Control](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.
4. Obtain the WSDL endpoint of the deployed application. It should be of the format https://jcs-host/chs/CreditHealthScorePort?WSDL

### Oracle Sales Cloud

**NOTE**:  It is critical to perform all Oracle Sales Cloud development/customization work in an activated sandbox. Not only does this aid in testing and debugging, but it also greatly simplifies un-installing/rolling back sample application extensions when required. Given that all customizations will be isolated to a sandbox, it is necessary to communicate sandbox details to others so that they can interact with sample application customizations while acting in different roles.

The steps involved in rolling back Oracle Sales Cloud customizations published from sandboxes to the main code line will not be documented here.

1. Create a few Accounts in case there are none existing.
2. Log in as a user that has access to Application Composer.
3. Create or activate a sandbox as required. Refer to [Understanding Your Oracle Sales Cloud Customization and Integration Environment](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-73F02E54-38FB-4081-BD9D-4570DD26CDBD) for details.
4. In the application composer, create a new web service with the following details.
  * *Name:* CHSSoapEndpoint
  * *WSDL URL:* https://jcs-host/chs/CreditHealthScorePort?WSDL (the WSDL endpoint obtained after the deployment in JCS-SaaS Extension)
  * *Security Policy:* Select the Invoke with current user credentials using SAML security scheme.
  * Refer to [Consuming SOAP Web Services in Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-BB9C36B6-92E2-4BC3-91CD-026352F9EBF8) for more details on executing this step.
5. Create the custom CreditHealthScore field for the Account object.
6. In Application Composer, expand the Standard Objects accordion, expand the Account object accordion, and click on the Fields link.
7. Create a text field with the following attributes:
  * *Display Label:* Credit Health Score
  * *Display Width:* 30 characters
  * *Display Type:* Simple Text box
  * *Constraints:* Updateable. In addition, uncheck the checkbox "Include in Service Payload"
  * *Default Value:* Expression. Enter the Groovy script code (the code is located at <git-home>/credit-health-score-soap-saml/SalesCloud/common/Standard/Account/ServerScripts/Triggers/creditHealthScore.groovy)
8. Place the custom field on the Default Layout page:
  * Navigate to the pages area for the Account object (Standard Objects -\> Account -\> Pages), and select the Default Layout page in the Details Page Layouts section.
  * Select the Credit Health Score field and shuttle it over from the Available Fields list to the Selected Fields list.

## Running the Sample

1. Login to Oracle Sales Cloud using a user that is available on both Oracle Sales Cloud and JCS - SaaS Extension.
2. Go to Accounts, and create a new account.
3. You should be able to see a new attribute on the default page called Credit Health Score with the number provided by the remote SOAP Web Service.

## Additional information

For more details about this sample and other related samples refer to Oracle Cloud Solutions at <https://cloud.oracle.com/developer/solutions>.

## Uninstall Instructions

### JCS - SaaS Extension
Undeploy the application from JCS - SaaS Extension. Refer to the Undeploy section in [Deploying Applications Individually to JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Oracle Sales Cloud
Deactivate and delete the development sandbox. This will roll back all Oracle Sales Cloud customizations.

## Documentation
To learn how to further extend this sample, explore other implementation options, or develop your own application following a similar implementation pattern, visit the [Credit Health Score Solutions page](https://cloud.oracle.com/developer/solutions?scenarioid=1430985531355) in the [Oracle Cloud Developer Portal](https://cloud.oracle.com/developer).

## Known Issues

None


Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved
