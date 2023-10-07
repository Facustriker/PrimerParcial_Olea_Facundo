package com.utn.proyectoAPIREST_Paginacion.servicios;

import com.utn.proyectoAPIREST_Paginacion.entidades.Localidad;
import com.utn.proyectoAPIREST_Paginacion.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
