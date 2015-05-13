/**
 * 
 */
package de.flexguse.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import de.flexguse.demo.service.HelloService;
import de.flexguse.demo.service.impl.HelloServiceImpl;

/**
 * The spring configuration for {@link SpringBootIntegrationDemoApplication}.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Configuration
@EnableWebMvcSecurity
public class SpringBootIntegrationDemoApplicationConfiguration extends
	WebSecurityConfigurerAdapter {

    @Bean
    public HelloService helloService() {
	return new HelloServiceImpl();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET, "/helloWorld")
		.hasIpAddress("127.0.0.1").anyRequest().authenticated();
    }

}
