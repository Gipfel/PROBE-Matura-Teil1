package at.spengergasse.probematurauebung.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Entity
@Getter
@Setter
public class Token extends AbstractPersistable<Long> {

    @Column(unique = true)
    private String value;
    private LocalDateTime validUntil;
    private TokenType tokenType;
    boolean used;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alumni_id", foreignKey = @ForeignKey(name = "FK_token_alumni"))
    private Alumni alumni;
}
