package com.utn.proyectoAPIREST_Paginacion.servicios;

import com.utn.proyectoAPIREST_Paginacion.entidades.Persona;
import com.utn.proyectoAPIREST_Paginacion.repositorios.BaseRepository;
import com.utn.proyectoAPIREST_Paginacion.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Persona> searchJPQL(String filtro) throws Exception {
        try{
            List<Persona> personas = personaRepository.searchNombrado(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Persona> searchNative(String filtro) throws Exception {
        try{
            List<Persona> personas = personaRepository.searchNativo(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> searchPageable(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> searchJPQLPageable(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.searchNombradoPageable(filtro, pageable);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> searchNativePageable(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.searchNativoPageable(filtro, pageable);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
