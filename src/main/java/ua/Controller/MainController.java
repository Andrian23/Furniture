package ua.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yaromyryaremko on 15.09.16.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String homePage(){
        return "main";
    }
}
