package com.mynt.barcode.project.payload;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReferencePayload extends Payload {
	
	@NotNull
    @Size(min=1, max=15)
	private String merchantID;
	
	@NotNull
    @Size(min=1, max=40)
	private String merchantRef;
	
	@NotNull
	private int amount;
	
	@NotNull
    @Size(min=1, max=50)
	private String token;
	
	@Size(max=50)
	private String email;
	
	private long expDate;
	
	@Size(max=660)
	private String receiptRemarks;
	
	@Size(max=1)
	private String returnPaymentDetails;
	
	@Size(max=3000)
	private String transactionDescription;
    
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

	public long getExpDate() {
		return expDate;
	}

	public void setExpDate(long expDate) {
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
	

}
