package guru.springframework.service;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeeRepositoriy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
@Slf4j
@Service
public class RecipeeServiceImpl implements RecipeeService {

    private final RecipeeRepositoriy recipeeRepositoriy;

    public RecipeeServiceImpl(RecipeeRepositoriy recipeeRepositoriy) {
        this.recipeeRepositoriy = recipeeRepositoriy;
    }

    @Override
    public Set<Recipe> getRecipees() {
        log.debug("Inside Service");
        Set<Recipe> recipees = new HashSet<>();
        recipeeRepositoriy.findAll().iterator().forEachRemaining(recipees::add);
        return recipees;
    }
    public Recipe findById(Long id){
        Optional<Recipe> recipeeOptional = recipeeRepositoriy.findById(id);
        if(!recipeeOptional.isPresent()){
            throw new RuntimeException("REcipee not found");
        }
        return recipeeOptional.get();
    }
}