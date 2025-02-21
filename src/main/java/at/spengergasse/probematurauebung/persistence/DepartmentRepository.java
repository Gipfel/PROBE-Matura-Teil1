package at.spengergasse.probematurauebung.persistence;

import at.spengergasse.probematurauebung.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
