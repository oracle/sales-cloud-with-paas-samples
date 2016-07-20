# Changes #
v2014-05-14

## Changes from Sales Cloud Release 7 to Release 8

When migrating a Contact Center Connector implementation from Sales Cloud Release 7 to Release 8 the following API changes are required.  For full details see the "Oracle Fusion Contact Center Connector Specification" available from support.oracle.com (Doc ID 1495154.1).

* Command and Event field name changes
 * CallId -> **MCT_MEDIA_ITEM_ID**
 * ANI -> **MCT_ANI**
 * DNIS -> **MCT_DNIS**
 * InteractionType -> **MCT_INTERACTION_TYPE**
 * Media -> **MCT_MEDIA_TYPE**
* New attribute **UseFusionChat** in "AgentLoggedOn" event
* New ** BreakReasonCd** parameter on AgentNotReady event
* Removed **ReasonCode** parameter from AgentNotReady event
* Removed **usid** from Basic Event Structure (removed from all events)
* Changed Command operation SetReady -> **MakeReady**
* Changed Command operation SetNotReady -> **MakeNotReady**
* New **GetConnectorCapability** command operation and **AgentConnectorCapability** event
* New **GetBreakReasons** command operation and **BreakReasons** event
* New **SetFocalInteraction** command operation
* New **Send** command operation (for Chat)
* New **RequestTranscript** command operation
* Call direction "Out" -> **OUTBOUND**
* Call direction "in" -> **INBOUND**
* New **Delivered** event attributes `MCT_DISPLAY_STRING`, `MCT_PHONE_NUMBER`, `MCT_EMAIL`
* JSPassword -> ZccTbMain.JSPassword


