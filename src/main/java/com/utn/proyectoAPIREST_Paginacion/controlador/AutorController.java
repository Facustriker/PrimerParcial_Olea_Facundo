package com.utn.proyectoAPIREST_Paginacion.controlador;

import com.utn.proyectoAPIREST_Paginacion.entidades.Autor;
import com.utn.proyectoAPIREST_Paginacion.servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{


}
