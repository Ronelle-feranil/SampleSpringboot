package com.mynt.barcode.project.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.mynt.barcode.project.payload.Payload;

public interface Service {
	
	public ResponseEntity<String> process();
	
	UriComponentsBuilder build();
}
