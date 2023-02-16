import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Scanner;

@Configuration // at this point ill need to import Spring into my Project so add it to the pom.xml as a dependencie
public class RecordConfiguration {


    @Bean
    Records storageinit(){
        return new Records();
    }

    @Bean
    PatientRecord patientinit(){
        return new PatientRecord();
    }

    @Bean
    VisitorRecord visitorinit(){
        return new VisitorRecord();
    }

    @Bean
    Controller controllerinit(){
        return new Controller();
    }
}
