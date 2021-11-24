package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author rejaul.reaj
 * @since 11/22/21
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}