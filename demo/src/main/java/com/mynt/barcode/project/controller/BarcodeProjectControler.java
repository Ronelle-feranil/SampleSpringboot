package com.mynt.barcode.project.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mynt.barcode.project.payload.ReferencePayload;
import com.mynt.barcode.project.payload.SuccessFailPayload;
import com.mynt.barcode.project.payload.TransactPayload;
import com.mynt.barcode.project.service.ReferenceService;
import com.mynt.barcode.project.service.TransactService;

@RestController
public class BarcodeProjectControler {
	
	
	@RequestMapping(value="/v1/transact", method=RequestMethod.POST)
	public ResponseEntity<String> processTransact(@RequestBody TransactPayload payload) {
		
		TransactService service = new TransactService(payload);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TransactPayload>> violations = validator.validate(payload);
				
		if (!(violations.toString().length() < 3)) {
			throw new RuntimeException("Unable to process this request");
		}
		
		return service.process();
	}
	
	@RequestMapping(value="/v1/reference", method=RequestMethod.POST)
	public ResponseEntity<String> processReference(@RequestBody ReferencePayload payload) {
		
		ReferenceService service = new ReferenceService(payload);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ReferencePayload>> violations = validator.validate(payload);
				
		if (!(violations.toString().length() < 3)) {
			throw new RuntimeException("Unable to process this request");
		}
		
		return service.process();
	}
	
	@RequestMapping(value="/v1/success", method=RequestMethod.POST)
	public String processSuccess(@RequestBody SuccessFailPayload payload) {
		
		return processSuccessFail(payload);
	}
	
	@RequestMapping(value="/v1/fail", method=RequestMethod.POST)
	public String processFail(@RequestBody SuccessFailPayload payload) {
		
		return processSuccessFail(payload);
	}
	
	
	public String processSuccessFail(@RequestBody SuccessFailPayload payload) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SuccessFailPayload>> violations = validator.validate(payload);
				
		if (!(violations.toString().length() < 3)) {
			throw new RuntimeException("Unable to process this request");
		}
		
		return payload.toString();
	}
	
}
