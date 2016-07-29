#README for Sales Doc Share Sample

## Sample Name
Sales Doc Share

##Authors
Angelo Santagata, Amit Gokhru

## Source Code Location
* GitHub: https://github.com/oracle/sales-cloud-with-paas-samples
* OTN: http://www.oracle.com/technetwork/indexes/samplecode/cloud-samples-2203466.html


## Oracle Cloud Products Involved
*  Oracle Java Cloud Service - SaaS Extension
*  Oracle Sales Cloud
*  Oracle Documents Cloud Service
*  Oracle JDeveloper Cloud specific version (11.1.1.7.1)
*  Oracle Java Cloud Service - SaaS Extension SDK

NOTE: To set up and run this sample, SSO between JCS - SaaS Extension and Oracle Sales Cloud is required.


## Demonstrates

This sample demonstrates the following aspects of Oracle Cloud integration:

### Primary Goals

To demonstrate integration of Documents Cloud Service with Oracle Sales Cloud Objects for document sharing among different stakeholders. One of the most important aspects of the integration is that it respects the Oracle Sales Cloud security model and only allows uploading/downloading/viewing of documents IF, and only IF, the user has the correct privileges to access the Oracle Sales Cloud object. 

### Secondary Goals

To demonstrate easy and quick integration of Oracle Documents Cloud Service with other services and various features of Oracle Documents Cloud Service which can be leveraged in Oracle Sales Cloud.

## Functional Overview

Sales Cloud and Oracle Documents Cloud Integration Sample provides an application which integrates the Oracle Documents Cloud Service UI with Opportunity, Contacts and Account objects of Oracle Sales Cloud, and allows users to share documents associated with those objects. Users will be able to leverage all native features of the Oracle Documents Cloud Service such as upload/download of documents, in-browser previews, etc. 

## Technical Overview

This sample provide a servlet application which will be deployed into JCS - SaaS Extension and integrated with Oracle Sales Cloud. Oracle Sales Cloud will call this servlet with object-type (Opportunity / Contacts / Account), object-ID, and JWT Token. When called, the servlet will first check if the user identified by the JWT Token has access to the given object identified by object-ID by REST call to the Oracle Sales Cloud object resource, and throws an exception if the object is not accessible for the authenticated user. If the object is accessible, the servlet checks if a folder for the object exists in Oracle Documents Cloud Service and then creates an AppLink to the folder, embeded into an iFrame, and responds to the call to render the Oracle Documents Cloud Service UI in Oracle Sales Cloud. If the folder does not exist, the servlet creates a new folder and then creates the AppLink. AppLinks are created with the "contributor" role and a user will have complete access to the folder and can create, update and delete documents irrespective of the user's role on the object.

## Disclaimer

All sample code is provided by Oracle for illustrative purposes only. The objective of this sample is only to demonstrate the goals defined above and may not represent other best practices, functional or technical. These sample code examples have not been thoroughly tested under all conditions. Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code. All sample code contained herein are provided to you AS IS without any warranties of any kind. The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.

Workaround steps provided for environments which do not have SSO enabled between JCS - SaaS Extension and Oracle Sales Cloud are not secure practice.

## User and Role Setup
 - The JCS - SaaS Extension and Oracle Sales Cloud instances should be associated. Refer to [Getting a JCS - SaaS Extension Subscription](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-9C1BA413-EB5D-429C-AECA-4069995385EF) and [Security Strategies for JCS - SaaS Extension and Oracle Sales Cloud interactions](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=OCPSI-GUID-19C1D17A-195D-4CB3-AD04-0224F629165B) for more details.
 - For Oracle Sales Cloud, a user with the *Sales Administrator* Role is required. Refer to Chapter 5, "About Oracle Sales Cloud Users", in [Securing Oracle Sales Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OSCUS1288015) for details.
 - A user in Oracle Documents Cloud Service is required for calling the REST API.
 - A user for Oracle Sales Cloud usage is required. 
 - User with *Java Administrator* Role in JCS - SaaS Extension is required for deployment and credential creation. Refer to Chapter 7, "Managing Users and Roles" in [Getting Started with Oracle Cloud](http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSGSG166) for more details on creating users.
 - A user with Identity Domain Credential is required to run JCS - SaaS Extension SDK commands.

