package jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class Controller {

    @RequestMapping("/test2")
    public String test1(){
        return "this is jenkins test2";
    }
}
