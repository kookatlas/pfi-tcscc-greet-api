package in.koost.pfi_tcscc_greet_api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private Logger logger = LoggerFactory.getLogger(GreetController.class);

    @GetMapping("/greet")
    public String greet(){
        logger.info("GreetController greet api calling");
        return "Good morning all";
    }
}
