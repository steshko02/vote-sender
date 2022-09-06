package senla.steshko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableEurekaClient
public class VoteSenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(VoteSenderApplication.class, args);
    }

}