package com.search.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search.dto.Lead;

@Component
public class LeadRestClient {

	public Lead getLeadInfo(long id) {

		try {
			RestTemplate restTemplate = new RestTemplate();	
		      Lead lead =  restTemplate.getForObject("http://localhost:8080/api/leads/find/"+id, Lead.class);
			return lead;
		} catch (Exception e) {

		e.printStackTrace();
		}
		return null;
	}
}
