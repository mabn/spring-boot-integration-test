/**
 * 
 */
package de.flexguse.demo.service.impl;

import de.flexguse.demo.service.HelloService;

/**
 * @author Christoph Guse, info@flexguse.de
 *
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String getGreeting() {
	return "Hello World!";
    }

}
