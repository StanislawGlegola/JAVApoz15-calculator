package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ProcentageOperationConfiguration {

    @Bean
    ProcentageOperation procentageOperation() {
        return new ProcentageOperation();
    }
}
