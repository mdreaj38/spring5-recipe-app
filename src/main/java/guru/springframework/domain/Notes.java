package guru.springframework.domain;

import javax.persistence.*;

/**
 * @author rejaul.reaj
 * @since 11/22/21
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipee recipee;
    @Lob
    private String recipeeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipee getRecipee() {
        return recipee;
    }

    public void setRecipee(Recipee recipee) {
        this.recipee = recipee;
    }

    public String getRecipeeNotes() {
        return recipeeNotes;
    }

    public void setRecipeeNotes(String recipeeNotes) {
        this.recipeeNotes = recipeeNotes;
    }
}