package ProjectOne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ohlaph on 11/1/2015.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    String login() {
        return "login";
    }

}
