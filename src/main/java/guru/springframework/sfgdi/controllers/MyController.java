package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Lenovo on 27-02-2020.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
       // System.out.println("Howdy Shiv  ");
        return greetingService.sayGreeting("Howdy Devbappa");
    }

}
