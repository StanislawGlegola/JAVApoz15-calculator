package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DivisionOperationConfiguration {
    private String message ="By zero.";
    @Bean
    DivisionOperation divisionOperation() {
        return new DivisionOperation(message);
    }

}