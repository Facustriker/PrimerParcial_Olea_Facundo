package com.utn.proyectoAPIREST_Paginacion.repositorios;

import com.utn.proyectoAPIREST_Paginacion.entidades.BaseEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends BaseEntidad, ID extends Serializable> extends JpaRepository<E, ID> {


}
