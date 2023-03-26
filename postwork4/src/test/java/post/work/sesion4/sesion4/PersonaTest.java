package post.work.sesion4.sesion4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import post.work.sesion4.sesion4.model.Persona;
import java.util.Arrays;
import java.util.List;

public class PersonaTest {

	@TestFactory
	Stream<DynamicTest> testId(){
		List<Persona> entradas = Arrays.asList(
				new Persona(1L,"Juan","30","4776476274"),
				new Persona(2L,"María", "25", "55236547857"),
		        new Persona(3L,"Carlos", "40", "6184786984") );

		return entradas.stream()
				.map(persona -> DynamicTest.dynamicTest(
						"testGetId" + persona.getId(), 
						() -> assertEquals(persona.getId(), persona.getId())));
	}
	
	@TestFactory
	Stream<DynamicTest> testNombre(){
		List<Persona> entradas = Arrays.asList(
				new Persona(1L,"Juan","30","4776476274"),
				new Persona(2L,"María", "25", "55236547857"),
		        new Persona(3L,"Carlos", "40", "6184786984") );

		return entradas.stream()
				.map(persona -> DynamicTest.dynamicTest(
						"testGetNombre" + persona.getNombre(), 
						() -> assertEquals(persona.getNombre(), persona.getNombre())));
	}
	
	@TestFactory
	Stream<DynamicTest> testEdad(){
		List<Persona> entradas = Arrays.asList(
				new Persona(1L,"Juan","30","4776476274"),
				new Persona(2L,"María", "25", "55236547857"),
		        new Persona(3L,"Carlos", "40", "6184786984") );

		return entradas.stream()
				.map(persona -> DynamicTest.dynamicTest(
						"testGetEdad" + persona.getEdad(), 
						() -> assertEquals(persona.getEdad(), persona.getEdad())));
	}
	
	@TestFactory
	Stream<DynamicTest> testNumTelefono(){
		List<Persona> entradas = Arrays.asList(
				new Persona(1L,"Juan","30","4776476274"),
				new Persona(2L,"María", "25", "55236547857"),
		        new Persona(3L,"Carlos", "40", "6184786984") );

		return entradas.stream()
				.map(persona -> DynamicTest.dynamicTest(
						"testGetNumTelefono" + persona.getNumTelefono(), 
						() -> assertEquals(persona.getNumTelefono(), persona.getNumTelefono())));
	}
	
}
