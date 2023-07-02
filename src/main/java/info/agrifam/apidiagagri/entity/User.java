package info.agrifam.apidiagagri.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;


import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 30, nullable = false, unique = true)
    private String username;

    @Column(length = 60, nullable = false)
    private String password;

    private Integer isEnabled;

    @OneToMany(mappedBy = "user")
    @ToString.Exclude
    private List<Sale> sales;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return getId() != null && Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
