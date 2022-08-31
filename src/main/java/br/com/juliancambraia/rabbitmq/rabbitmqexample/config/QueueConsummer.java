package br.com.juliancambraia.rabbitmq.rabbitmqexample.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsummer {
    @RabbitListener(queues = "${queue.name}")
    public void receive(@Payload String fileBody) {
        System.out.printf("Message " + fileBody);
    }
}
