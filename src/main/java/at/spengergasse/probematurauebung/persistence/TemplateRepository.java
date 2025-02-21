package at.spengergasse.probematurauebung.persistence;

import at.spengergasse.probematurauebung.domain.Template;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {
}
