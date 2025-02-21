package at.spengergasse.probematurauebung.persistence;

import at.spengergasse.probematurauebung.TestFixtures;
import at.spengergasse.probematurauebung.domain.Alumni;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AlumniRepositoryTest {

    @Autowired
    private AlumniRepository alumniRepository;

    @Test
    void testAlumniRepository() {
        Alumni alumni = TestFixtures.alumni();

        alumniRepository.saveAndFlush(alumni);

        assertNotNull(alumni.getId());
    }
}