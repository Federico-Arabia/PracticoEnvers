package Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Domicilio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Audited

public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreCalle;
    private int numero;

    // Para que sea bidireccional
    /*@OneToOne(mappedBy = "domicilio")
    private Cliente cliente;*/
}
