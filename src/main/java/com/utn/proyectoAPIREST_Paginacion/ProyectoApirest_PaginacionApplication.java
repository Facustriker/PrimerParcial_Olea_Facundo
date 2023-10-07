package com.utn.proyectoAPIREST_Paginacion;

import com.utn.proyectoAPIREST_Paginacion.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApirest_PaginacionApplication {


	@Autowired
	private PersonaRepository personaRepository;


	public static void main(String[] args) {
		SpringApplication.run(ProyectoApirest_PaginacionApplication.class, args);
		System.out.println("Hola, estoy andando bien");
	}

/*
	@Bean
	CommandLineRunner init() {
		return args -> {

			Localidad localidad = Localidad.builder()
					.denominacion("Guaymallen")
					.build();

			Domicilio domicilio = Domicilio.builder()
					.calle("San Martin")
					.numero(123)
					.localidad(localidad)
					.build();

			Autor autor = Autor.builder()
					.nombre("Ela")
					.apellido("Tletico")
					.biografia("Graduado a los 4")
					.build();

			Autor autor2 = Autor.builder()
					.nombre("Clara")
					.apellido("Mente")
					.biografia("Medico a los 6")
					.build();

			Autor autor3 = Autor.builder()
					.nombre("Alba")
					.apellido("Ñil")
					.biografia("Ingeniero a los 12")
					.build();

			Autor autor4 = Autor.builder()
					.nombre("Ana")
					.apellido("Litica")
					.biografia("Arquitecta a los 10")
					.build();

			Libro libro = Libro.builder()
					.titulo("El chamango")
					.fecha(1998)
					.genero("Comedia")
					.paginas(560)
					.build();

			Libro libro2 = Libro.builder()
					.titulo("Mi tía es hombre")
					.fecha(2001)
					.genero("Terror")
					.paginas(4950)
					.build();

			Libro libro3 = Libro.builder()
					.titulo("Consegui novia")
					.fecha(2006)
					.genero("Ciencia ficcion")
					.paginas(1200)
					.build();


			Persona persona = Persona.builder()
					.nombre("Jose")
					.apellido("Perez")
					.DNI(39763287)
					.domicilio(domicilio)
					.build();


			persona.AddLibros(libro);
			persona.AddLibros(libro2);
			persona.AddLibros(libro3);


			libro.AddAutores(autor);
			libro.AddAutores(autor3);
			libro.AddAutores(autor4);
			libro2.AddAutores(autor);
			libro2.AddAutores(autor4);
			libro3.AddAutores(autor2);
			libro3.AddAutores(autor3);


			personaRepository.save(persona);


		};
	}

*/

}
