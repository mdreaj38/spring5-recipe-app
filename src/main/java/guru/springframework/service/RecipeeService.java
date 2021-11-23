package guru.springframework.service;

import guru.springframework.domain.Recipee;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
public interface RecipeeService {
    Set<Recipee> getRecipees();
}