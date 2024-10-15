package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class InputController {

	@GetMapping("/input")
    public void getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
    }
}
