package com.botcatalogs.consumer.responsemessage.receiver;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ResponseReceiver {

    private CountDownLatch latch = new CountDownLatch(1);

    @RabbitListener(queues="spring-boot")
    public void receiveMessage(byte[] message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}