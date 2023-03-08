package com.chetan.farmfresh;

import com.chetan.farmfresh.model.Inquiry;
import com.chetan.farmfresh.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String index1(Model model){
        model.addAttribute("books", homeService.getBooks());
        model.addAttribute("inquiry", new Inquiry());
        return "index.html";
    }

    @GetMapping("/index.html")
    public String index(Model model)
    {
        model.addAttribute("books", homeService.getBooks());
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }


    @GetMapping("/about.html")
    public String about(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "about";
    }
    @GetMapping("/contact.html")
    public String contact(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "contact";
    }
    @GetMapping("/blog.html")
    public String blog(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "blog";
    }

    @GetMapping("/shop.html")
    public String Book(Model model){

        model.addAttribute("books", homeService.getBooks());
        model.addAttribute("inquiry", new Inquiry());
        return "shop";
    }

    @PostMapping("/shop.html")
    public String searchBook(Model model, @ModelAttribute Inquiry inquiry){

        String authorName  = inquiry.getSearchString();

        model.addAttribute("books", homeService.searchBooks(authorName));
        return "shop";
    }
}
