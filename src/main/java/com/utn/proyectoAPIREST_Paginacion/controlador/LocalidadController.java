package com.utn.proyectoAPIREST_Paginacion.controlador;

import com.utn.proyectoAPIREST_Paginacion.entidades.Localidad;
import com.utn.proyectoAPIREST_Paginacion.servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
