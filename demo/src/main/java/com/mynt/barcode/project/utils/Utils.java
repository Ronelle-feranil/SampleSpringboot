package com.mynt.barcode.project.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Utils {

	public static String createToken(String type, String merchantID, String merchantRef, String transactionKey) {
		
		String token = DigestUtils.sha1Hex(type.concat(merchantID).concat(merchantRef).concat(transactionKey));
		
		return token;
	}
	
	public static String createToken(String merchantID, String merchantRef, String transactionKey) {
		
		String token = DigestUtils.sha1Hex(merchantID.concat(merchantRef).concat(transactionKey));
		
		return token;
	}
	
	public static String createToken(String merchantRef, String transactionKey) {
		
		String token = DigestUtils.sha1Hex(merchantRef.concat(transactionKey));
		
		return token;
	}
	
	public static String createTokenSuccessOrFail(String merchantID, String merchantRef,String payId ,String transactionKey) {
		
		String token = DigestUtils.sha1Hex(merchantID.concat(merchantRef).concat(payId).concat(transactionKey));
		
		return token;
	}

}
