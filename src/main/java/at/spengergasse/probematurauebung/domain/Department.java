package at.spengergasse.probematurauebung.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Department extends AbstractPersistable<Long> {
    @Column(unique = true)
    private String name;
}
