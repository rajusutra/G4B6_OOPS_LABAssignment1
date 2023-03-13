package com.gl.gradedproject1.service;

import java.util.Random;

public class CredentialService {
		
		public	String generatePassword()
		{
			String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallLetters = "abcdefghijklmnopqrstuvwxyz";
			String numbers ="1234567890";
			String specialchar= "~!@#$%^&*()_+-=";		
			String pswd="";
			Random random=new Random();
			pswd+=capitalLetters.charAt(random.nextInt(capitalLetters.length()));
			pswd+=capitalLetters.charAt(random.nextInt(capitalLetters.length()));
			pswd+=smallLetters.charAt(random.nextInt(smallLetters.length()));
			pswd+=smallLetters.charAt(random.nextInt(smallLetters.length()));
			pswd+=numbers.charAt(random.nextInt(numbers.length()));
			pswd+=numbers.charAt(random.nextInt(numbers.length()));
			pswd+=specialchar.charAt(random.nextInt(specialchar.length()));
			pswd+=specialchar.charAt(random.nextInt(specialchar.length()));
			
			
		return pswd;
		
		}
				

}
