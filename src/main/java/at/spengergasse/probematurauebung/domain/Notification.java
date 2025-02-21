package at.spengergasse.probematurauebung.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification extends AbstractPersistable<Long> {
    private String recipient;
    private LocalDateTime creationTS;
    private String subject;
    private String body;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "template_id", foreignKey = @ForeignKey(name = "FK_notification_template"))
    private Template template;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alumni_id", foreignKey = @ForeignKey(name = "FK_notification_alumni"))
    private Alumni alumni;
}
