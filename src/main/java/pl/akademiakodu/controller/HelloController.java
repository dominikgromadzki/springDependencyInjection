package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dominikgromadzki on 28.03.2017.
 */

@Controller
public class HelloController {


    @GetMapping("/")
    @ResponseBody //zwraca stringa a nie html
    public String hello () {
        return "hello";
    }

    @GetMapping("/ewa")
    @ResponseBody
    public String helloEwa(){
        return "hello Ewa";
    }


    @GetMapping("/home")
    public String home(){
        return "home";
    }



}
