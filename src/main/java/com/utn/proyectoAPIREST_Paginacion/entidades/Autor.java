package com.utn.proyectoAPIREST_Paginacion.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Autor")
public class Autor extends BaseEntidad{

    private String nombre;
    private String apellido;
    @Column(length = 1500)
    private String biografia;

}
