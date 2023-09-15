package com.example.rasmirabbitconsumer.component;

import com.example.rasmirabbitconsumer.model.Hospital;
import com.example.rasmirabbitconsumer.model.Patient;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class RabbitMQConsumer {

    @Value("{$rabbitmq.queue.name}")
    String queueName;
    @Value("{$rabbitmq.exchange.name}")
    String exchange;
    @Value("{$rabbitmq.routingkey.name}")
    private int routingkey;

    @Bean
    public Jackson2JsonMessageConverter converter()
    {
        return new Jackson2JsonMessageConverter();
    }

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void ReceivedMessage(Hospital hospital)
    {
        System.out.println("Received message from RabbitMQ-Hospital"+hospital);
    }

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void ReceivedMessage(Patient patient)
    {
        System.out.println("Received message from RabbitMQ-Patient"+patient);
    }


}
