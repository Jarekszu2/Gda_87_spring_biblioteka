package pl.sda.javagda25.springbiblioteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // domyślnie request mapping "/"
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index() { // domyślnie request mapping "/"
        return "index";
    }
}
