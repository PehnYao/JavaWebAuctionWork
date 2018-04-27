package org.csu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    *设置主页
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String Index(){
        return "forward:/src/web/log.html";
    }
}
