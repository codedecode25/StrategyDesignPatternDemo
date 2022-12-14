package com.codedecode.StrategyDesignPattern.encrpt;

import org.springframework.stereotype.Service;

import com.codedecode.StrategyDesignPattern.enums.EncodingPatternEnum;

@Service
public class MD5Encryption implements Encryption {

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("I am encrypting using MD5 encryption Method");
		
	}

	@Override
	public EncodingPatternEnum getEncryptionType() {
		return EncodingPatternEnum.MD5;
	}

}
