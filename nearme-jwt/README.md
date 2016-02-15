#README for Oracle Cloud -- PaaS for SaaS Sample

## Sample Name
NearMe JWT

## Author
Bill Jacobs, Oracle A-Team

## Source Code Location
* GitHub: [https://github.com/oracle/sales-cloud-with-paas-samples](https://github.com/oracle/sales-cloud-with-paas-samples)
* OTN: [http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html](http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html)

## Oracle Cloud Products Involved
* Oracle Java Cloud Service - SaaS Extension
* Oracle Sales Cloud
* Oracle JDeveloper Cloud specific version (11.1.1.7.1 or higher) / Oracle Enterprise pack for Eclipse available at [this](http://www.oracle.com/technetwork/topics/cloud/downloads/index.html) location on OTN

## Demonstrates
This sample demonstrates the following aspects of Oracle Cloud integration:

### Primary Goals

*  Passing a JSON Web Token (JWT) from Oracle Sales Cloud to an application deployed on JCS - SaaS Extension, which in turn uses the JWT to make authenticated web service requests back into Oracle Sales Cloud
*  Embedding a Java Application in Oracle Sales Cloud
*  Role-based access to the embedded Java application

### Secondary Goals

*  Passing context-specific parameters (in addition to passing the JWT) in the dynamic URL generated in Oracle Sales Cloud for the JCS - SaaS Extension application
*  Incorporating the FUSE UI via CSS

## Functional Overview

After it is installed and configured, a user logged in to Oracle Sales Cloud accesses the NearMeJWT application by navigating to an existing account details page and then clicking on the NearMeJWT sub-tab.  The user will need to have the Sales Administrator role in order to gain access to the sub-tab.  After clicking on the sub-tab, any accounts that have locations within 15 miles of the active account will be listed.  If there are no accounts within 15 miles, a message will be displayed to that effect.  Finally, if the active account does not have a valid address or if the latitude and longitude attributes have not been populated, an informational message will be displayed.

## Technical Overview

This application, consisting of a Oracle Sales Cloud AccountService web service proxy with business logic in the model layer and a one page display view that takes advantage of FUSE cascading style sheets (CSS), receives Oracle Sales Cloud account context parameters (account id, account latitude, and account longitude) as well as a generated JWT in the URL when a logged-in user selects an account sub-tab in Oracle Sales Cloud.  On the ADF side, a Java bean-based facade object uses the account location parameters passed in the URL to build a view criteria that calls into the Oracle Sales Cloud AccountService, returning all accounts (based on logged-in user) that are located within approximately 15 miles of the currently open account.  The view criteria also filters out the currently open account from the list, as that would just represent extraneous noise.

If there are no accounts in the vicinity, an empty table will be returned along with a "no accounts nearby" status message.  If the open or active account does not have address information in the form of latitude and longitude, an appropriate error message will display.

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only. The objective of this sample is only to demonstrate the goals defined above and may not represent other best practices, functional or technical.These sample code examples have not been thoroughly tested under all conditions. Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code. All sample code contained herein are provided to you AS IS without any warranties of any kind. The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

## User and Role Setup

### Setting up the Sample

1. The JCS - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) and [Security Strategies for JCS - SaaS Extension and Oracle Sales Cloud interactions](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
2. For JCS - SaaS Extension, a user with the *Java Administrator* Role to deploy an application to the JCS - SaaS Extension instance is required. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) for more details about the *Java Administrator* Role.  Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.
3. For Oracle Sales Cloud, a user in Oracle Sales Cloud with appropriate roles to access Oracle Sales Cloud Application Composer is required.  For this application, the *Sales Administrator* role is a good fit.  Refer to Chapter 5, "About Oracle Sales Cloud Users", in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OSCUS1288015) for details.

### Running the Sample
1. Oracle Sales Cloud:  To test the application, a user with the appropriate functional roles, and who also has access to development sandboxes, is required.  The easiest way to meet this requirement is to create a sample application test user who has the *Sales Administrator* role.  The NearMeJWT application also uses the *Sales Administrator* role as an example to demonstrate how to limit access to the NearMeJWT sub-tab to a specific role in Oracle Sales Cloud.  There is nothing preventing the addition of other roles (e.g. Sales Manager) to this filter.  (The filter itself is used to selectively display a customized detail page layout -- see below for details.)
2. JCS - SaaS Extension:  A user account with a user ID identical to the logged-in Oracle Sales Cloud user's user ID is required.  There is no role logic for the user in JCS - SaaS Extension in this sample. 

## Install Instructions

### JCS - SaaS Extension

