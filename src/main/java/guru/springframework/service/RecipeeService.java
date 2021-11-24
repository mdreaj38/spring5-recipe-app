package guru.springframework.service;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
public interface RecipeeService {
    Set<Recipe> getRecipees();
    Recipe findById(Long id);
}