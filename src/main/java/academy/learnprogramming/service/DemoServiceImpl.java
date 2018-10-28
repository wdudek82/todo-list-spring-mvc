package academy.learnprogramming.service;

import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHelloMessage(String user) {
        return String.format("Hello, %s", user);
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo application!:)";
    }

}