1. Clone the git repository to your local working directory. You can also download the code from OTN to your local working directory and follow the same steps below. However the remaining steps will assume that you are using git.
2. In order to comply with security requirements, all references to Oracle Sales Cloud web service endpoint URLs in the web service proxy classes have been replaced with a placeholder element, "salescloud-hostname".  In order to resolve proxy URLs correctly and to guarantee consistency between web service proxy classes, it is necessary to recreate all proxy classes.  Refer to Regenerate a Web Service Proxy section in [Using ADF Web Service Proxies](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-461B3CA6-D3C1-4C8A-95A5-D172CEABDD64) for detailed instructions on performing this action.  For this application, the proxy file is located in the /oracle/cloud/sampleapps/nearmejwt/proxy folder in the AccountService project.
3.  ADF applications are automatically configured for framebusting to prevent other applications from embedding them. This measure is normally used to ensure the correct formatting and to prevent click-jacking. Since we require embedding in this special Oracle Cloud to Oracle Cloud extension use case, the ADF Application should be manually configured to disable Framebusting (refer to Known Issues for more details).  In the IDE, open the file web.xml under ViewController>Web Content>WEB-INF. Click on the Source tab. At the end of the last context-param XML tag and before the beginning of the filter XML tag, paste the following code:

        <context-param>
          <!-- Setting FRAME_BUSTING to NEVER avoids this error - Refused to display 'http://...' in a frame because it set 'X-Frame-Options' to 'sameorigin'-->
          <description> Security precaution to prevent clickjacking - bust frames if the ancestor window domain (protocol, host, and port) and the frame domain are different. Options for this parameter are always and never.</description>
                <param-name>org.apache.myfaces.trinidad.security.FRAME_BUSTING</param-name>
                <param-value>never</param-value>
        </context-param>

