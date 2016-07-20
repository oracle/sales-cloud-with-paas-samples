using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Channels;
using FusionApplicationAccelerator;
using System.ServiceModel;
using FusionApplicationAccelerator.OpportunityServiceReference;
using FusionApplicationAccelerator.PersonServiceReference;
using FusionApplicationAccelerator.ActivityServiceReference;
using FusionApplicationAccelerator.ServiceCatalogServiceReference;
using FusionApplicationAccelerator.UserDetailsServiceReference;
using System.Web.Services.Description;
using System.Xml.Schema;
using System.Net;

/// This namespace contains sample on how to call the library containing clients used to call FA services
namespace FusionApplicationAcceleratorTester
{
    /// <summary>
    /// Class used to test the library containing clients used to call FA services
    /// </summary>
    class Tester
    {
        static string userName = "username";
        static string password = "password";
        static void Main(string[] args)
        {
            try
            {
                TestActivityService();
            }
            catch (Exception e)
            {
                Console.WriteLine("TestActivityService() exception = " + e.Message);
            }
            try
            {
                TestOpportunityService();
            }
            catch (Exception e)
            {
                Console.WriteLine("TestOpportunityService() exception = " + e.Message);
            }
            try
            {
                TestPersonService();
            }
            catch (Exception e)
            {
                Console.WriteLine("TestPersonService() exception = " + e.Message);
            }
            try
            {
                TestUserDetailsService();
            }
            catch (Exception e)
            {
                Console.WriteLine("TestUserDetailsService() exception = " + e.Message);
            }
            try
            {
                TestServiceCatalogService();
            }
            catch (Exception e)
            {
                Console.WriteLine("TestServiceCatalogService() exception = " + e.Message);
            }
            try
            {
                TestFaServiceHelper();
            }
            catch (Exception e)
            {
                Console.WriteLine("TestServiceCatalogService() exception = " + e.Message);
            }
        }

        /// <summary>
        /// Tests a call to Activity Service
        /// </summary>
        static void TestActivityService()
        {
            Console.WriteLine("TestActivityService");
            System.ServiceModel.Channels.Binding binding = FaBindingFactory.GetUsernameTokenOverSslBinding();
            EndpointAddress endpointAddress = new EndpointAddress(new Uri("Url to the service"));
            ActivityServiceClient client = FaServiceFactory.GetActivityServiceClient(binding, endpointAddress, new NetworkCredential(userName, password));
            FusionApplicationAccelerator.ActivityServiceReference.FindCriteria findCriteria = new FusionApplicationAccelerator.ActivityServiceReference.FindCriteria();
            findCriteria.fetchSize = 2;
            findCriteria.fetchStart = 0;
            string[] findAttributes = new string[1] { "ActivityId" };
            findCriteria.findAttribute = findAttributes;

            FusionApplicationAccelerator.ActivityServiceReference.FindControl findControl = new FusionApplicationAccelerator.ActivityServiceReference.FindControl();
            Activity[] result = client.findActivity(findCriteria, findControl);
            if (null != result && result.Length > 0)
            {
                foreach (Activity activity in result)
                {
                    Console.WriteLine("  activity = " + activity.ActivityId);
                }
            }
            else
            {
                if (null == result)
                {
                    Console.WriteLine("  activity null ");
                }
                else
                {
                    Console.WriteLine("  activity empty ");
                }
            }
        }

