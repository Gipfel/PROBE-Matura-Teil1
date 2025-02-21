package at.spengergasse.probematurauebung.persistence;

import at.spengergasse.probematurauebung.TestFixtures;
import at.spengergasse.probematurauebung.domain.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    void testSaveDepartment() {
        Department department = TestFixtures.department();

        departmentRepository.saveAndFlush(department);

        assertNotNull(department.getId());
    }
}