package com.qamber.disctionaryapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/meaning")
public class AppController {
	
	
	@RequestMapping()
	public List<Object> getMeaning(@RequestParam String word, Model model){
			String url = "https://api.dictionaryapi.dev/api/v2/entries/en/";
			RestTemplate restTemplate = new RestTemplate();
			Object[] data = restTemplate.getForObject(url+word,Object[].class);
			
			return Arrays.asList(data);
			//return is not working... so I will watch session19 to understand the redirection pages and put response.
	}
	

}
