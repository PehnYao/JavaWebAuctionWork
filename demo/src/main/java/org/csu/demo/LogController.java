package org.csu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LogController {

    @Autowired
    Mapper mapper;
    @GetMapping("/log")
    public ModelAndView toLog(@RequestParam(name = "id")int id,@RequestParam(name = "password")int password){
        if (password == mapper.getPassword(id)){
            ModelAndView frontPage = new ModelAndView("/web/front.html");
            return frontPage;
        }
        ModelAndView fail = new ModelAndView("/fail.html");
        return fail;
    }

}
