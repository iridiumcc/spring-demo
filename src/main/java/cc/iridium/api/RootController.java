package cc.iridium.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class RootController {

    @GetMapping
    public String hello() {
        return "Just a simple Spring application.";
    }

    @GetMapping(path = "{hello}")
    public String greet(
            @PathVariable("hello") String task,
            @RequestParam(required = false) String name) {

        if(name != null)
            return "Hello " + name + "!";

        return "Hello, unknown friend!";
    }

}
