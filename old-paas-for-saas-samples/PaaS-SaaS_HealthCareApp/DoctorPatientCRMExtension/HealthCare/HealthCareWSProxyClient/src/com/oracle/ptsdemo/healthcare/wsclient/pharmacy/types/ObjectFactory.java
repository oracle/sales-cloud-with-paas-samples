
package com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IsMedicationReadyToPickupResponse_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "isMedicationReadyToPickupResponse");
    private final static QName _LoadMedicationListFromHealthCare_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "loadMedicationListFromHealthCare");
    private final static QName _RequestOrderStatusResponse_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "requestOrderStatusResponse");
    private final static QName _CreatePrescription_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "createPrescription");
    private final static QName _RequestOrderStatus_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "requestOrderStatus");
    private final static QName _IsMedicationReadyToPickup_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "isMedicationReadyToPickup");
    private final static QName _LoadMedicationListForHealthCare_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "loadMedicationListForHealthCare");
    private final static QName _SetMedicationReadyToPickup_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "setMedicationReadyToPickup");
    private final static QName _CreateMedicationResponse_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "createMedicationResponse");
    private final static QName _LoadHealthCareProviderList_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "loadHealthCareProviderList");
    private final static QName _CreateMedication_QNAME = new QName("http://pharmacy.webservice.pts.oracle.com/", "createMedication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.ptsdemo.healthcare.wsclient.pharmacy.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadHealthCareProviderList }
     * 
     */
    public LoadHealthCareProviderList createLoadHealthCareProviderList() {
        return new LoadHealthCareProviderList();
    }

    /**
     * Create an instance of {@link CreateMedicationResponse }
     * 
     */
    public CreateMedicationResponse createCreateMedicationResponse() {
        return new CreateMedicationResponse();
    }

    /**
     * Create an instance of {@link CreateMedication }
     * 
     */
    public CreateMedication createCreateMedication() {
        return new CreateMedication();
    }

    /**
     * Create an instance of {@link RequestOrderStatusResponse }
     * 
     */
    public RequestOrderStatusResponse createRequestOrderStatusResponse() {
        return new RequestOrderStatusResponse();
    }

    /**
     * Create an instance of {@link CreatePrescription }
     * 
     */
    public CreatePrescription createCreatePrescription() {
        return new CreatePrescription();
    }

    /**
     * Create an instance of {@link IsMedicationReadyToPickupResponse }
     * 
     */
    public IsMedicationReadyToPickupResponse createIsMedicationReadyToPickupResponse() {
        return new IsMedicationReadyToPickupResponse();
    }

    /**
     * Create an instance of {@link LoadMedicationListFromHealthCare }
     * 
     */
    public LoadMedicationListFromHealthCare createLoadMedicationListFromHealthCare() {
        return new LoadMedicationListFromHealthCare();
    }

    /**
     * Create an instance of {@link LoadMedicationListForHealthCare }
     * 
     */
    public LoadMedicationListForHealthCare createLoadMedicationListForHealthCare() {
        return new LoadMedicationListForHealthCare();
    }

    /**
     * Create an instance of {@link SetMedicationReadyToPickup }
     * 
     */
    public SetMedicationReadyToPickup createSetMedicationReadyToPickup() {
        return new SetMedicationReadyToPickup();
    }

    /**
     * Create an instance of {@link RequestOrderStatus }
     * 
     */
    public RequestOrderStatus createRequestOrderStatus() {
        return new RequestOrderStatus();
    }

    /**
     * Create an instance of {@link IsMedicationReadyToPickup }
     * 
     */
    public IsMedicationReadyToPickup createIsMedicationReadyToPickup() {
        return new IsMedicationReadyToPickup();
    }

    /**
     * Create an instance of {@link Medication }
     * 
     */
    public Medication createMedication() {
        return new Medication();
    }

    /**
     * Create an instance of {@link Prescription }
     * 
     */
    public Prescription createPrescription() {
        return new Prescription();
    }

    /**
     * Create an instance of {@link Doctor }
     * 
     */
    public Doctor createDoctor() {
        return new Doctor();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsMedicationReadyToPickupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "isMedicationReadyToPickupResponse")
    public JAXBElement<IsMedicationReadyToPickupResponse> createIsMedicationReadyToPickupResponse(IsMedicationReadyToPickupResponse value) {
        return new JAXBElement<IsMedicationReadyToPickupResponse>(_IsMedicationReadyToPickupResponse_QNAME, IsMedicationReadyToPickupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadMedicationListFromHealthCare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "loadMedicationListFromHealthCare")
    public JAXBElement<LoadMedicationListFromHealthCare> createLoadMedicationListFromHealthCare(LoadMedicationListFromHealthCare value) {
        return new JAXBElement<LoadMedicationListFromHealthCare>(_LoadMedicationListFromHealthCare_QNAME, LoadMedicationListFromHealthCare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "requestOrderStatusResponse")
    public JAXBElement<RequestOrderStatusResponse> createRequestOrderStatusResponse(RequestOrderStatusResponse value) {
        return new JAXBElement<RequestOrderStatusResponse>(_RequestOrderStatusResponse_QNAME, RequestOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "createPrescription")
    public JAXBElement<CreatePrescription> createCreatePrescription(CreatePrescription value) {
        return new JAXBElement<CreatePrescription>(_CreatePrescription_QNAME, CreatePrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "requestOrderStatus")
    public JAXBElement<RequestOrderStatus> createRequestOrderStatus(RequestOrderStatus value) {
        return new JAXBElement<RequestOrderStatus>(_RequestOrderStatus_QNAME, RequestOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsMedicationReadyToPickup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "isMedicationReadyToPickup")
    public JAXBElement<IsMedicationReadyToPickup> createIsMedicationReadyToPickup(IsMedicationReadyToPickup value) {
        return new JAXBElement<IsMedicationReadyToPickup>(_IsMedicationReadyToPickup_QNAME, IsMedicationReadyToPickup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadMedicationListForHealthCare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "loadMedicationListForHealthCare")
    public JAXBElement<LoadMedicationListForHealthCare> createLoadMedicationListForHealthCare(LoadMedicationListForHealthCare value) {
        return new JAXBElement<LoadMedicationListForHealthCare>(_LoadMedicationListForHealthCare_QNAME, LoadMedicationListForHealthCare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMedicationReadyToPickup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "setMedicationReadyToPickup")
    public JAXBElement<SetMedicationReadyToPickup> createSetMedicationReadyToPickup(SetMedicationReadyToPickup value) {
        return new JAXBElement<SetMedicationReadyToPickup>(_SetMedicationReadyToPickup_QNAME, SetMedicationReadyToPickup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "createMedicationResponse")
    public JAXBElement<CreateMedicationResponse> createCreateMedicationResponse(CreateMedicationResponse value) {
        return new JAXBElement<CreateMedicationResponse>(_CreateMedicationResponse_QNAME, CreateMedicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadHealthCareProviderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "loadHealthCareProviderList")
    public JAXBElement<LoadHealthCareProviderList> createLoadHealthCareProviderList(LoadHealthCareProviderList value) {
        return new JAXBElement<LoadHealthCareProviderList>(_LoadHealthCareProviderList_QNAME, LoadHealthCareProviderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pharmacy.webservice.pts.oracle.com/", name = "createMedication")
    public JAXBElement<CreateMedication> createCreateMedication(CreateMedication value) {
        return new JAXBElement<CreateMedication>(_CreateMedication_QNAME, CreateMedication.class, null, value);
    }

}
