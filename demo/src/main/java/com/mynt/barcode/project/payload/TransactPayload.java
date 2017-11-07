package com.mynt.barcode.project.payload;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TransactPayload extends Payload {
	
	@NotNull
    @Size(min=1, max=15)
	private String merchantID;
	
	@NotNull
    @Size(min=1, max=40)
	private String merchantRef;
	
	@NotNull
	private int amount;
	
	private long expDate;
	
	@NotNull
    @Size(min=1, max=300)
	private String successURL;
	
	@NotNull
    @Size(min=1, max=300)
	private String failURL;
	
	@NotNull
    @Size(min=1, max=50)
	private String token;
	
    @Size(max=3000)
	private String transactionDescription;
	
    @Size(max=660)
	private String receiptRemarks;
	

    @Size(max=50)
	private String email;
	
    @Size(max=3000)
	private String payLoad;
	
    @Size(max=1)
	private String returnPaymentDetails;
    
    private String payload;

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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getExpDate() {
		return expDate;
	}

	public void setExpDate(long expDate) {
		this.expDate = expDate;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getReceiptRemarks() {
		return receiptRemarks;
	}

	public void setReceiptRemarks(String receiptRemarks) {
		this.receiptRemarks = receiptRemarks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
	}

	public String getReturnPaymentDetails() {
		return returnPaymentDetails;
	}

	public void setReturnPaymentDetails(String returnPaymentDetails) {
		this.returnPaymentDetails = returnPaymentDetails;
	}

	public String getPayload() {
		return this.payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}
}
