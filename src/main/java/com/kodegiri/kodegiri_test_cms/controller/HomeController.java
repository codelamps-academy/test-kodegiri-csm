package com.kodegiri.kodegiri_test_cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 09.24
 * description: Kodegiri_Test_CMS
 */

@Controller
public class HomeController {

    Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    String index(){
        return "hello";
    }
}
