package com.org.beanio;

public class BX
{
	private String BXRECID;
    private String transactionSetPurposeCode;
    private String transportationMethodTypeCode;
    private String shipmentMethodOfPaymentCode;
    private String shipmentIdentificationNumber;
    private String standardCarrierAlphaCode;
    private String weightUnitCode;
    private String shipmentQualifier;
    private String sectionSevenCode;
    private String capacityLoadCode;
    private String customsDocumentationHandlingCode;
    private String confidentialBillingRequestCode;
    private String goodsAndServicesTaxReasonCode;
    
	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}
	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}
	public String getTransportationMethodTypeCode() {
		return transportationMethodTypeCode;
	}
	public void setTransportationMethodTypeCode(String transportationMethodTypeCode) {
		this.transportationMethodTypeCode = transportationMethodTypeCode;
	}
	public String getShipmentMethodOfPaymentCode() {
		return shipmentMethodOfPaymentCode;
	}
	public void setShipmentMethodOfPaymentCode(String shipmentMethodOfPaymentCode) {
		this.shipmentMethodOfPaymentCode = shipmentMethodOfPaymentCode;
	}
	public String getShipmentIdentificationNumber() {
		return shipmentIdentificationNumber;
	}
	public void setShipmentIdentificationNumber(String shipmentIdentificationNumber) {
		this.shipmentIdentificationNumber = shipmentIdentificationNumber;
	}
	public String getStandardCarrierAlphaCode() {
		return standardCarrierAlphaCode;
	}
	public void setStandardCarrierAlphaCode(String standardCarrierAlphaCode) {
		this.standardCarrierAlphaCode = standardCarrierAlphaCode;
	}
	public String getWeightUnitCode() {
		return weightUnitCode;
	}
	public void setWeightUnitCode(String weightUnitCode) {
		this.weightUnitCode = weightUnitCode;
	}
	public String getShipmentQualifier() {
		return shipmentQualifier;
	}
	public void setShipmentQualifier(String shipmentQualifier) {
		this.shipmentQualifier = shipmentQualifier;
	}
	public String getSectionSevenCode() {
		return sectionSevenCode;
	}
	public void setSectionSevenCode(String sectionSevenCode) {
		this.sectionSevenCode = sectionSevenCode;
	}
	public String getCapacityLoadCode() {
		return capacityLoadCode;
	}
	public void setCapacityLoadCode(String capacityLoadCode) {
		this.capacityLoadCode = capacityLoadCode;
	}
	public String getCustomsDocumentationHandlingCode() {
		return customsDocumentationHandlingCode;
	}
	public void setCustomsDocumentationHandlingCode(String customsDocumentationHandlingCode) {
		this.customsDocumentationHandlingCode = customsDocumentationHandlingCode;
	}
	public String getConfidentialBillingRequestCode() {
		return confidentialBillingRequestCode;
	}
	public void setConfidentialBillingRequestCode(String confidentialBillingRequestCode) {
		this.confidentialBillingRequestCode = confidentialBillingRequestCode;
	}
	public String getGoodsAndServicesTaxReasonCode() {
		return goodsAndServicesTaxReasonCode;
	}
	public void setGoodsAndServicesTaxReasonCode(String goodsAndServicesTaxReasonCode) {
		this.goodsAndServicesTaxReasonCode = goodsAndServicesTaxReasonCode;
	}
    
	@Override
	public String toString() {
		return "BX [transactionSetPurposeCode=" + transactionSetPurposeCode + ", transportationMethodTypeCode="
				+ transportationMethodTypeCode + ", shipmentMethodOfPaymentCode=" + shipmentMethodOfPaymentCode
				+ ", shipmentIdentificationNumber=" + shipmentIdentificationNumber + ", standardCarrierAlphaCode="
				+ standardCarrierAlphaCode + ", weightUnitCode=" + weightUnitCode + ", shipmentQualifier="
				+ shipmentQualifier + ", sectionSevenCode=" + sectionSevenCode + ", capacityLoadCode="
				+ capacityLoadCode + ", customsDocumentationHandlingCode=" + customsDocumentationHandlingCode
				+ ", confidentialBillingRequestCode=" + confidentialBillingRequestCode
				+ ", goodsAndServicesTaxReasonCode=" + goodsAndServicesTaxReasonCode + "]";
	}
	public BX() {
		super();
	}
	public String getBXRECID() {
		return BXRECID;
	}
	public void setBXRECID(String bXRECID) {
		BXRECID = bXRECID;
	}    
    
}

