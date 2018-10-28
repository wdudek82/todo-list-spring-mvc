package academy.learnprogramming.controller.api;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class DemoApiController {

    private Gson gson = new Gson();

    @RequestMapping(value = "/api/users", method = RequestMethod.GET, produces = "application/json")
    public String getUsers() {
        Map<String, String> users = new HashMap<>();
        users.put("user1", "Tim");
        users.put("user2", "Neevor");
        return gson.toJson(users);
    }

}
