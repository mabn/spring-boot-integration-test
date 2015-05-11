/**
 * 
 */
package de.flexguse.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.flexguse.demo.service.HelloService;

/**
 * The controller providing the REST webservice endpoints.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@RestController
public class SpringBootIntegrationController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/helloWorld")
    public String helloWorld() {
	return helloService.getGreeting();
    }

}
