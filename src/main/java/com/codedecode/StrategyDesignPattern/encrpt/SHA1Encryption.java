package com.codedecode.StrategyDesignPattern.encrpt;

import org.springframework.stereotype.Service;

import com.codedecode.StrategyDesignPattern.enums.EncodingPatternEnum;


@Service
public class SHA1Encryption implements Encryption {

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("I am encrypting using SHA1 encryption Method");
		
	}

	@Override
	public EncodingPatternEnum getEncryptionType() {
		return EncodingPatternEnum.SHA1;
	}

}
