package com.codedecode.StrategyDesignPattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codedecode.StrategyDesignPattern.encrpt.Encryption;
import com.codedecode.StrategyDesignPattern.enums.EncodingPatternEnum;

@Component
public class EncryptionFactory {
	
	Map<EncodingPatternEnum, Encryption> map;
	
	@Autowired
	public EncryptionFactory(Set<Encryption> encryptionTypesSet){
		createStrategy(encryptionTypesSet);
	}

	private void createStrategy(Set<Encryption> encryptionTypesSet) {
		map = new HashMap<EncodingPatternEnum, Encryption>();
		encryptionTypesSet.stream()
				.forEach(encryptionTypes -> map.put(encryptionTypes.getEncryptionType(), encryptionTypes));
	}
	
	public Encryption findEncrytionType(EncodingPatternEnum encodingPatternEnum) {
		return map.get(encodingPatternEnum);
	}
	
	
	

}
