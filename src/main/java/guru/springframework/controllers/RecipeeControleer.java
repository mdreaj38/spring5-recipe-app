package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import guru.springframework.service.RecipeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rejaul.reaj
 * @since 11/24/21
 */
@Controller
public class RecipeeControleer {

    private final RecipeeService recipeeService;

    public RecipeeControleer(RecipeeService recipeeService) {
        this.recipeeService = recipeeService;
    }

    @RequestMapping(value = "/recipe/show/{id}")
    public String showById(@PathVariable String id, Model model) {
        Recipe recipe = recipeeService.findById(Long.valueOf(id));
        model.addAttribute("recipe", recipe);
        System.out.println("------->" + recipe.getDescription());
        return "recipe/show";
    }
}