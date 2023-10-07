package com.utn.proyectoAPIREST_Paginacion.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidad extends BaseEntidad{

    private String denominacion;

}
