package academy.learnprogramming.controller;

import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    private DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello! :)";
    }

    // http://localhost:8080/todo-list/welcome
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("greetUser", demoService.getHelloMessage("Tim"));

        log.info("model = {}", model);

        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }

}
