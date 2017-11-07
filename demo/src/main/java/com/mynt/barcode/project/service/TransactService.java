package com.mynt.barcode.project.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mynt.barcode.project.payload.Payload;
import com.mynt.barcode.project.payload.TransactPayload;
import com.mynt.barcode.project.utils.Constants;

public class TransactService implements Service {

	TransactPayload transactionPayload;
	public TransactService(Payload payload) {
		this.transactionPayload = (TransactPayload) payload;
	}
	
	@Override
	public ResponseEntity<String> process() {
		
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder uri = build();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(uri.toUriString(), null, String.class);
		
		// TODO - modify the response data as per ESB requirements
		return responseEntity;
		
	}
	
	public UriComponentsBuilder build() {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(Constants.TRANSACT_URI)
				.queryParam("merchantID", this.transactionPayload.getMerchantID())
				.queryParam("merchantRef", this.transactionPayload.getMerchantRef())
				.queryParam("amount", String.valueOf(this.transactionPayload.getAmount()))
				.queryParam("expDate", this.transactionPayload.getExpDate()).queryParam("token", this.transactionPayload.getToken())
				.queryParam("successURL", this.transactionPayload.getSuccessURL())
				.queryParam("failURL", this.transactionPayload.getFailURL())
				.queryParam("transactionDescruption", this.transactionPayload.getTransactionDescription())
				.queryParam("receiptRemarks", this.transactionPayload.getReceiptRemarks())
				.queryParam("email", this.transactionPayload.getEmail()).queryParam("payload", this.transactionPayload.getPayload())
				.queryParam("returnPaymentDetails", this.transactionPayload.getReturnPaymentDetails());

		return builder;

	}
}
