package de.flexguse.demo.service.impl;

import de.flexguse.demo.service.HelloService;

/**
 * Simple service implementation which gives another greeting than
 * {@link HelloServiceImpl} to make clear the integration test uses another
 * service implementation than the application itself.
 */
public class HelloServiceTestImpl implements HelloService {

    @Override
    public String getGreeting() {
	return "Hello World, this is a test!";
    }

}
