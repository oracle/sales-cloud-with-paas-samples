
package com.oracle.xmlns.apps.cdm.foundation.parties.organizationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DateReportIssued" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocumentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequiringAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfFinancialReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ReportEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AuditInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsolidatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpeningInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProformaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualifiedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedByPrincipalsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrialBalanceInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnbalancedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WhUdpateId" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancialNumber" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}FinancialNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialReport", propOrder = {
    "financialReportId",
    "dateReportIssued",
    "partyId",
    "documentReference",
    "issuedPeriod",
    "requiringAuthority",
    "typeOfFinancialReport",
    "reportStartDate",
    "reportEndDate",
    "auditInd",
    "consolidatedInd",
    "estimatedInd",
    "fiscalInd",
    "finalInd",
    "forecastInd",
    "openingInd",
    "proformaInd",
    "qualifiedInd",
    "restatedInd",
    "signedByPrincipalsInd",
    "trialBalanceInd",
    "unbalancedInd",
    "createdBy",
    "creationDate",
    "lastUpdateLogin",
    "lastUpdateDate",
    "lastUpdatedBy",
    "requestId",
    "whUdpateId",
    "status",
    "createdByModule",
    "financialNumber"
})
public class FinancialReport {

    @XmlElement(name = "FinancialReportId")
    protected Long financialReportId;
    @XmlElementRef(name = "DateReportIssued", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateReportIssued;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "DocumentReference", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> documentReference;
    @XmlElementRef(name = "IssuedPeriod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> issuedPeriod;
    @XmlElementRef(name = "RequiringAuthority", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> requiringAuthority;
    @XmlElementRef(name = "TypeOfFinancialReport", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> typeOfFinancialReport;
    @XmlElementRef(name = "ReportStartDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> reportStartDate;
    @XmlElementRef(name = "ReportEndDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> reportEndDate;
    @XmlElementRef(name = "AuditInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> auditInd;
    @XmlElementRef(name = "ConsolidatedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> consolidatedInd;
    @XmlElementRef(name = "EstimatedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> estimatedInd;
    @XmlElementRef(name = "FiscalInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> fiscalInd;
    @XmlElementRef(name = "FinalInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> finalInd;
    @XmlElementRef(name = "ForecastInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> forecastInd;
    @XmlElementRef(name = "OpeningInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> openingInd;
    @XmlElementRef(name = "ProformaInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> proformaInd;
    @XmlElementRef(name = "QualifiedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> qualifiedInd;
    @XmlElementRef(name = "RestatedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> restatedInd;
    @XmlElementRef(name = "SignedByPrincipalsInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> signedByPrincipalsInd;
    @XmlElementRef(name = "TrialBalanceInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> trialBalanceInd;
    @XmlElementRef(name = "UnbalancedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> unbalancedInd;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "WhUdpateId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> whUdpateId;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "FinancialNumber")
    protected List<FinancialNumber> financialNumber;

    /**
     * Gets the value of the financialReportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancialReportId() {
        return financialReportId;
    }

    /**
     * Sets the value of the financialReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancialReportId(Long value) {
        this.financialReportId = value;
    }

    /**
     * Gets the value of the dateReportIssued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateReportIssued() {
        return dateReportIssued;
    }

    /**
     * Sets the value of the dateReportIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateReportIssued(JAXBElement<XMLGregorianCalendar> value) {
        this.dateReportIssued = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentReference(JAXBElement<String> value) {
        this.documentReference = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the issuedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuedPeriod() {
        return issuedPeriod;
    }

    /**
     * Sets the value of the issuedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuedPeriod(JAXBElement<String> value) {
        this.issuedPeriod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requiringAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequiringAuthority() {
        return requiringAuthority;
    }

    /**
     * Sets the value of the requiringAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequiringAuthority(JAXBElement<String> value) {
        this.requiringAuthority = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the typeOfFinancialReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfFinancialReport() {
        return typeOfFinancialReport;
    }

    /**
     * Sets the value of the typeOfFinancialReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfFinancialReport(JAXBElement<String> value) {
        this.typeOfFinancialReport = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reportStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportStartDate() {
        return reportStartDate;
    }

    /**
     * Sets the value of the reportStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reportStartDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the reportEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportEndDate() {
        return reportEndDate;
    }

    /**
     * Sets the value of the reportEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reportEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the auditInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuditInd() {
        return auditInd;
    }

    /**
     * Sets the value of the auditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuditInd(JAXBElement<String> value) {
        this.auditInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the consolidatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsolidatedInd() {
        return consolidatedInd;
    }

    /**
     * Sets the value of the consolidatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsolidatedInd(JAXBElement<String> value) {
        this.consolidatedInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the estimatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstimatedInd() {
        return estimatedInd;
    }

    /**
     * Sets the value of the estimatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstimatedInd(JAXBElement<String> value) {
        this.estimatedInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalInd() {
        return fiscalInd;
    }

    /**
     * Sets the value of the fiscalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalInd(JAXBElement<String> value) {
        this.fiscalInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finalInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinalInd() {
        return finalInd;
    }

    /**
     * Sets the value of the finalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinalInd(JAXBElement<String> value) {
        this.finalInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the forecastInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastInd() {
        return forecastInd;
    }

    /**
     * Sets the value of the forecastInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastInd(JAXBElement<String> value) {
        this.forecastInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the openingInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpeningInd() {
        return openingInd;
    }

    /**
     * Sets the value of the openingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpeningInd(JAXBElement<String> value) {
        this.openingInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the proformaInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProformaInd() {
        return proformaInd;
    }

    /**
     * Sets the value of the proformaInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProformaInd(JAXBElement<String> value) {
        this.proformaInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qualifiedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQualifiedInd() {
        return qualifiedInd;
    }

    /**
     * Sets the value of the qualifiedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQualifiedInd(JAXBElement<String> value) {
        this.qualifiedInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the restatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestatedInd() {
        return restatedInd;
    }

    /**
     * Sets the value of the restatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestatedInd(JAXBElement<String> value) {
        this.restatedInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the signedByPrincipalsInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignedByPrincipalsInd() {
        return signedByPrincipalsInd;
    }

    /**
     * Sets the value of the signedByPrincipalsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignedByPrincipalsInd(JAXBElement<String> value) {
        this.signedByPrincipalsInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trialBalanceInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrialBalanceInd() {
        return trialBalanceInd;
    }

    /**
     * Sets the value of the trialBalanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrialBalanceInd(JAXBElement<String> value) {
        this.trialBalanceInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unbalancedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnbalancedInd() {
        return unbalancedInd;
    }

    /**
     * Sets the value of the unbalancedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnbalancedInd(JAXBElement<String> value) {
        this.unbalancedInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<Long> value) {
        this.requestId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the whUdpateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWhUdpateId() {
        return whUdpateId;
    }

    /**
     * Sets the value of the whUdpateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWhUdpateId(JAXBElement<XMLGregorianCalendar> value) {
        this.whUdpateId = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the createdByModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Sets the value of the createdByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByModule(JAXBElement<String> value) {
        this.createdByModule = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the financialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialNumber }
     * 
     * 
     */
    public List<FinancialNumber> getFinancialNumber() {
        if (financialNumber == null) {
            financialNumber = new ArrayList<FinancialNumber>();
        }
        return this.financialNumber;
    }

}
