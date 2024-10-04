package com.nt;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String key = "kiran";
		String token =
		Jwts.builder()
		.setId("A43")
		.setSubject("AJAY")
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(5)))
		.signWith(SignatureAlgorithm.HS512, 
				Base64.getEncoder().encode(key.getBytes()))
		.compact();
		System.out.println(token);
		
		Claims c=
		Jwts.parser()
		.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
		.parseClaimsJws(token)
		.getBody();
		
		System.out.println(c.getId());
		System.out.println(c.getIssuer());
		System.out.println(c.getExpiration());
		System.out.println(c.getSubject());
		
	}
 
}
