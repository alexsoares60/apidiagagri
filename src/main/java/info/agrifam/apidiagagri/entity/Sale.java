package info.agrifam.apidiagagri.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@Table(name = "sale")
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sale_date", nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "sale", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<ItemSale> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Sale sale = (Sale) o;
        return getId() != null && Objects.equals(getId(), sale.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