        /// <summary>
        /// Tests a call to Opportunity Service
        /// </summary>
        static void TestOpportunityService()
        {
            Console.WriteLine("TestOpportunityService");
            System.ServiceModel.Channels.Binding binding = FaBindingFactory.GetUsernameTokenOverSslBinding();
            EndpointAddress endpointAddress = new EndpointAddress(new Uri("Url to the service"));
            OpportunityServiceClient opportunityServiceClient = FaServiceFactory.GetOpportunityServiceClient(binding, endpointAddress, new NetworkCredential(userName, password));
            FusionApplicationAccelerator.OpportunityServiceReference.FindCriteria findCriteria = new FusionApplicationAccelerator.OpportunityServiceReference.FindCriteria();
            findCriteria.fetchSize = 2;
            findCriteria.fetchStart = 0;

            string[] findAttributes = new string[2] { "OptyId", "CustomerAccountId" };
            findCriteria.findAttribute = findAttributes;

            FusionApplicationAccelerator.OpportunityServiceReference.FindControl findControl = new FusionApplicationAccelerator.OpportunityServiceReference.FindControl();
            Opportunity[] result = opportunityServiceClient.findOpportunity(findCriteria, findControl);
            if (null != result && result.Length > 0)
            {
                foreach (Opportunity opportunity in result)
                {
                    Console.WriteLine("  OptyId = " + opportunity.OptyId);
                }
            }
            else
            {
                if (null == result)
                {
                    Console.WriteLine("  result null ");
                }
                else
                {
                    Console.WriteLine("  result empty ");
                }
            }
        }
        /// <summary>
        /// Tests a call to Person Service
        /// </summary>
        static void TestPersonService()
        {
            Console.WriteLine("TestPersonService");
            System.ServiceModel.Channels.Binding binding = FaBindingFactory.GetUsernameTokenOverSslBinding();
            EndpointAddress endpointAddress = new EndpointAddress(new Uri("Url to the service"));
            PersonServiceClient client = FaServiceFactory.GetPersonServiceClient(binding, endpointAddress, new NetworkCredential(userName, password));
            FusionApplicationAccelerator.PersonServiceReference.FindCriteria findCriteria = new FusionApplicationAccelerator.PersonServiceReference.FindCriteria();
            findCriteria.fetchSize = 2;
            findCriteria.fetchStart = 0;
            string[] findAttributes = new string[2] { "PartyName", "PersonProfile" };
            findCriteria.findAttribute = findAttributes;

            FusionApplicationAccelerator.PersonServiceReference.FindControl findControl = new FusionApplicationAccelerator.PersonServiceReference.FindControl();
            FusionApplicationAccelerator.PersonServiceReference.PersonResult result = client.findPerson(findCriteria, findControl);
            if (null != result)
            {
                FusionApplicationAccelerator.PersonServiceReference.Person[] persons = result.Value;
                if (null == persons)
                {
                    Console.WriteLine("  Persons is null ");
                }
                else
                {
                    Console.WriteLine("  Persons count = " + persons.Length);
                    foreach (FusionApplicationAccelerator.PersonServiceReference.Person person in persons)
                    {
                        Console.WriteLine("  Person = " + person.PartyName);
                    }
                }

            }
            else
            {
                Console.WriteLine("  result null ");
            }
        }
        /// <summary>
        /// Tests a call to User Details Service
        /// </summary>
        static void TestUserDetailsService()
        {
            Console.WriteLine("TestUserDetailsService");
            System.ServiceModel.Channels.Binding binding = FaBindingFactory.GetUsernameTokenOverSslBinding();
            EndpointAddress endpointAddress = new EndpointAddress(new Uri("Url to the service"));
            UserDetailsServiceClient client = FaServiceFactory.GetUserDetailsServiceClient(binding, endpointAddress, new NetworkCredential(userName, password));

            UserDetailsResult result = client.findSelfUserDetails();
            if (null != result)
            {
                UserDetails[] userDetails = result.Value;
                if (null != userDetails)
                {
                    foreach (UserDetails userDetail in userDetails)
                    {
                        Console.WriteLine("  Person id = " + userDetail.PersonId);
                    }
                }
            }
            else
            {
                Console.WriteLine("  result null ");
            }
        }

        /// <summary>
        /// Tests a call to Service Catalog Service
        /// </summary>
        static void TestServiceCatalogService()
        {
            Console.WriteLine("TestServiceCatalogService");
            System.ServiceModel.Channels.Binding binding = FaBindingFactory.GetUsernameTokenBinding();
            EndpointAddress endpointAddress = new EndpointAddress(new Uri("Url to the service"));
            ServiceCatalogServiceClient client = FaServiceFactory.GetServiceCatalogServiceClient(binding, endpointAddress, new NetworkCredential(userName, password));
            CatalogService[] result = client.getAllServiceEndPoints();
            if (null != result && result.Length > 0)
            {
                Console.WriteLine("  result.Length = " + result.Length);
            }
            else
            {
                if (null == result)
                {
                    Console.WriteLine("  result null ");
                }
                else
                {
                    Console.WriteLine("  result empty ");
                }
            }
        }

        /// <summary>
        /// Tests a call to Service Helper
        /// </summary>
        static void TestFaServiceHelper()
        {
            FaServiceHelper helper = new FaServiceHelper("Url to the service WSDL");
            Console.WriteLine("TestFaServiceHelper.GetOperations()");
            Operation[] operations = helper.GetOperations();
            foreach (Operation operation in operations)
            {
                Console.WriteLine("  " + operation.Name);
                Operation temp = helper.GetOperation(operation.Name);
                Console.WriteLine("    TestFaServiceHelper.GetOperation()");
                Console.WriteLine("      " + operation.Name);
                XmlSchemaElement[] inputParameters = helper.GetInputParameters(operation);
                Console.WriteLine("    TestFaServiceHelper.GetInputParameters()");
                if (null != inputParameters)
                {
                    foreach (XmlSchemaElement inputParameter in inputParameters)
                    {
                        Console.Out.WriteLine("      {0} {1}", inputParameter.Name, inputParameter.SchemaTypeName);
                        Console.WriteLine("      TestFaServiceHelper.findTypes()");
                        XmlSchemaElement[] types = helper.findTypes(inputParameter.SchemaTypeName);
                        if (null != types)
                        {
                            foreach (XmlSchemaElement type in types)
                            {
                                Console.WriteLine("          {0} {1}", type.Name, type.SchemaTypeName);
                            }
                        }
                    }
                }
                XmlSchemaElement[] outputParameters = helper.GetOutputParameters(operation);
                Console.WriteLine("    TestFaServiceHelper.GetOutputParameters()");
                if (null != outputParameters)
                {
                    foreach (XmlSchemaElement outputParameter in outputParameters)
                    {
                        Console.Out.WriteLine("      {0} {1}", outputParameter.Name, outputParameter.SchemaTypeName);
                        Console.WriteLine("      TestFaServiceHelper.findTypes()");
                        XmlSchemaElement[] types = helper.findTypes(outputParameter.SchemaTypeName);
                        if (null != types)
                        {
                            foreach (XmlSchemaElement type in types)
                            {
                                Console.WriteLine("          {0} {1}", type.Name, type.SchemaTypeName);
                            }
                        }

                    }
                }
            }
        }
    }
}
