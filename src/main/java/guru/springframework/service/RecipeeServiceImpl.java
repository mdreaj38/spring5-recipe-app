package guru.springframework.service;

import guru.springframework.domain.Recipee;
import guru.springframework.repositories.RecipeeRepositoriy;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
@Service
public class RecipeeServiceImpl implements RecipeeService {

    private final RecipeeRepositoriy recipeeRepositoriy;

    public RecipeeServiceImpl(RecipeeRepositoriy recipeeRepositoriy) {
        this.recipeeRepositoriy = recipeeRepositoriy;
    }

    @Override
    public Set<Recipee> getRecipees() {
        Set<Recipee> recipees = new HashSet<>();
        recipeeRepositoriy.findAll().iterator().forEachRemaining(recipees::add);
        return recipees;
    }
}