package khan.application.stringgenerator.configuration;


import org.apache.commons.text.RandomStringGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComTextConfiguration {

    @Bean
    RandomStringGenerator textGenerator() {
        return RandomStringGenerator.builder()
                .withinRange('a', 'z')
                .build();
    }

}
