package com.wikipertia.articlesearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heiko on 14.11.15.
 */
@Controller
@CrossOrigin
public class ArticleSearchController {

    @RequestMapping(value="/articleSearch", headers={"X-Requested-With!=XMLHttpRequest"})
    public String greeting( Model model) {
        model.addAttribute("name", "Article Search Controller");
        return "articleSearch";
    }



    @RequestMapping(value = "/articleSearch", headers={"X-Requested-With=XMLHttpRequest"})
    public String articleSearch(Model model) {
        return "partial/articleSearch";
    }

}
