package com.mynt.barcode.project.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mynt.barcode.project.payload.Payload;
import com.mynt.barcode.project.payload.ReferencePayload;
import com.mynt.barcode.project.utils.Constants;

public class ReferenceService implements Service {

	ReferencePayload referencePayload;
	public ReferenceService(Payload payload) {
		this.referencePayload = (ReferencePayload) payload;
	}
	
	public ResponseEntity<String> process() {

		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder uri = build();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(uri.toUriString(), null, String.class);
		
		// TODO - modify the response data as per ESB requirements
		return responseEntity;
		
	}

	@Override
	public UriComponentsBuilder build() {
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(Constants.REFERENCE_URI)
				.queryParam("merchantID", this.referencePayload.getMerchantID())
				.queryParam("merchantRef", this.referencePayload.getMerchantRef())
				.queryParam("amount", String.valueOf(this.referencePayload.getAmount()))
				.queryParam("token", this.referencePayload.getToken()).queryParam("email", this.referencePayload.getEmail())
				.queryParam("expDate", this.referencePayload.getExpDate())
				.queryParam("receiptRemarks", this.referencePayload.getReceiptRemarks())
				.queryParam("returnPaymentDetails", this.referencePayload.getReturnPaymentDetails())
				.queryParam("transactionDescruption", this.referencePayload.getTransactionDescription())
				.queryParam("payload", this.referencePayload.getPayload());

		return builder;
		
	}

}