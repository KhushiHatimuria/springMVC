package com.khushi.jobapp.controller;

import com.khushi.jobapp.model.job;
import com.khushi.jobapp.service.jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @Autowired
    //spring injects the existing jobservice bean into this class
    private jobservice jobserv;


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(job j){

        jobserv.addjobs(j);
        return "redirect:/viewalljobs";
    }


    @GetMapping("/viewalljobs")
    public String viewalljobs(Model model){
// this Model is spring's interface that sends data from the controller to the html
         model.addAttribute("jobs",
                 jobserv.getalljobs());
         return "viewalljobs";
    }
}
