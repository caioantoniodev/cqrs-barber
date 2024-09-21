package tech.dev.msbarbercommand.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "appointments")
public class AppointmentEntity  extends BaseEntity {

    @Column(nullable = false)
    private String dateTime;

    @Column(nullable = false)
    private String appointmentsOpen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "barber_procedure_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BarberProcedureEntity barberProcedure;
}
