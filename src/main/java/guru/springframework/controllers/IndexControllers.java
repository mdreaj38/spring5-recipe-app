package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rejaul.reaj
 * @since 11/22/21
 */
@Controller
public class IndexControllers {

    @RequestMapping({"", "/index"})
    public String getIndex() {
        return "index";
    }
}