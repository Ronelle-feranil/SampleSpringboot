package com.mynt.barcode.project.domain;

public class ValidateConfirmPayload {
	
	private String merchantID;
	
	private String merchantRef;
	
	private double amount;
	
	private String token;
	
	private String email;
	
	private String expDate;
	
	private String receiptRemarks;
	
	private String returnPaymentDetails;
	
	private String transactionDescription;
	
	private String payload;
	
	private String type;

	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getMerchantRef() {
		return merchantRef;
	}

	public void setMerchantRef(String merchantRef) {
		this.merchantRef = merchantRef;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getReceiptRemarks() {
		return receiptRemarks;
	}

	public void setReceiptRemarks(String receiptRemarks) {
		this.receiptRemarks = receiptRemarks;
	}

	public String getReturnPaymentDetails() {
		return returnPaymentDetails;
	}

	public void setReturnPaymentDetails(String returnPaymentDetails) {
		this.returnPaymentDetails = returnPaymentDetails;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
