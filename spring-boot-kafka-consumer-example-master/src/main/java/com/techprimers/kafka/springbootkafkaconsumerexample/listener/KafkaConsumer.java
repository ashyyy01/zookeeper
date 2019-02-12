package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "artemis", containerFactory = "kafkaListenerContainerFactory")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "artemis_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}
}
