package br.com.juliancambraia.rabbitmq.rabbitmqexample.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amqp-exchanges")
public class AMQPController {

    private final AmqpTemplate queueSender;

    @Autowired
    public AMQPController(AmqpTemplate amqpTemplate) {
        this.queueSender = amqpTemplate;
    }

    @GetMapping
    public String send() {
        queueSender.convertAndSend("exchange-springboot", "rounting-springboot", "Mensagem de Teste sendo enviada....");
        return "ok. done";
    }
}
