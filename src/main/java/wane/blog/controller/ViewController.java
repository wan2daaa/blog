package wane.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/study")
    public String study() {
        return "study";
    }

    @RequestMapping("/board")
    public String board() {
        return "board";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

}
