/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
//Service Requests sub-tab

//Web Content

//Returns URL to ADF app deployed to JCS-SX

def appid = 'AccountDetails' //this is the name registered in Setup and Maintenance > Manage Third Party Applications

return "${oracle.topologyManager.client.deployedInfo.DeployedInfoProvider.getEndPoint(appid)}/faces/adf.task-flow?adf.tfDoc=/WEB-INF/main/tf-main.xml&adf.tfId=tf-main&accountNumber="+PartyId