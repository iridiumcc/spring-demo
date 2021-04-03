package cc.iridium.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                            "Mariam",
                            "mariam@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student felix = new Student(
                    "Felix",
                    "fpultar@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 14)
            );

            Student liselotte = new Student(
                    "Liselotte",
                    "lsnijders@gmail.com",
                    LocalDate.of(1988, Month.SEPTEMBER, 29)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 22)
            );

            repository.saveAll(
                    List.of(mariam, felix, liselotte, alex)
            );
        };
    }

}
