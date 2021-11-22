package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author rejaul.reaj
 * @since 11/22/21
 */
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipee recipee;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipee getRecipee() {
        return recipee;
    }

    public void setRecipee(Recipee recipee) {
        this.recipee = recipee;
    }
}