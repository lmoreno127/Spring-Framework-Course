package com.travel.exercise2.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller

public class TravelerController {

    @RequestMapping("/")
    public String mainPage(){
        return "main-menu";
    }

   @RequestMapping("/showForm")
   public String showTravelerForm(Model model){

       Traveler traveler = new Traveler();
       model.addAttribute("traveler",traveler);
       return "show-form";
   }
   @RequestMapping("processForm")
    public String processForm(@Valid @ModelAttribute("traveler") Traveler traveler, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "show-form";
        }
        return "show-traveler";
   }
}
