package de.solovyov.spring.HelloWorld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yuriysolovyov
 */
@RestController
public class HelloWorldController {
    
    @RequestMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
