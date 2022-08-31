package br.com.juliancambraia.rabbitmq.rabbitmqexample.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue testQueue() {
        return new Queue("fila-springboot", true);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange("exchange-springboot");
    }

    @Bean
    Binding testBinding(Queue testQueue, DirectExchange exchange) {
        return BindingBuilder.bind(testQueue).to(exchange).with("rounting-springboot");
    }
}
