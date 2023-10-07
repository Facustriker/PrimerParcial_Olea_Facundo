package com.utn.proyectoAPIREST_Paginacion.repositorios;

import com.utn.proyectoAPIREST_Paginacion.entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{

    //------------------------QUERYS SIN PAGINACION-------------------------------

    //Metodo de Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);


    //Metodo JPQL con parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> searchIndexado(String filtro);

    //Metodo JPQL con parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> searchNombrado(@Param("filtro") String filtro);


    //Metodo Query Nativo
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
    nativeQuery = true)
    List<Persona> searchNativo(String filtro);


    //------------------------QUERYS CON PAGINACION-------------------------------


    //Metodo de Query Pageable
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);


    //Metodo JPQL con parametros indexados Pageable
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> searchIndexadoPageable(String filtro, Pageable pageable);

    //Metodo JPQL con parametros nombrados Pageable
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> searchNombradoPageable(@Param("filtro") String filtro, Pageable pageable);


    //Metodo Query Nativo Pageable
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true,
            countQuery = "SELECT count(*) FROM persona")
    Page<Persona> searchNativoPageable(String filtro, Pageable pageable);
}