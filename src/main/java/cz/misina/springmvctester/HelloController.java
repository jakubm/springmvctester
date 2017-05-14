package cz.misina.springmvctester;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
@RequestMapping("")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello, World");
        System.out.println("hello");

        return "hello";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        model.addAttribute("ts", LocalDate.now());
        model.addAttribute("pageInfo", "Something here...");
        System.out.println("test");

        return "test";
    }
}
