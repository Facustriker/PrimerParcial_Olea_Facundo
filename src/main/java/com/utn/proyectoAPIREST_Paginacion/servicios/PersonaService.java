package com.utn.proyectoAPIREST_Paginacion.servicios;

import com.utn.proyectoAPIREST_Paginacion.entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{

    List<Persona> search(String filtro) throws Exception;
    List<Persona> searchJPQL(String filtro) throws Exception;
    List<Persona> searchNative(String filtro) throws Exception;
    Page<Persona> searchPageable(String filtro, Pageable pageable) throws Exception;
    Page<Persona> searchJPQLPageable(String filtro, Pageable pageable) throws Exception;
    Page<Persona> searchNativePageable(String filtro, Pageable pageable) throws Exception;

}
