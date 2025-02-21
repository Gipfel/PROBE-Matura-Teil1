package at.spengergasse.probematurauebung.persistence;

import at.spengergasse.probematurauebung.domain.Alumni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumniRepository extends JpaRepository<Alumni, Long> {
}
