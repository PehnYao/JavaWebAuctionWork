package org.csu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class SellController {
    @Autowired
    Mapper mapper;
    @GetMapping("/Sell")
    public ModelAndView toSell(@RequestParam(name = "price")int price){
        ModelAndView success = new ModelAndView("/success.html");
        if(mapper.sentGoods(price)){
           return success;
        }
        ModelAndView fail = new ModelAndView("/fail.html");
        return fail;
    }
}
