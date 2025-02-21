package at.spengergasse.probematurauebung.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Template extends AbstractPersistable<Long> {
    @Column(unique = true)
    private String name;
    private String subject;
    private String body;
}
