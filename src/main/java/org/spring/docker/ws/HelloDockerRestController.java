package org.spring.docker.ws;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloDockerRestController {

    @RequestMapping("/hello/{name}")
    public String helloDocker(@PathVariable(value = "name") String name) {
        String response = Thread.currentThread().getName() + " : " + this.toString() + " : Hello " + name + ", response received on : " + new Date();
        System.out.println(response);
        return response;
    }
}
