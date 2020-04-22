package camisnew.exemple_databaseJPA.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString

@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "salario")
    private double income;

}
