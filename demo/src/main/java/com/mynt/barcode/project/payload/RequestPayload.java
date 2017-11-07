package com.mynt.barcode.project.payload;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RequestPayload {
	
	@NotNull
    @Size(min=2, max=30)
	private String merchantID;
	
	private String merchantRef;
	
	private Double amount;
	
	private String token;
	
	private String email;
	
	private String expDate;
	
	private String receiptRemarks;
	
	private String returnDetailsPayment;
	
	private String transactionDescription;
	
	private String payload;
	
	private String transactionKey;
	
	private String type;
	
	private String payId;
	
	private String authCode;
	
	private String responseCode;
	
	private String successURL;
	
	private String failURL;
	
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
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

	public String getReturnDetailsPayment() {
		return returnDetailsPayment;
	}

	public void setReturnDetailsPayment(String returnDetailsPayment) {
		this.returnDetailsPayment = returnDetailsPayment;
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

	public String getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getSuccessURL() {
		return successURL;
	}

	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}

	public String getFailURL() {
		return failURL;
	}

	public void setFailURL(String failURL) {
		this.failURL = failURL;
	}

}
