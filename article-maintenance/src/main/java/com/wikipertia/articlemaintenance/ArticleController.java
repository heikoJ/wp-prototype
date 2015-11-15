package com.wikipertia.articlemaintenance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heiko on 14.11.15.
 */
@Controller
public class ArticleController {


    @RequestMapping(value = "/article", produces="text/html")
    public String greeting( Model model) {
        model.addAttribute("name", "Article Controller");
        return "article";
    }


}
