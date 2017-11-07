package com.mynt.barcode.project.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mynt.barcode.project.domain.ValidateConfirmResponse;
import com.mynt.barcode.project.payload.RequestPayload;
import com.mynt.barcode.project.utils.Constants;

public class ConfirmValidateService {
	public ResponseEntity<ValidateConfirmResponse> confirmValidate(RequestPayload requestPayload) {

		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder uri = build(requestPayload);
		ResponseEntity<ValidateConfirmResponse> responseEntity = restTemplate.postForEntity(uri.toUriString(), null,
				ValidateConfirmResponse.class);
		return responseEntity;
	}

	private UriComponentsBuilder build(RequestPayload requestPayload) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(Constants.REFERENCE_URI)
				.queryParam("type", requestPayload.getType()).queryParam("merchantID", requestPayload.getMerchantID())
				.queryParam("merchantRef", requestPayload.getMerchantRef())
				.queryParam("amount", requestPayload.getAmount().toString())
				.queryParam("token", requestPayload.getToken()).queryParam("authCode", requestPayload.getAuthCode())
				.queryParam("responseCode", requestPayload.getResponseCode());

		return builder;
	}
}
