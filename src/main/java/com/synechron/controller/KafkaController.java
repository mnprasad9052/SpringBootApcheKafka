package com.synechron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.service.Producer;

@RestController
@RequestMapping("/api")
public class KafkaController {
	@Autowired
	private Producer producer;
	
	@PostMapping("/publish")
	public void sendMessageToKakfa(@RequestParam("message")String message) {
		producer.sendMessageToKafka(message);
	}
	
	

}
