# Example Sales Cloud Contact Center Toolbar Javascript Connector #
v2014-05-14

This is a *sample* Oracle Sales Cloud (Fusion CRM) Contact Center Toolbar connector that provides an example skeleton of implementation the comm_connector interface as described by the "Oracle Fusion Contact Center Connector Specification" available from support.oracle.com (Doc ID 1495154.1).

No transport protocol is implemented in this sample. The sample only demonstrates the success case for the Toolbar commands and events. 

The sample supports Oracle Sales Cloud Release 8 and above.

## Deployment and usage ##

To deploy the Example Connector to an Oracle Sales Cloud instance. First, ensure that the Contact Center Toolbar is enabled on the Sales Cloud instance. Login as a user with Sales Administrator privileges.

- In Oracle Sales Cloud Setup and Maintenance got to the **Manage Contact Center Profile Options** Task and ensure that `ZCC_ENABLE_EH_CLICK_TO_DIAL` is enabled.

To add the Example Connector
 
-  In Setup and Maintenance go to the **Manage Communication Connectors** Task and create a new **Connector** configuration called `Example Connector` 

- Set the **Javascript location** to point to `ExampleConnector.js` file. Note that the javascript *must* be served from a *https://* server visible to the Sales Cloud instance. e.g. `https://hostname:port/ExampleConnector.js`

- Optionally, create a new Connector Type called `Example Connector Type` and add an **Agent Connector Parameter** called `agentNumber`.  Go back to the Connectors tab and set the Connector Type for the `ExampleConnector` to `Example Connector Type`.  
		
To use the Connector. Login as a Sales User and navigate to either the Customers or Opportunities page.  

- Click on the Toolbar **Connect** icons and select the `Example Connector` from the list of Connectors, optionally set any customer values for the Agent Connector Parameters if configured. Click Ok to Connect.

To configure the required Break Codes in Sales Cloud Go to Setup and Maintenance and select the **Manage Standard Lookups** Task an edit the Lookup Type `ZCC_USER_BREAK_REASONS` to match the Break Reasons in the Example Connector

    | MEANING              | LOOKUP CODE |
    +----------------------+-------------+
    | On Break             | 6001        |
    | Morning Coffee Break | 6002        |
    | Lunch Break          | 6003        |
    | Afternoon Tea Break  | 6004        |
    | Break Dancing        | 6005        |


### To make an outbound click-to-dial call ###

Click a Contacts phone number in Sales Cloud. The Example Connector will simulate an outbound call.

### To make an inbound call ###

The Example Connector implementation includes a sample method to simulate an inbound call. From the browsers Javascript console (Ctrl-Shift-J) enter

    inboundCall("15551234567", "18881234567")

### To make an inbound chat ###

The Example Connector implementation includes a sample method to start an inbound chat session. From the browsers Javascript console (Ctrl-Shift-J) enter

    inboundChat("john@doe.com")

And to simulate an incoming chat message

    inboundMessage("Hello")


### To lookup the Interaction Object in Sales Cloud for a Call or Chat ###

The Interaction Object created by the Contact Center Toolbar can be retrieved using the Sales Cloud Web Services APIs.  And example method is provided to lookup the Intereaction by the Call Id provided as the `MCT_MEDIA_ITEM_ID` when establishing a call or chat session.  To invoke the Sales Cloud web services APIs from the Connector Javascript the JWT session token must be enabled. 

In Edit the Sales Cloud Global Template and add the following HTML with Expression Language

    <script>var jwtToken="#{applCoreSecuredToken.trustToken}";</script>

To use the example method to find an Interaction, from the Javascript console

	findInteraction("1001");

Note: the example connector always uses 1001 as the Call ID for outbound calls, in a real implementation the Call Id should be unique.


