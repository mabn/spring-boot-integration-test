package de.flexguse.demo;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * The integration test which starts
 * {@link SpringBootIntegrationDemoApplication} using the test app configuration
 * {@link SpringBootIntegrationDemoApplicationTestConfiguration}.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { SpringBootIntegrationDemoApplicationTestConfiguration.class })
@WebIntegrationTest("server.port:0")
public class SpringBootIntegrationDemoApplicationTests {

    @Value("${local.server.port}")
    private int serverPort;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGreetingService() throws RestClientException,
	    URISyntaxException {

	RestTemplate restTemplate = new RestTemplate();

	String greeting = restTemplate.getForObject(
		new URI(String.format("http://localhost:%s/helloWorld",
			serverPort)), String.class);
	assertEquals("Hello World, this is a test!", greeting);

    }
}
