package at.spengergasse.probematurauebung.persistence;

import at.spengergasse.probematurauebung.TestFixtures;
import at.spengergasse.probematurauebung.domain.Notification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NotificationRepositoryTest {

    @Autowired
    private NotificationRepository notificationRepository;

    @Test
    void testNotificationRepository() {
        Notification notification = TestFixtures.notification();

        notificationRepository.saveAndFlush(notification);

        assertNotNull(notification.getId());
    }
}