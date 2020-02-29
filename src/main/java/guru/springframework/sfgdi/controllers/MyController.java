package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Lenovo on 27-02-2020.
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Howdy Shiv  ");


        return"Howdy Devbappa";
    }
}
