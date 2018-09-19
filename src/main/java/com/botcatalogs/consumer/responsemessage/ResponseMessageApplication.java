package com.botcatalogs.consumer.responsemessage;

import com.botcatalogs.consumer.responsemessage.receiver.ResponseReceiver;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResponseMessageApplication {

	static final String topicExchangeName = "spring-boot-exchange";

	static final String queueName = "spring-boot";
	
	public static void main(String[] args) {
		SpringApplication.run(ResponseMessageApplication.class, args);
	}
}
