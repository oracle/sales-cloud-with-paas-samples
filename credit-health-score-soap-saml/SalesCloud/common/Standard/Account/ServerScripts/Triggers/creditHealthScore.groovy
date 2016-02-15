/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */

def name = nvl(OrganizationName,"ABC")
def chs = adf.webServices.CHSSoapEndpoint.getCreditHealthScore(name)
return chs + ' (on a scale of 10)'