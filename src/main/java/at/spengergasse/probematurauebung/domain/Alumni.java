package at.spengergasse.probematurauebung.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Alumni extends AbstractPersistable<Long> {

    private String firstName;

    private String lastName;

    private int finalYear;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", foreignKey = @ForeignKey(name = "FK_alumni_department"))
    private Department department;

    @Column(unique = true)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "promoter_id", foreignKey = @ForeignKey(name = "FK_alumni_promoter"))
    private Alumni promoter;

    @OneToMany(mappedBy = "alumni", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Token> tokens;
}
