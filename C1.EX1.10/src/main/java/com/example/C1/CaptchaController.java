package com.example.C1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;
@Controller
public class CaptchaController {
    @GetMapping("/captcha")
    public String showCaptcha(Model model) {
        Random random = new Random();
        int number = random.nextInt(4) + 1;
        String captchaImage = "captcha" + number + ".png";
        model.addAttribute("captchaImage",captchaImage);

        return "captcha";


    }

}