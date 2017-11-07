package com.mynt.barcode.project.payload;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.api.client.util.StringUtils;

public class SuccessFailPayload extends Payload {
	
	@NotNull
    @Size(min=1, max=15)
	private String merchantID;
	
	@NotNull
    @Size(min=1, max=40)
	private String merchantRef;
	
	@NotNull
	private int amount;
	
	@NotNull
    @Size(min=1, max=20)
	private String payID;
	
	@NotNull
	private String token;
	
	private String message;
	
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

	public String getPayID() {
		return payID;
	}

	public void setPayID(String payID) {
		this.payID = payID;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getPayload() {
		return this.payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}
	
}
