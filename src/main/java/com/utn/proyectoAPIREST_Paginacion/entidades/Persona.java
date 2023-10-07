package com.utn.proyectoAPIREST_Paginacion.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "persona")
public class Persona extends BaseEntidad{

    private String nombre;
    private String apellido;
    private int DNI;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "id_persona"),
            inverseJoinColumns = @JoinColumn(name = "id_libro")
    )
    @Builder.Default
    private List<Libro> libros = new ArrayList<>();


    public void AddLibros(Libro l){
        libros.add(l);
    }
}
