
package com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated package. 
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

    private final static QName _CreateMedication_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "createMedication");
    private final static QName _GetMedicationDetailListResponse_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "getMedicationDetailListResponse");
    private final static QName _GetMedicationList_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "getMedicationList");
    private final static QName _CreatePrescription_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "createPrescription");
    private final static QName _GetMedicationListResponse_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "getMedicationListResponse");
    private final static QName _CreatePrescriptionResponse_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "createPrescriptionResponse");
    private final static QName _GetMedicationDetailList_QNAME = new QName("http://ws.healthcare.ptsdemo.oracle.com/", "getMedicationDetailList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.ptsdemo.healthcare.wsclient.pharmacyload.wsclient.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateMedication }
     * 
     */
    public CreateMedication createCreateMedication() {
        return new CreateMedication();
    }

    /**
     * Create an instance of {@link GetMedicationList }
     * 
     */
    public GetMedicationList createGetMedicationList() {
        return new GetMedicationList();
    }

    /**
     * Create an instance of {@link GetMedicationDetailListResponse }
     * 
     */
    public GetMedicationDetailListResponse createGetMedicationDetailListResponse() {
        return new GetMedicationDetailListResponse();
    }

    /**
     * Create an instance of {@link CreatePrescription }
     * 
     */
    public CreatePrescription createCreatePrescription() {
        return new CreatePrescription();
    }

    /**
     * Create an instance of {@link GetMedicationListResponse }
     * 
     */
    public GetMedicationListResponse createGetMedicationListResponse() {
        return new GetMedicationListResponse();
    }

    /**
     * Create an instance of {@link GetMedicationDetailList }
     * 
     */
    public GetMedicationDetailList createGetMedicationDetailList() {
        return new GetMedicationDetailList();
    }

    /**
     * Create an instance of {@link CreatePrescriptionResponse }
     * 
     */
    public CreatePrescriptionResponse createCreatePrescriptionResponse() {
        return new CreatePrescriptionResponse();
    }

    /**
     * Create an instance of {@link Medication }
     * 
     */
    public Medication createMedication() {
        return new Medication();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "createMedication")
    public JAXBElement<CreateMedication> createCreateMedication(CreateMedication value) {
        return new JAXBElement<CreateMedication>(_CreateMedication_QNAME, CreateMedication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicationDetailListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "getMedicationDetailListResponse")
    public JAXBElement<GetMedicationDetailListResponse> createGetMedicationDetailListResponse(GetMedicationDetailListResponse value) {
        return new JAXBElement<GetMedicationDetailListResponse>(_GetMedicationDetailListResponse_QNAME, GetMedicationDetailListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "getMedicationList")
    public JAXBElement<GetMedicationList> createGetMedicationList(GetMedicationList value) {
        return new JAXBElement<GetMedicationList>(_GetMedicationList_QNAME, GetMedicationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "createPrescription")
    public JAXBElement<CreatePrescription> createCreatePrescription(CreatePrescription value) {
        return new JAXBElement<CreatePrescription>(_CreatePrescription_QNAME, CreatePrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "getMedicationListResponse")
    public JAXBElement<GetMedicationListResponse> createGetMedicationListResponse(GetMedicationListResponse value) {
        return new JAXBElement<GetMedicationListResponse>(_GetMedicationListResponse_QNAME, GetMedicationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "createPrescriptionResponse")
    public JAXBElement<CreatePrescriptionResponse> createCreatePrescriptionResponse(CreatePrescriptionResponse value) {
        return new JAXBElement<CreatePrescriptionResponse>(_CreatePrescriptionResponse_QNAME, CreatePrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicationDetailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.healthcare.ptsdemo.oracle.com/", name = "getMedicationDetailList")
    public JAXBElement<GetMedicationDetailList> createGetMedicationDetailList(GetMedicationDetailList value) {
        return new JAXBElement<GetMedicationDetailList>(_GetMedicationDetailList_QNAME, GetMedicationDetailList.class, null, value);
    }

}
