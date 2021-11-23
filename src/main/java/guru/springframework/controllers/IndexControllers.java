package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.service.RecipeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author rejaul.reaj
 * @since 11/22/21
 */
@Controller
public class IndexControllers {

    private final RecipeeService recipeeService;

    public IndexControllers(RecipeeService recipeeService) {
        this.recipeeService = recipeeService;
    }

    @RequestMapping({"", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("recipees", recipeeService.getRecipees());
        return "index";
    }
}