package org.myCompany.mycup.configurations;
/**
 * The RestTemplateConfiguration class configures the RestTemplate bean used for
 * making HTTP requests to external services. It ensures that the application
 * has a properly configured RestTemplate available for dependency injection.
 * - Defines a RestTemplate bean that can be injected into service classes.
 * - Used by services like FakeStoreProductService to interact with external APIs.
 * - Ensures that the RestTemplate is consistently configured across the application, promoting reusability and maintainability.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
