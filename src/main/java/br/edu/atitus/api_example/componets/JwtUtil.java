package br.edu.atitus.api_example.componets;

import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {

		private static final String SECRET_KEY="chavesecretaSaudeFacilOJoaoEUmLindao39x";
		private static final long EXPIRATION_TIME =1000*60*60*24;
		
		private static SecretKey getSecretKey() {
			return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
		}
		
		public static String generatetoken(String email) {
			return Jwts.builder()
					.subject(email)
					.issuedAt(new Date())
					.expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
					.signWith(getSecretKey())
					.compact();
		}

}
