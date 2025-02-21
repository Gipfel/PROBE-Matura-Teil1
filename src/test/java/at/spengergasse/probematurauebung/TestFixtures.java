package at.spengergasse.probematurauebung;

import at.spengergasse.probematurauebung.domain.Alumni;
import at.spengergasse.probematurauebung.domain.Department;
import at.spengergasse.probematurauebung.domain.Notification;
import at.spengergasse.probematurauebung.domain.Template;

import java.time.LocalDateTime;

public class TestFixtures {
    public static Department department() {
        return Department.builder()
                .name("Department of Computer Science")
                .build();
    }

    public static Alumni alumni() {
        return Alumni.builder()
                .firstName("Max")
                .lastName("Mustermann")
                .finalYear(2021)
                .department(department())
                .email("dskjlksfjlkfs@dksfjksdf.de")
                .build();
    }

    public static Notification notification() {
        return Notification.builder()
                .recipient("Hello World")
                .creationTS(LocalDateTime.now())
                .subject("Jetzt")
                .body("Hello World")
                .template(Template.builder().name("Testname").build())
                .alumni(alumni())
                .build();
    }
}
