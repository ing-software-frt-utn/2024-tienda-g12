package ingSoftware.laTienda.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity @NoArgsConstructor @AllArgsConstructor @ToString
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descripcion;
}
