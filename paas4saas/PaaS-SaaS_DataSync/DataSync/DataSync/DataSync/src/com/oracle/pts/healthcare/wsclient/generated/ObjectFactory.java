
package com.oracle.pts.healthcare.wsclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.pts.healthcare.wsclient.generated package. 
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

    private final static QName _SetMedicationReadyToPickup_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "setMedicationReadyToPickup");
    private final static QName _LoadPrescriptionResponse_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "loadPrescriptionResponse");
    private final static QName _RequestOrderStatus_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "requestOrderStatus");
    private final static QName _IsMedicationReadyToPickup_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "isMedicationReadyToPickup");
    private final static QName _RequestOrderStatusResponse_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "requestOrderStatusResponse");
    private final static QName _IsMedicationReadyToPickupResponse_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "isMedicationReadyToPickupResponse");
    private final static QName _LoadPrescription_QNAME = new QName("http://healthcare.webservice.pts.oracle.com/", "loadPrescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.pts.healthcare.wsclient.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestOrderStatusResponse }
     * 
     */
    public RequestOrderStatusResponse createRequestOrderStatusResponse() {
        return new RequestOrderStatusResponse();
    }

    /**
     * Create an instance of {@link IsMedicationReadyToPickupResponse }
     * 
     */
    public IsMedicationReadyToPickupResponse createIsMedicationReadyToPickupResponse() {
        return new IsMedicationReadyToPickupResponse();
    }

    /**
     * Create an instance of {@link LoadPrescription }
     * 
     */
    public LoadPrescription createLoadPrescription() {
        return new LoadPrescription();
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
     * Create an instance of {@link LoadPrescriptionResponse }
     * 
     */
    public LoadPrescriptionResponse createLoadPrescriptionResponse() {
        return new LoadPrescriptionResponse();
    }

    /**
     * Create an instance of {@link IsMedicationReadyToPickup }
     * 
     */
    public IsMedicationReadyToPickup createIsMedicationReadyToPickup() {
        return new IsMedicationReadyToPickup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMedicationReadyToPickup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "setMedicationReadyToPickup")
    public JAXBElement<SetMedicationReadyToPickup> createSetMedicationReadyToPickup(SetMedicationReadyToPickup value) {
        return new JAXBElement<SetMedicationReadyToPickup>(_SetMedicationReadyToPickup_QNAME, SetMedicationReadyToPickup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadPrescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "loadPrescriptionResponse")
    public JAXBElement<LoadPrescriptionResponse> createLoadPrescriptionResponse(LoadPrescriptionResponse value) {
        return new JAXBElement<LoadPrescriptionResponse>(_LoadPrescriptionResponse_QNAME, LoadPrescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "requestOrderStatus")
    public JAXBElement<RequestOrderStatus> createRequestOrderStatus(RequestOrderStatus value) {
        return new JAXBElement<RequestOrderStatus>(_RequestOrderStatus_QNAME, RequestOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsMedicationReadyToPickup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "isMedicationReadyToPickup")
    public JAXBElement<IsMedicationReadyToPickup> createIsMedicationReadyToPickup(IsMedicationReadyToPickup value) {
        return new JAXBElement<IsMedicationReadyToPickup>(_IsMedicationReadyToPickup_QNAME, IsMedicationReadyToPickup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "requestOrderStatusResponse")
    public JAXBElement<RequestOrderStatusResponse> createRequestOrderStatusResponse(RequestOrderStatusResponse value) {
        return new JAXBElement<RequestOrderStatusResponse>(_RequestOrderStatusResponse_QNAME, RequestOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsMedicationReadyToPickupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "isMedicationReadyToPickupResponse")
    public JAXBElement<IsMedicationReadyToPickupResponse> createIsMedicationReadyToPickupResponse(IsMedicationReadyToPickupResponse value) {
        return new JAXBElement<IsMedicationReadyToPickupResponse>(_IsMedicationReadyToPickupResponse_QNAME, IsMedicationReadyToPickupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcare.webservice.pts.oracle.com/", name = "loadPrescription")
    public JAXBElement<LoadPrescription> createLoadPrescription(LoadPrescription value) {
        return new JAXBElement<LoadPrescription>(_LoadPrescription_QNAME, LoadPrescription.class, null, value);
    }

}
