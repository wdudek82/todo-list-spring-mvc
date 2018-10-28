package academy.learnprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello! :)";
    }

    // http://localhost:8080/todo-list/welcome
    @GetMapping("welcome")
    public String welcome() {
        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }

}
