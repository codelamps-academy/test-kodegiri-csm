package com.kodegiri.kodegiri_test_cms.controller;

import com.kodegiri.kodegiri_test_cms.service.UserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 07.40
 * description: Kodegiri_Test_CMS
 */

@Controller
public class LoginController {

//    Logger log = LoggerFactory.getLogger(LoginController.class);
//
//    @GetMapping("/login")
//    ModelAndView login(@RequestParam Optional<String> error){
//        log.info("Calling Login");
//        ModelAndView modelAndView = new ModelAndView("login/login");
//        if (error.isPresent()){
//            modelAndView.addObject("error", "Invalid Credentials");
//        }
//        return modelAndView;
//    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(Authentication authentication){
        UserDetailsService userDetailsService = (UserDetailsService) authentication.getPrincipal();
        return "home";
    }
}
