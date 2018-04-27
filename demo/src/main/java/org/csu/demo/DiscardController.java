package org.csu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class DiscardController {
    @Autowired
    Mapper mapper;
    @RequestMapping("/discard")
    public ModelAndView toDiscard(@RequestParam(name = "id")int id){
        ModelAndView success = new ModelAndView("/success.html");
        if(mapper.discardGoods(id)){
            return success;
        }
        ModelAndView fail = new ModelAndView("/fail.html");
        return fail;
    }
}