Use the application-level deployment profile entitled "NearMeJWT-cloud" to deploy to either an ear file or directly to a JCS - SaaS Extension cloud instance.  Refer to [Deploying Applications Individually Using JCS - SaaS Extension Control](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for general deployment instructions to JCS - SaaS Extension.

### Oracle Sales Cloud

**NOTE**:  It is critical to perform all Oracle Sales Cloud development/customization work in an activated sandbox.  Not only does this aid in testing and debugging, but it also greatly simplifies un-installing/rolling back sample application extensions when required.  Given that all customizations will be isolated to a sandbox, it is necessary to communicate sandbox details to others so that they can interact with sample application customizations while acting in different roles.

The steps involved in rolling back Oracle Sales Cloud customizations published from sandboxes to the main code line will not be documented here.

Following are the steps necessary to add the NearMeJWT sub-tab to the Account object in Oracle Sales Cloud:

1. Log in as a customization user with access to Application Composer.  Create or activate a sandbox as required.  Refer to [Understanding the Basics of Oracle Sales Cloud Customization and Integration Features](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=GUID-73F02E54-38FB-4081-BD9D-4570DD26CDBD) for details.
2. Before extending the application in Application Composer, it is necessary to register a third party application that points to the JCS - SaaS Extension instance on which the NearMeJWT is deployed.  Refer to [Creating a Third Party Application](http://www.oracle.com/pls/topic/lookup?ctx=cloud132&id=OACEX1683514) for more details.  (Note that one of the following roles is required to access this setup task:  Application Implementation Consultant, Application Administrator, or Application Developer.)  Make note of the application name for future reference in Application Composer.  The name "NearMeJWTApp" is used in the script below; the third party application name and the name referenced in the script have to be a case-sensitive match.  Values required for the third party application (the application will parse protocol, host, port, and context root values from the full URL):
    1. Application Name:  NearMeJWTApp
    2. Full URL:  https://<JCS-SX-hostname>:port/NearMeJWT/faces/acctlist
    3. Partner Name:  use to record any tracking details as needed
3. Open Application Composer (Home -> Tools Icon -> Application Composer).
4. Select the Common application container to gain access to the Account object.
5. Navigate to the pages area for the Account object (Standard Objects -> Account -> Pages), and select the Default Layout page in the Details Page Layouts section.  Duplicate this layout and give it a meaningful name, such as Sales Rep Layout.  Save and close the layout, and in the drop-down Role for the layout select *Sales Administrator* Duty.  For details on custom page layouts, see "Page Customization" in [Oracle Sales Cloud Customizing Sales](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OACEX1718276).
6. Select the newly-created Sales Rep Layout and open it for editing.  Add a Web content sub-tab, give it a display label of "Nearby Accounts," add a description, and select an appropriate icon.  Refer to [Embedding a JCS - SaaS Extension Application as an Object Subtab](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-7236D50B-C1F6-44E3-BDB6-9D5810EABC7C) for details on adding a sub-tab to a Oracle Sales Cloud page.
7. Add the following script to generate the dynamic URL, substituting values for the third party application name applied in step #2 above:
```
println 'Entering Nearby Accounts subtab dynamic URL script'
def nearMeJWTAppUrl = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint('NearMeJWTApp')
def jwt = new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()
def acctid = PartyId
def url = nearMeJWTAppUrl +
          '?acctid=' + acctid +
          '&jwt=' + jwt
if (PartySite) {
    def addrs = PartySite
    def primaryAddr = addrs.next()
    def latitude = nvl(primaryAddr?.Latitude, '')
    def longitude = nvl(primaryAddr?.Longitude, '')
    url = url +
          '&lat=' + latitude +
          '&long=' + longitude
}
println 'URL = ' + url
return url
```
8. Validate the script, Save and Close the sub-tab editing screen, and test with new and existing accounts in the sandbox.

After the sub-tab components have been added to Oracle Sales Cloud using Application Composer, it may be necessary to manually run the "Populate Location Latitude and Longitude Information" process.  In a production environment where account addresses are added or edited often, Oracle recommends scheduling this process to run regularly so that the geo-spatial elements upon which this application depends are populated accurately.  More information, including in-depth tutorials, on running and scheduling this process is available in the Oracle Sales Cloud online help (search on the term "Scheduled Processes" in the Oracle Sales Cloud Help Portal).

To run the process manually, follow these steps:

1. Open the "Scheduled Processes" management page (Home -> Tools -> Scheduled Processes).  If this action is not available from the Navigator, it may be necessary to access the action through the "Setup and Maintenance" management page.
2. Click on the *Schedule New Process* button.
3. In the popup dialog box, click the Name dropdown, and then click the "Search..." link at the bottom of the list.
4. Enter "Populate Location Latitude and Longitude" in the Name input field and click the "Search" button.
5. Select the returned row and click the "OK" button.
6. Click the "OK" button in the "Schedule New Process" dialog box.
7. In the "Process Details" dialog box, enter "US" in the Country Code input field, and click the "Submit" button.
8. Click the "OK" button in the "Confirmation" message box.
9. Click the "Close" button in the "Process Details" dialog box.
10. Click the Refresh icon in the main "Scheduled Processes" page to monitor progress of the process.

## Running the Sample

1. Launch Oracle Sales Cloud and log in as a user with the Sales Representative role, or whatever role was used to set up the custom detail page layout for the account object.
2. Navigate to the Accounts listing and select an account that may be in the vicinity (within 15 miles) of other accounts that have been created in the system.
3. Navigate to the Details page for the account and select the sub-tab set up to display the NearMe application.  If accounts do exist that have addresses within 15 miles of the active (selected) account, the NearMe application will display those accounts.  If no accounts exist, a message will be displayed to that effect.
4. When creating new accounts with valid addresses, there may be some delay in the population of the location (latitude and longitude) attributes.  Refer to the note above on the "Populate Location Latitude and Longitude Information" scheduled process.

## Additional information
For more details about this sample and other related samples, refer to Oracle Cloud Solutions at <https://cloud.oracle.com/developer/solutions>.

## Uninstall Instructions

### JCS - SaaS Extension
Undeploy the application from JCS - SaaS Extension.  Refer to the Undeploy section in [Deploying Applications Individually to JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Sales Cloud
Deactivate and delete the development sandbox.  This will roll back all Oracle Sales Cloud customizations.

## Documentation
To learn how to further extend this sample, explore other implementation options, or develop your own application following a similar implementation pattern, visit the [NearMe Solutions page](https://cloud.oracle.com/developer/solutions?scenarioid=1383852819711) in the [Oracle Cloud Developer Portal](https://cloud.oracle.com/developer).

## Known Issues
| # | Issue | Workaround |
| - | ------ | ---------- |
| 1 | Latitude and Longitude do not have values for account locations. | Make sure the process to populate latitudes and longitudes is scheduled to run periodically, or, run the process manually. |
| 2 | Checking for a valid JWT | In the sample application a complete check for a valid JWT is never performed, although there is a placeholder for it.  In a production situation this logic will need to be added. |
| 3 | ADF applications are automatically configured for framebusting to prevent other applications from embedding them. This measure is normally used to ensure the correct formatting and to prevent click-jacking. Since in this special Oracle Cloud to Oracle Cloud extension use case, we require embedding, the ADF Application should be manually configured to disable Framebusting. | Oracle will provide automated mechanisms for ensuring that framebusting is automatically disabled only for Oracle Cloud-Oracle Cloud interactions. Until then, please apply the workaround mentioned in the install steps. Note: Ensure that you always protect your ADF application for authentication |



Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved
