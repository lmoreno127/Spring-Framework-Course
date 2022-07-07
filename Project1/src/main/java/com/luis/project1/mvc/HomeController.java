package com.luis.project1.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMenu(){
        return "main-menu";
    }

    @RequestMapping("/showform")
    public String showForm(){
        return "show-form";
    }
    @RequestMapping("/sendDataForm")
    public String sendDataForm(){
        return "success-message";
   }

   @RequestMapping("/sendDataForm2")
   public String sendDataForm2(HttpServletRequest request, Model model){

        String name = request.getParameter("name");
        name = name.toUpperCase();
        String luisname= "Your Name is : LUIS!! " + name;
        model.addAttribute("luisname",luisname);
        System.out.println("dda");
        return "success-message";
   }
    @RequestMapping("/sendDataForm3")
    public String sendDataForm3(@RequestParam("name") String sentence, Model model){
        String result="Your sentence is: "+sentence;
        model.addAttribute("sentence",result);
        return "success-message";
    }
}
