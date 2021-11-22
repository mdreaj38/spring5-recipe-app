package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}