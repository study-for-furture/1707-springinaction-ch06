package com.chap05.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by mitmo on 2017-09-03.
 */
@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {
    @RequestMapping(method=GET)
    public String home() {
        return "home";
    }
}
