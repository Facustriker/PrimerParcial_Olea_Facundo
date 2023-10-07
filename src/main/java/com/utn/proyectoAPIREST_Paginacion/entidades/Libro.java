package com.utn.proyectoAPIREST_Paginacion.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro extends BaseEntidad{

    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Builder.Default
    private List<Autor> autores = new ArrayList<>();


    public void AddAutores(Autor a){
        autores.add(a);
    }
}
