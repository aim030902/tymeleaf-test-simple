package uz.aim.employeetesttymeleaf.domains;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author : Abbosbek Murodov
 * @since : 05/05/23 / 23:27
 * Project : employee-test-tymeleaf / IntelliJ IDEA
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String department;

}