## Install Instructions

Sample set-up requires deployment of the application, configuration on Oracle Sales Cloud and Oracle Documents Cloud. Details are as explained below

### JCS - SaaS Extension Application
	1. Clone the git repository to your local working directory. You can also download the code from OTN to your local working directory and follow the same steps below. The steps below should be executed using a user as defined in User and Role Setup Setting up the Sample section above.
	2. Open the "sales-doc-share.jws" project in Jdeveloper.
	3. Configure the required configuration properties:
		a. When SSO between JCS - SaaS Extension and Oracle Sales Cloud is enabled, create credentials in the CSF Store of JCS - SaaS Extension for an Oracle Documents Cloud Service user name and password by running the following command:
			i. javacloud -dc <data_center> -id <id-domain> -u <jcssx username> -si <jcssx-instance-name> -set-credential -map "user.custom.map" -key "DOCCS_USER_KEY" -keyuser <DOCCS username>
			ii. Add the following additional configuration parameters to the properties file at [APP_HOME]\sales-doc-share\public_html\WEB-INF\properties\config.properties:
				* docCloudServerHostname = [Oracle Documents Cloud Service Host, such as https://[server_name:port, https://[server_name]]]
				* docCloudServerRole =  [Oracle Documents Cloud Service Role for AppLink]
				* salesCloudServerHostname = [Oracle Sales Cloud Host, such as https://[CRM_server_name:port, https://[CRM_server_name]]]
				* salesCloudIntegrationFolder = SALESCLOUDINTEGRATION
			For more information about the javacloud command, see:
				http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSJSU7165
				http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSJSU7242
		b. For an environment where SSO between JCS - SaaS Extension and Oracle Sales Cloud is not enabled:
			i. Change the configuration properties at [APP_HOME]\sales-doc-share\public_html\WEB-INF\properties\config.properties
				* docCloudUsername = [Oracle Documents Cloud Service user used to call REST API]
				* docCloudPassword = [Password for Oracle Documents Cloud Service user]
				* docCloudServerHostname = [Oracle Documents Cloud Service Host, such as https://[server_name:port, https://[server_name]]]
				* docCloudServerRole =  [Oracle Documents Cloud Service Role for AppLink]
				* salesCloudServerHostname = [Oracle Sales Cloud Host, such as https://[CRM_server_name:port, https://[CRM_server_name]]]
				* salesCloudIntegrationFolder = SALESCLOUDINTEGRATION
			ii. Update the web.xml to comment the security configuration
				<security-constraint>
					<display-name>DocCloudServlet-SecConstraint</display-name>
					<web-resource-collection>
						<web-resource-name>DocCloudServlet-SecConstraint</web-resource-name>
						<url-pattern>/*</url-pattern>
					</web-resource-collection>
				</security-constraint>
				<login-config>
					<auth-method>CLIENT-CERT</auth-method>
					<realm-name>default</realm-name>
				</login-config>

	4. Set the library path to point to the correct path. Right-click Project name "sales-doc-share" and select Project Properties, then Libraries and Classpath.
	5. Generate the WAR file. Right-click Project name "sales-doc-share" and select Deploy, then sales-doc-share, then Deploy to War, then Next, and then Finish.
	The WAR file will be available at [APP_HOME]\sales-doc-share\deploy
	6. To build using Maven:
		a. Add an Oracle Maven Repository to your project: see http://www.oracle.com/pls/topic/lookup?ctx=fmw121300&id=MAVEN9013
		b. mvn clean;
		c. mvn install [WAR file will be available at [APP_HOME]\sales-doc-share\target]
	7. Log in to My Services, access your JCS - SaaS Extension instance, and under "Applications", click "Deploy New" to deploy the WAR file.
	8. On SSO-enabled environments, assign the UserMapAccessRole role to Oracle Sales Cloud users to provide access to CSF credentials:
		a. Create the new role using the Identity Management Console:
			i. Go to the MyServices application supplied with your JCS - SaaS Extension account and click Security.
			ii. Click the Customer Roles tab to open the page and then click Add. The Add Custom Role dialog appears.
			iii. In the Add Custom Role dialog, enter the Role Name UserMapAccessRole, along with a Display Name and, optionally, a short Description of the role. Then click Add. The new role, UserMapAccessRole appears on the Custom Role list.
		b. Assign the new role to one or more users:
			i. Click the Users tab to go back to the Users list.  
			ii. Click the Menu icon associated with the user to whom you want to assign the custom role.
			iii. From the drop down menu, select Manage Roles. The Manage Roles dialog for that user appears.
			iv. From Available Roles, move the custom role created in step 8a (it will be listed by its Display Name) to the Assigned Roles list and click Save.
		
### Oracle Sales Cloud Configuration

	1. Log in to Oracle Sales Cloud with an Admin user and navigate to "Setup and Maintenance" using the Navigator menu.
	2. Under Tasks, select Topology Objects and click "Manage Third Party Applications."
	3. Create a new application by clicking the "Create" button and enter the following details: 
		* Application Name  = "sales-doc-share"
		* Full URL = "https://[JCS_SX-SERVER]/sales-doc-share/doccloud"
		* Partner Name = "sales-doc-share"
	4. Save and Close.
	5. Open a new Sandbox: Click your username on the top right of the screen and then select "manage sandboxes" 
		* For more information about Oracle Sales Cloud sandboxes, see:  [http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=OACEX1606989]
	6. Create a new sandbox and enable it, and then close. 
	7. Open the application composer: using the Navigator menu, navigate to "Tools" and then click "Application Composer."
	8. Select "Application" = Sales and click on "Opportunity" under "Objects" > "Standard Object" (Note: these steps are for an Opportunity, but the same steps can be used for Contacts and Accounts Objects.)
	9. Select Pages under "Opportunity" and Edit "Default Layout" for the Details page.
	10. Create a new tab by selecting the green + at the bottom of the subtab stack.
	11. Select "Web Content" as the subtab type.
	12. Enter Display Name = "Documents" 
	13. For SSO enabled environments:
			For Opportunity 
				def jwt= (new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()) ;
				def docCloudIntegrationURL = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint("sales-doc-share" );
				def url=docCloudIntegrationURL+"?objectnumber="+OptyNumber+"&objecttype=OPPORTUNITY&jwt="+jwt;
				return url;
			For Contacts
				def jwt= (new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()) ;
				def docCloudIntegrationURL = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint("sales-doc-share" );
				def url=docCloudIntegrationURL+"?objectnumber="+PartyNumber+"&objecttype=CONTACT&jwt="+jwt;
				return url;
			For Accounts
				def jwt= (new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()) ;
				def docCloudIntegrationURL = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint("sales-doc-share" );
				def url=docCloudIntegrationURL+"?objectnumber="+PartyNumber+"&objecttype=ACCOUNT&jwt="+jwt;
				return url;	
		For non-SSO environments:
			For Opportunity 
				def jwt= (new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()) ;
				def username = adf.context.getSecurityContext().getUserName();
				def docCloudIntegrationURL = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint("sales-doc-share" );
				def url=docCloudIntegrationURL+"?objectnumber="+OptyNumber+"&objecttype=OPPORTUNITY&jwt="+jwt+"&username="+username;
				return url;
			For Contacts
				def jwt= (new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()) ;
				def username = adf.context.getSecurityContext().getUserName();
				def docCloudIntegrationURL = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint("sales-doc-share" );
				def url=docCloudIntegrationURL+"?objectnumber="+PartyNumber+"&objecttype=CONTACT&jwt="+jwt+"&username="+username;
				return url;
			For Accounts
				def jwt= (new oracle.apps.fnd.applcore.common.SecuredTokenBean().getTrustToken()) ;
				def username = adf.context.getSecurityContext().getUserName();
				def docCloudIntegrationURL = oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint("sales-doc-share" );
				def url=docCloudIntegrationURL+"?objectnumber="+PartyNumber+"&objecttype=ACCOUNT&jwt="+jwt+"&username="+username;
				return url;
		**Please note to use same Application Name as given in step #3 above in getEndpoint function.
	14. Save and close.
	15. Repeat steps 7 through 15 for Accounts and Contacts.

### Oracle Documents Cloud Service Configuration

	1. Log in to Oracle Documents Cloud Service using the same user created for Oracle Sales Cloud. This user owns the root-folder in which all Oracle Sales Cloud Documents will be stored.
	2. Create a folder in the root called SALESCLOUDINTEGRATION
		a. The directory name can be changed by modifying the salesCloudIntegrationFolder property in the config.properties file
	3. Within the SALESCLOUDINTEGRATION folder create three sub-folders named
		a. CONTACT
		b. OPPORTUNITY
		c. ACCOUNT
	
## Running the Sample

	1. Log in to Oracle Sales Cloud as a Sales Rep with access to an Opportunity.
	2. Navigate to the Opportunity.
	3. In the sub-tab bar, click the Documents tab.
	
Follow similar steps for Accounts and Contacts.

## Additional information

For more details about this sample and other related samples refer to Oracle Cloud Solutions at <https://cloud.oracle.com/developer/solutions>

## Uninstall Instructions

### JCS - SaaS Extension
Undeploy the application from JCS - SaaS Extension.  Refer to the Undeploy section in [Deploying Applications Individually to JCS - SaaS Extension](http://www.oracle.com/pls/topic/lookup?ctx=clouddevportal&id=GUID-8C5519F9-FB34-4D13-B313-BF0C7230A339) for more details.

### Oracle Sales Cloud
To remove changes from Oracle Sales Cloud:
	1. Delete the sandbox.
	2. Under Tasks, select Topology Objects and then click "Manage Third Party Applications."
	3. Remove the application "sales-doc-share"
	
	
## Troubleshooting
	* If a third party application is deployed on the local server and accessed using HTTP for testing purposes, the browser will give a warning about the page containing both secure and non-secure content. This can be fixed by enabling mixed content in the browser.
	* java.lang.Throwable: java.lang.NoClassDefFoundError: com/sun/jersey/api/client/UniformInterfaceException - This issue may come if you have conflicting jersey library already deployed in your JCS-SX. Please make sure to have same version in your application's library path.
	* com.sun.jersey.api.client.ClientHandlerException: java.security.AccessControlException: access denied ("java.net.SocketPermission" "host-on-the-internet:443" "connect,resolve") Please refer - https://docs.oracle.com/cloud/latest/javacs_gs/CSJSU/GUID-CE1E3A8A-8828-4591-BFC0-91699A4E4D63.htm#CSJSU-GUID-CE1E3A8A-8828-4591-BFC0-91699A4E4D63
	
## Known Issues

    1. This sample code does not authenticate the JWT Token received from Oracle Sales Cloud by the Servlet Application running on JCS - SaaS Extension. As a good design and security practice, third-party cloud applications must enforce proper security measures. For more information, see:  http://www.oracle.com/pls/topic/lookup?ctx=cloud&id=CSAPP7107
    2. AppLinks are created with the "contributor" role for all applications. This will allow users to modify documents even if they have read-only access to the object (Opportunity). 

Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved
