package kr.kdev.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index_Controller {
    @GetMapping("/")
    public String index() {
//        System.out.println("sss");
        return "ok";
    }
}
