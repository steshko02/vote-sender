package senla.steshko.jms;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import senla.steshko.configuration.RabbitMq;

@Component
@RequiredArgsConstructor
public class Sender {

    private final RabbitTemplate rabbitTemplate;

    public void send() {
        System.out.println ("send mess:");
        rabbitTemplate.convertAndSend(RabbitMq.QK_EXAMPLE_QUEUE,"Hello from JMS: Rabbit!!!");
    }
}
