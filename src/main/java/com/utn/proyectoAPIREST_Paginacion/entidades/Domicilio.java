package com.utn.proyectoAPIREST_Paginacion.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends BaseEntidad{

    private String calle;
    private int numero;
    @ManyToOne(optional = false, cascade = CascadeType.ALL) //Esto hace que este atributo NO puede ser nulo al momento de crear el objeto dimicilio
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;
}
