package guru.springframework.repositories;

import guru.springframework.domain.Recipee;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
public interface RecipeeRepositoriy extends CrudRepository<Recipee, Long> {
}