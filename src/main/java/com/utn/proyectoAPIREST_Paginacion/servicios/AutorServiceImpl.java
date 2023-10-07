package com.utn.proyectoAPIREST_Paginacion.servicios;

import com.utn.proyectoAPIREST_Paginacion.entidades.Autor;
import com.utn.proyectoAPIREST_Paginacion.repositorios.AutorRepository;
import com.utn.proyectoAPIREST_Paginacion.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
