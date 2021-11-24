package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author rejaul.reaj
 * @since 11/22/21
 */

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipee recipee;

    @Lob
    private String recipeeNotes;

    public Notes() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Notes;
    }

}