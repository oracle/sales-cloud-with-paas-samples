
package com.oracle.pts.custom.wsclient.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.pts.custom.wsclient.generated package. 
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

    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _PresC_QNAME = new QName("/extensibility/app/customer/views/common/", "pres_c");
    private final static QName _MedC_QNAME = new QName("/extensibility/app/customer/views/common/", "med_c");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _PrescriptionC_QNAME = new QName("/extensibility/app/customer/views/common/", "prescription_c");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _PresMedC_QNAME = new QName("/extensibility/app/customer/views/common/", "pres_med_c");
    private final static QName _PresMedCORDERNUMBERC_QNAME = new QName("/extensibility/app/customer/views/common/", "ORDER_NUMBER_c");
    private final static QName _PresMedCSENTTOPHARMACYFLC_QNAME = new QName("/extensibility/app/customer/views/common/", "SENT_TO_PHARMACY_FL_c");
    private final static QName _PresMedCRequestId_QNAME = new QName("/extensibility/app/customer/views/common/", "RequestId");
    private final static QName _PresMedCUserLastUpdateDate_QNAME = new QName("/extensibility/app/customer/views/common/", "UserLastUpdateDate");
    private final static QName _PresMedCCorpCurrencyCode_QNAME = new QName("/extensibility/app/customer/views/common/", "CorpCurrencyCode");
    private final static QName _PresMedCJobDefinitionPackage_QNAME = new QName("/extensibility/app/customer/views/common/", "JobDefinitionPackage");
    private final static QName _PresMedCCpdrfVerPillar_QNAME = new QName("/extensibility/app/customer/views/common/", "CpdrfVerPillar");
    private final static QName _PresMedCCreatedBy_QNAME = new QName("/extensibility/app/customer/views/common/", "CreatedBy");
    private final static QName _PresMedCLastUpdateLogin_QNAME = new QName("/extensibility/app/customer/views/common/", "LastUpdateLogin");
    private final static QName _PresMedCISREADYTOPICKUPFLC_QNAME = new QName("/extensibility/app/customer/views/common/", "IS_READY_TO_PICKUP_FL_c");
    private final static QName _PresMedCLastUpdatedBy_QNAME = new QName("/extensibility/app/customer/views/common/", "LastUpdatedBy");
    private final static QName _PresMedCEXPIREDATEC_QNAME = new QName("/extensibility/app/customer/views/common/", "EXPIRE_DATE_c");
    private final static QName _PresMedCCurrencyCode_QNAME = new QName("/extensibility/app/customer/views/common/", "CurrencyCode");
    private final static QName _PresMedCObjectVersionNumber_QNAME = new QName("/extensibility/app/customer/views/common/", "ObjectVersionNumber");
    private final static QName _PresMedCDIRECTIONSFORUSEC_QNAME = new QName("/extensibility/app/customer/views/common/", "DIRECTIONS_FOR_USE_c");
    private final static QName _PresMedCCpdrfLastUpd_QNAME = new QName("/extensibility/app/customer/views/common/", "CpdrfLastUpd");
    private final static QName _PresMedCCreationDate_QNAME = new QName("/extensibility/app/customer/views/common/", "CreationDate");
    private final static QName _PresMedCREFILLSC_QNAME = new QName("/extensibility/app/customer/views/common/", "REFILLS_c");
    private final static QName _PresMedCLastUpdateDate_QNAME = new QName("/extensibility/app/customer/views/common/", "LastUpdateDate");
    private final static QName _PresMedCIsOwner_QNAME = new QName("/extensibility/app/customer/views/common/", "IsOwner");
    private final static QName _PresMedCJobDefinitionName_QNAME = new QName("/extensibility/app/customer/views/common/", "JobDefinitionName");
    private final static QName _PresMedCMEDICATIONIDC_QNAME = new QName("/extensibility/app/customer/views/common/", "MEDICATION_ID_c");
    private final static QName _PresMedCSENTTOPHARMACYDATEC_QNAME = new QName("/extensibility/app/customer/views/common/", "SENT_TO_PHARMACY_DATE_c");
    private final static QName _PresMedCPresIdC_QNAME = new QName("/extensibility/app/customer/views/common/", "Pres_Id_c");
    private final static QName _PresMedCCurcyConvRateType_QNAME = new QName("/extensibility/app/customer/views/common/", "CurcyConvRateType");
    private final static QName _PresMedCQUANTITYC_QNAME = new QName("/extensibility/app/customer/views/common/", "QUANTITY_c");
    private final static QName _PresMedCCpdrfVerSor_QNAME = new QName("/extensibility/app/customer/views/common/", "CpdrfVerSor");
    private final static QName _PresMedCMEDICATIONIDIdC_QNAME = new QName("/extensibility/app/customer/views/common/", "MEDICATION_ID_Id_c");
    private final static QName _MedCAttachmentEntityName_QNAME = new QName("/extensibility/app/customer/views/common/", "AttachmentEntityName");
    private final static QName _MedCNDCCODEC_QNAME = new QName("/extensibility/app/customer/views/common/", "NDC_CODE_c");
    private final static QName _MedCPKProxy_QNAME = new QName("/extensibility/app/customer/views/common/", "PKProxy");
    private final static QName _MedCNAMEC_QNAME = new QName("/extensibility/app/customer/views/common/", "NAME_c");
    private final static QName _MedCSourceType_QNAME = new QName("/extensibility/app/customer/views/common/", "SourceType");
    private final static QName _PrescriptionCPreIDC_QNAME = new QName("/extensibility/app/customer/views/common/", "PreID_c");
    private final static QName _PrescriptionCNDCCodeC_QNAME = new QName("/extensibility/app/customer/views/common/", "NDCCode_c");
    private final static QName _PrescriptionCExpireDateC_QNAME = new QName("/extensibility/app/customer/views/common/", "ExpireDate_c");
    private final static QName _PrescriptionCPrescriptionIdC_QNAME = new QName("/extensibility/app/customer/views/common/", "PrescriptionId_c");
    private final static QName _PrescriptionCSentToPharmacyDateC_QNAME = new QName("/extensibility/app/customer/views/common/", "SentToPharmacyDate_c");
    private final static QName _PrescriptionCOrderNumberC_QNAME = new QName("/extensibility/app/customer/views/common/", "OrderNumber_c");
    private final static QName _PrescriptionCReadyToPickupC_QNAME = new QName("/extensibility/app/customer/views/common/", "ReadyToPickup_c");
    private final static QName _PrescriptionCDirectionForUseC_QNAME = new QName("/extensibility/app/customer/views/common/", "DirectionForUse_c");
    private final static QName _PrescriptionCSentToPharmacyC_QNAME = new QName("/extensibility/app/customer/views/common/", "SentToPharmacy_c");
    private final static QName _PrescriptionCDocIdTC_QNAME = new QName("/extensibility/app/customer/views/common/", "DocIdT_c");
    private final static QName _PrescriptionCPatIdTC_QNAME = new QName("/extensibility/app/customer/views/common/", "PatIdT_c");
    private final static QName _PrescriptionCDrugNameC_QNAME = new QName("/extensibility/app/customer/views/common/", "DrugName_c");
    private final static QName _PresCPRESCRIPTIONDATEC_QNAME = new QName("/extensibility/app/customer/views/common/", "PRESCRIPTION_DATE_c");
    private final static QName _PresCDocIdC_QNAME = new QName("/extensibility/app/customer/views/common/", "doc_id_c");
    private final static QName _PresCPatIdC_QNAME = new QName("/extensibility/app/customer/views/common/", "pat_id_c");
    private final static QName _PresCVitIdC_QNAME = new QName("/extensibility/app/customer/views/common/", "vit_id_c");
    private final static QName _PresCPRESCRIPTIONIDC_QNAME = new QName("/extensibility/app/customer/views/common/", "PRESCRIPTION_ID_c");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.pts.custom.wsclient.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceErrorMessage }
     * 
     */
    public ServiceErrorMessage createServiceErrorMessage() {
        return new ServiceErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link ServiceDMLErrorMessage }
     * 
     */
    public ServiceDMLErrorMessage createServiceDMLErrorMessage() {
        return new ServiceDMLErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceRowValErrorMessage }
     * 
     */
    public ServiceRowValErrorMessage createServiceRowValErrorMessage() {
        return new ServiceRowValErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceAttrValErrorMessage }
     * 
     */
    public ServiceAttrValErrorMessage createServiceAttrValErrorMessage() {
        return new ServiceAttrValErrorMessage();
    }

    /**
     * Create an instance of {@link JavaInfo }
     * 
     */
    public JavaInfo createJavaInfo() {
        return new JavaInfo();
    }

    /**
     * Create an instance of {@link DataGraphType }
     * 
     */
    public DataGraphType createDataGraphType() {
        return new DataGraphType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link XSDType }
     * 
     */
    public XSDType createXSDType() {
        return new XSDType();
    }

    /**
     * Create an instance of {@link ChangeSummaryType }
     * 
     */
    public ChangeSummaryType createChangeSummaryType() {
        return new ChangeSummaryType();
    }

    /**
     * Create an instance of {@link DeleteEntityResponse }
     * 
     */
    public DeleteEntityResponse createDeleteEntityResponse() {
        return new DeleteEntityResponse();
    }

    /**
     * Create an instance of {@link CreateEntityResponse }
     * 
     */
    public CreateEntityResponse createCreateEntityResponse() {
        return new CreateEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateEntity }
     * 
     */
    public UpdateEntity createUpdateEntity() {
        return new UpdateEntity();
    }

    /**
     * Create an instance of {@link GetEntity }
     * 
     */
    public GetEntity createGetEntity() {
        return new GetEntity();
    }

    /**
     * Create an instance of {@link DeleteEntity }
     * 
     */
    public DeleteEntity createDeleteEntity() {
        return new DeleteEntity();
    }

    /**
     * Create an instance of {@link FindEntity }
     * 
     */
    public FindEntity createFindEntity() {
        return new FindEntity();
    }

    /**
     * Create an instance of {@link FindCriteria }
     * 
     */
    public FindCriteria createFindCriteria() {
        return new FindCriteria();
    }

    /**
     * Create an instance of {@link FindControl }
     * 
     */
    public FindControl createFindControl() {
        return new FindControl();
    }

    /**
     * Create an instance of {@link FindEntityResponse }
     * 
     */
    public FindEntityResponse createFindEntityResponse() {
        return new FindEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateEntityResponse }
     * 
     */
    public UpdateEntityResponse createUpdateEntityResponse() {
        return new UpdateEntityResponse();
    }

    /**
     * Create an instance of {@link CreateEntity }
     * 
     */
    public CreateEntity createCreateEntity() {
        return new CreateEntity();
    }

    /**
     * Create an instance of {@link GetEntityResponse }
     * 
     */
    public GetEntityResponse createGetEntityResponse() {
        return new GetEntityResponse();
    }

    /**
     * Create an instance of {@link PresMedC }
     * 
     */
    public PresMedC createPresMedC() {
        return new PresMedC();
    }

    /**
     * Create an instance of {@link PresC }
     * 
     */
    public PresC createPresC() {
        return new PresC();
    }

    /**
     * Create an instance of {@link MedC }
     * 
     */
    public MedC createMedC() {
        return new MedC();
    }

    /**
     * Create an instance of {@link PrescriptionC }
     * 
     */
    public PrescriptionC createPrescriptionC() {
        return new PrescriptionC();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link ChildFindCriteria }
     * 
     */
    public ChildFindCriteria createChildFindCriteria() {
        return new ChildFindCriteria();
    }

    /**
     * Create an instance of {@link BigDecimalResult }
     * 
     */
    public BigDecimalResult createBigDecimalResult() {
        return new BigDecimalResult();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link SortAttribute }
     * 
     */
    public SortAttribute createSortAttribute() {
        return new SortAttribute();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
    }

    /**
     * Create an instance of {@link TimeResult }
     * 
     */
    public TimeResult createTimeResult() {
        return new TimeResult();
    }

    /**
     * Create an instance of {@link DateResult }
     * 
     */
    public DateResult createDateResult() {
        return new DateResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaRow }
     * 
     */
    public ViewCriteriaRow createViewCriteriaRow() {
        return new ViewCriteriaRow();
    }

    /**
     * Create an instance of {@link BytesResult }
     * 
     */
    public BytesResult createBytesResult() {
        return new BytesResult();
    }

    /**
     * Create an instance of {@link CtrlHint }
     * 
     */
    public CtrlHint createCtrlHint() {
        return new CtrlHint();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaItem }
     * 
     */
    public ViewCriteriaItem createViewCriteriaItem() {
        return new ViewCriteriaItem();
    }

    /**
     * Create an instance of {@link ShortResult }
     * 
     */
    public ShortResult createShortResult() {
        return new ShortResult();
    }

    /**
     * Create an instance of {@link BigIntegerResult }
     * 
     */
    public BigIntegerResult createBigIntegerResult() {
        return new BigIntegerResult();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link DataHandlerResult }
     * 
     */
    public DataHandlerResult createDataHandlerResult() {
        return new DataHandlerResult();
    }

    /**
     * Create an instance of {@link IntegerResult }
     * 
     */
    public IntegerResult createIntegerResult() {
        return new IntegerResult();
    }

    /**
     * Create an instance of {@link FloatResult }
     * 
     */
    public FloatResult createFloatResult() {
        return new FloatResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link ByteResult }
     * 
     */
    public ByteResult createByteResult() {
        return new ByteResult();
    }

    /**
     * Create an instance of {@link LongResult }
     * 
     */
    public LongResult createLongResult() {
        return new LongResult();
    }

    /**
     * Create an instance of {@link AttrCtrlHints }
     * 
     */
    public AttrCtrlHints createAttrCtrlHints() {
        return new AttrCtrlHints();
    }

    /**
     * Create an instance of {@link ViewCriteria }
     * 
     */
    public ViewCriteria createViewCriteria() {
        return new ViewCriteria();
    }

    /**
     * Create an instance of {@link TimestampResult }
     * 
     */
    public TimestampResult createTimestampResult() {
        return new TimestampResult();
    }

    /**
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findCriteria")
    public JAXBElement<FindCriteria> createFindCriteria(FindCriteria value) {
        return new JAXBElement<FindCriteria>(_FindCriteria_QNAME, FindCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Types }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "types")
    public JAXBElement<Types> createTypes(Types value) {
        return new JAXBElement<Types>(_Types_QNAME, Types.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findControl")
    public JAXBElement<FindControl> createFindControl(FindControl value) {
        return new JAXBElement<FindControl>(_FindControl_QNAME, FindControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "pres_c")
    public JAXBElement<PresC> createPresC(PresC value) {
        return new JAXBElement<PresC>(_PresC_QNAME, PresC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "med_c")
    public JAXBElement<MedC> createMedC(MedC value) {
        return new JAXBElement<MedC>(_MedC_QNAME, MedC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "dataObject")
    public JAXBElement<Object> createDataObject(Object value) {
        return new JAXBElement<Object>(_DataObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processControl")
    public JAXBElement<ProcessControl> createProcessControl(ProcessControl value) {
        return new JAXBElement<ProcessControl>(_ProcessControl_QNAME, ProcessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrescriptionC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "prescription_c")
    public JAXBElement<PrescriptionC> createPrescriptionC(PrescriptionC value) {
        return new JAXBElement<PrescriptionC>(_PrescriptionC_QNAME, PrescriptionC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresMedC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "pres_med_c")
    public JAXBElement<PresMedC> createPresMedC(PresMedC value) {
        return new JAXBElement<PresMedC>(_PresMedC_QNAME, PresMedC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ORDER_NUMBER_c", scope = PresMedC.class)
    public JAXBElement<BigDecimal> createPresMedCORDERNUMBERC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCORDERNUMBERC_QNAME, BigDecimal.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SENT_TO_PHARMACY_FL_c", scope = PresMedC.class)
    public JAXBElement<Boolean> createPresMedCSENTTOPHARMACYFLC(Boolean value) {
        return new JAXBElement<Boolean>(_PresMedCSENTTOPHARMACYFLC_QNAME, Boolean.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "RequestId", scope = PresMedC.class)
    public JAXBElement<Long> createPresMedCRequestId(Long value) {
        return new JAXBElement<Long>(_PresMedCRequestId_QNAME, Long.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "UserLastUpdateDate", scope = PresMedC.class)
    public JAXBElement<XMLGregorianCalendar> createPresMedCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CorpCurrencyCode", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCorpCurrencyCode_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionPackage", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionPackage_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerPillar", scope = PresMedC.class)
    public JAXBElement<Integer> createPresMedCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerPillar_QNAME, Integer.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreatedBy", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCCreatedBy(String value) {
        return new JAXBElement<String>(_PresMedCCreatedBy_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateLogin", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdateLogin_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "IS_READY_TO_PICKUP_FL_c", scope = PresMedC.class)
    public JAXBElement<Boolean> createPresMedCISREADYTOPICKUPFLC(Boolean value) {
        return new JAXBElement<Boolean>(_PresMedCISREADYTOPICKUPFLC_QNAME, Boolean.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdatedBy", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdatedBy_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "EXPIRE_DATE_c", scope = PresMedC.class)
    public JAXBElement<XMLGregorianCalendar> createPresMedCEXPIREDATEC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCEXPIREDATEC_QNAME, XMLGregorianCalendar.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurrencyCode", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCurrencyCode_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ObjectVersionNumber", scope = PresMedC.class)
    public JAXBElement<BigDecimal> createPresMedCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCObjectVersionNumber_QNAME, BigDecimal.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "DIRECTIONS_FOR_USE_c", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCDIRECTIONSFORUSEC(String value) {
        return new JAXBElement<String>(_PresMedCDIRECTIONSFORUSEC_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfLastUpd", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_PresMedCCpdrfLastUpd_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreationDate", scope = PresMedC.class)
    public JAXBElement<XMLGregorianCalendar> createPresMedCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCCreationDate_QNAME, XMLGregorianCalendar.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "REFILLS_c", scope = PresMedC.class)
    public JAXBElement<BigDecimal> createPresMedCREFILLSC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCREFILLSC_QNAME, BigDecimal.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateDate", scope = PresMedC.class)
    public JAXBElement<XMLGregorianCalendar> createPresMedCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "IsOwner", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCIsOwner(String value) {
        return new JAXBElement<String>(_PresMedCIsOwner_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionName", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCJobDefinitionName(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionName_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "MEDICATION_ID_c", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCMEDICATIONIDC(String value) {
        return new JAXBElement<String>(_PresMedCMEDICATIONIDC_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SENT_TO_PHARMACY_DATE_c", scope = PresMedC.class)
    public JAXBElement<XMLGregorianCalendar> createPresMedCSENTTOPHARMACYDATEC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCSENTTOPHARMACYDATEC_QNAME, XMLGregorianCalendar.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "Pres_Id_c", scope = PresMedC.class)
    public JAXBElement<BigDecimal> createPresMedCPresIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCPresIdC_QNAME, BigDecimal.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurcyConvRateType", scope = PresMedC.class)
    public JAXBElement<String> createPresMedCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PresMedCCurcyConvRateType_QNAME, String.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "QUANTITY_c", scope = PresMedC.class)
    public JAXBElement<BigDecimal> createPresMedCQUANTITYC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCQUANTITYC_QNAME, BigDecimal.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerSor", scope = PresMedC.class)
    public JAXBElement<Integer> createPresMedCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerSor_QNAME, Integer.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "MEDICATION_ID_Id_c", scope = PresMedC.class)
    public JAXBElement<BigDecimal> createPresMedCMEDICATIONIDIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCMEDICATIONIDIdC_QNAME, BigDecimal.class, PresMedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "IsOwner", scope = MedC.class)
    public JAXBElement<String> createMedCIsOwner(String value) {
        return new JAXBElement<String>(_PresMedCIsOwner_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateDate", scope = MedC.class)
    public JAXBElement<XMLGregorianCalendar> createMedCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCLastUpdateDate_QNAME, XMLGregorianCalendar.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "RequestId", scope = MedC.class)
    public JAXBElement<Long> createMedCRequestId(Long value) {
        return new JAXBElement<Long>(_PresMedCRequestId_QNAME, Long.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "UserLastUpdateDate", scope = MedC.class)
    public JAXBElement<XMLGregorianCalendar> createMedCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "AttachmentEntityName", scope = MedC.class, defaultValue = "Med_c")
    public JAXBElement<String> createMedCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_MedCAttachmentEntityName_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionName", scope = MedC.class)
    public JAXBElement<String> createMedCJobDefinitionName(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionName_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "MEDICATION_ID_c", scope = MedC.class)
    public JAXBElement<BigDecimal> createMedCMEDICATIONIDC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCMEDICATIONIDC_QNAME, BigDecimal.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CorpCurrencyCode", scope = MedC.class)
    public JAXBElement<String> createMedCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCorpCurrencyCode_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionPackage", scope = MedC.class)
    public JAXBElement<String> createMedCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionPackage_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "NDC_CODE_c", scope = MedC.class)
    public JAXBElement<BigDecimal> createMedCNDCCODEC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MedCNDCCODEC_QNAME, BigDecimal.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreatedBy", scope = MedC.class)
    public JAXBElement<String> createMedCCreatedBy(String value) {
        return new JAXBElement<String>(_PresMedCCreatedBy_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerPillar", scope = MedC.class)
    public JAXBElement<Integer> createMedCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerPillar_QNAME, Integer.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PKProxy", scope = MedC.class, defaultValue = "Med_c")
    public JAXBElement<String> createMedCPKProxy(String value) {
        return new JAXBElement<String>(_MedCPKProxy_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurcyConvRateType", scope = MedC.class)
    public JAXBElement<String> createMedCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PresMedCCurcyConvRateType_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerSor", scope = MedC.class)
    public JAXBElement<Integer> createMedCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerSor_QNAME, Integer.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "NAME_c", scope = MedC.class)
    public JAXBElement<String> createMedCNAMEC(String value) {
        return new JAXBElement<String>(_MedCNAMEC_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateLogin", scope = MedC.class)
    public JAXBElement<String> createMedCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdateLogin_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SourceType", scope = MedC.class, defaultValue = "Med_c")
    public JAXBElement<String> createMedCSourceType(String value) {
        return new JAXBElement<String>(_MedCSourceType_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdatedBy", scope = MedC.class)
    public JAXBElement<String> createMedCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdatedBy_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurrencyCode", scope = MedC.class)
    public JAXBElement<String> createMedCCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCurrencyCode_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ObjectVersionNumber", scope = MedC.class)
    public JAXBElement<BigDecimal> createMedCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCObjectVersionNumber_QNAME, BigDecimal.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfLastUpd", scope = MedC.class)
    public JAXBElement<String> createMedCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_PresMedCCpdrfLastUpd_QNAME, String.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreationDate", scope = MedC.class)
    public JAXBElement<XMLGregorianCalendar> createMedCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCCreationDate_QNAME, XMLGregorianCalendar.class, MedC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PreID_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCPreIDC(String value) {
        return new JAXBElement<String>(_PrescriptionCPreIDC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "RequestId", scope = PrescriptionC.class)
    public JAXBElement<Long> createPrescriptionCRequestId(Long value) {
        return new JAXBElement<Long>(_PresMedCRequestId_QNAME, Long.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "UserLastUpdateDate", scope = PrescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CorpCurrencyCode", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCorpCurrencyCode_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionPackage", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionPackage_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerPillar", scope = PrescriptionC.class)
    public JAXBElement<Integer> createPrescriptionCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerPillar_QNAME, Integer.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreatedBy", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCCreatedBy(String value) {
        return new JAXBElement<String>(_PresMedCCreatedBy_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PKProxy", scope = PrescriptionC.class, defaultValue = "Prescription_c")
    public JAXBElement<String> createPrescriptionCPKProxy(String value) {
        return new JAXBElement<String>(_MedCPKProxy_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "NDCCode_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCNDCCodeC(String value) {
        return new JAXBElement<String>(_PrescriptionCNDCCodeC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateLogin", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdateLogin_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SourceType", scope = PrescriptionC.class, defaultValue = "Prescription_c")
    public JAXBElement<String> createPrescriptionCSourceType(String value) {
        return new JAXBElement<String>(_MedCSourceType_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdatedBy", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdatedBy_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurrencyCode", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCurrencyCode_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ObjectVersionNumber", scope = PrescriptionC.class)
    public JAXBElement<BigDecimal> createPrescriptionCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCObjectVersionNumber_QNAME, BigDecimal.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfLastUpd", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_PresMedCCpdrfLastUpd_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreationDate", scope = PrescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCCreationDate_QNAME, XMLGregorianCalendar.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "REFILLS_c", scope = PrescriptionC.class)
    public JAXBElement<BigDecimal> createPrescriptionCREFILLSC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCREFILLSC_QNAME, BigDecimal.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateDate", scope = PrescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "IsOwner", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCIsOwner(String value) {
        return new JAXBElement<String>(_PresMedCIsOwner_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ExpireDate_c", scope = PrescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionCExpireDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrescriptionCExpireDateC_QNAME, XMLGregorianCalendar.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionName", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCJobDefinitionName(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionName_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "AttachmentEntityName", scope = PrescriptionC.class, defaultValue = "Prescription_c")
    public JAXBElement<String> createPrescriptionCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_MedCAttachmentEntityName_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PrescriptionId_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCPrescriptionIdC(String value) {
        return new JAXBElement<String>(_PrescriptionCPrescriptionIdC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SentToPharmacyDate_c", scope = PrescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionCSentToPharmacyDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrescriptionCSentToPharmacyDateC_QNAME, XMLGregorianCalendar.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "OrderNumber_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCOrderNumberC(String value) {
        return new JAXBElement<String>(_PrescriptionCOrderNumberC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurcyConvRateType", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PresMedCCurcyConvRateType_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "QUANTITY_c", scope = PrescriptionC.class)
    public JAXBElement<BigDecimal> createPrescriptionCQUANTITYC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCQUANTITYC_QNAME, BigDecimal.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerSor", scope = PrescriptionC.class)
    public JAXBElement<Integer> createPrescriptionCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerSor_QNAME, Integer.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ReadyToPickup_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCReadyToPickupC(String value) {
        return new JAXBElement<String>(_PrescriptionCReadyToPickupC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "DirectionForUse_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCDirectionForUseC(String value) {
        return new JAXBElement<String>(_PrescriptionCDirectionForUseC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SentToPharmacy_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCSentToPharmacyC(String value) {
        return new JAXBElement<String>(_PrescriptionCSentToPharmacyC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "DocIdT_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCDocIdTC(String value) {
        return new JAXBElement<String>(_PrescriptionCDocIdTC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PatIdT_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCPatIdTC(String value) {
        return new JAXBElement<String>(_PrescriptionCPatIdTC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "DrugName_c", scope = PrescriptionC.class)
    public JAXBElement<String> createPrescriptionCDrugNameC(String value) {
        return new JAXBElement<String>(_PrescriptionCDrugNameC_QNAME, String.class, PrescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "RequestId", scope = PresC.class)
    public JAXBElement<Long> createPresCRequestId(Long value) {
        return new JAXBElement<Long>(_PresMedCRequestId_QNAME, Long.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "UserLastUpdateDate", scope = PresC.class)
    public JAXBElement<XMLGregorianCalendar> createPresCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PRESCRIPTION_DATE_c", scope = PresC.class)
    public JAXBElement<XMLGregorianCalendar> createPresCPRESCRIPTIONDATEC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresCPRESCRIPTIONDATEC_QNAME, XMLGregorianCalendar.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CorpCurrencyCode", scope = PresC.class)
    public JAXBElement<String> createPresCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCorpCurrencyCode_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionPackage", scope = PresC.class)
    public JAXBElement<String> createPresCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionPackage_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerPillar", scope = PresC.class)
    public JAXBElement<Integer> createPresCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerPillar_QNAME, Integer.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreatedBy", scope = PresC.class)
    public JAXBElement<String> createPresCCreatedBy(String value) {
        return new JAXBElement<String>(_PresMedCCreatedBy_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "doc_id_c", scope = PresC.class)
    public JAXBElement<BigDecimal> createPresCDocIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresCDocIdC_QNAME, BigDecimal.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PKProxy", scope = PresC.class, defaultValue = "Pres_c")
    public JAXBElement<String> createPresCPKProxy(String value) {
        return new JAXBElement<String>(_MedCPKProxy_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "pat_id_c", scope = PresC.class)
    public JAXBElement<BigDecimal> createPresCPatIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresCPatIdC_QNAME, BigDecimal.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateLogin", scope = PresC.class)
    public JAXBElement<String> createPresCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdateLogin_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "SourceType", scope = PresC.class, defaultValue = "Pres_c")
    public JAXBElement<String> createPresCSourceType(String value) {
        return new JAXBElement<String>(_MedCSourceType_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdatedBy", scope = PresC.class)
    public JAXBElement<String> createPresCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_PresMedCLastUpdatedBy_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "EXPIRE_DATE_c", scope = PresC.class)
    public JAXBElement<XMLGregorianCalendar> createPresCEXPIREDATEC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCEXPIREDATEC_QNAME, XMLGregorianCalendar.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurrencyCode", scope = PresC.class)
    public JAXBElement<String> createPresCCurrencyCode(String value) {
        return new JAXBElement<String>(_PresMedCCurrencyCode_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "ObjectVersionNumber", scope = PresC.class)
    public JAXBElement<BigDecimal> createPresCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresMedCObjectVersionNumber_QNAME, BigDecimal.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfLastUpd", scope = PresC.class)
    public JAXBElement<String> createPresCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_PresMedCCpdrfLastUpd_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CreationDate", scope = PresC.class)
    public JAXBElement<XMLGregorianCalendar> createPresCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCCreationDate_QNAME, XMLGregorianCalendar.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "vit_id_c", scope = PresC.class)
    public JAXBElement<BigDecimal> createPresCVitIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresCVitIdC_QNAME, BigDecimal.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "LastUpdateDate", scope = PresC.class)
    public JAXBElement<XMLGregorianCalendar> createPresCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PresMedCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "IsOwner", scope = PresC.class)
    public JAXBElement<String> createPresCIsOwner(String value) {
        return new JAXBElement<String>(_PresMedCIsOwner_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "PRESCRIPTION_ID_c", scope = PresC.class)
    public JAXBElement<BigDecimal> createPresCPRESCRIPTIONIDC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PresCPRESCRIPTIONIDC_QNAME, BigDecimal.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "JobDefinitionName", scope = PresC.class)
    public JAXBElement<String> createPresCJobDefinitionName(String value) {
        return new JAXBElement<String>(_PresMedCJobDefinitionName_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "AttachmentEntityName", scope = PresC.class, defaultValue = "Pres_c")
    public JAXBElement<String> createPresCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_MedCAttachmentEntityName_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CurcyConvRateType", scope = PresC.class)
    public JAXBElement<String> createPresCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PresMedCCurcyConvRateType_QNAME, String.class, PresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/extensibility/app/customer/views/common/", name = "CpdrfVerSor", scope = PresC.class)
    public JAXBElement<Integer> createPresCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_PresMedCCpdrfVerSor_QNAME, Integer.class, PresC.class, value);
    }

}
