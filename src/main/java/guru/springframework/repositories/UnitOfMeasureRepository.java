package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rejaul.reaj
 * @since 11/23/21
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}