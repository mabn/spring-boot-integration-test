package de.flexguse.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * The Spring-Boot application providing a REST webservice which greets the
 * user.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@SpringBootApplication
@SpringApplicationConfiguration(classes = SpringBootIntegrationDemoApplicationConfiguration.class)
public class SpringBootIntegrationDemoApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootIntegrationDemoApplication.class, args);
    }
}
