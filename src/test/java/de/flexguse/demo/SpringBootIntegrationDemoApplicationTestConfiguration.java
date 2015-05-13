/**
 * 
 */
package de.flexguse.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import de.flexguse.demo.controller.SpringBootIntegrationController;
import de.flexguse.demo.service.HelloService;
import de.flexguse.demo.service.impl.HelloServiceTestImpl;

/**
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableWebMvcSecurity
public class SpringBootIntegrationDemoApplicationTestConfiguration extends
	WebSecurityConfigurerAdapter {

    @Bean
    public HelloService helloService() {
	return new HelloServiceTestImpl();
    }
    
    @Bean
    public SpringBootIntegrationController controller(){
	return new SpringBootIntegrationController();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET, "/helloWorld")
		.hasIpAddress("127.0.0.1").anyRequest().authenticated();
    }

}
