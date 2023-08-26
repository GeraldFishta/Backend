package com.epicode.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class IncendiController {

	@GetMapping("/alarm")
	public String controlSonde(
			@RequestParam("idsonda") Long id,
			@RequestParam("lat") String latitude,
			@RequestParam("lon") String longitude,
			@RequestParam("smokelevel") int lvl
			) {
		
		HttpServletRequest request = ( (HttpServletRequest) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest() );
		String url = request.getRequestURI();
		String queryString = request.getQueryString();
		System.out.println( "URL: [ http://localhost:8082/" + url + "?" + queryString + " ]" );

		if ( lvl > 5 ) {
			
			System.out.println("ALARM!" + "la sonda" + id + "alle coordinate (" + latitude + "," + longitude + " sta segnalando un emergenza");
			
		}
		
		
		return "Allarme!";
	}
}
