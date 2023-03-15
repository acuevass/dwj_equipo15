package post.work.sesion4.sesion4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.service.FormateadorNumeroService;
import post.work.sesion4.sesion4.service.ValidadorNumeroService;

import java.util.Scanner;

@SpringBootApplication
public class Sesion4Application implements CommandLineRunner {

	private final ValidadorNumeroService validadorNumeroService;
	private final FormateadorNumeroService formateadorNumeroService;

	public Sesion4Application(@Autowired ValidadorNumeroService validadorNumeroService, @Autowired FormateadorNumeroService formateadorNumeroService) {
		this.validadorNumeroService = validadorNumeroService;
		this.formateadorNumeroService = formateadorNumeroService;
	}

	public static void main(String[] args) {

		SpringApplication.run(Sesion4Application.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("*|*|*|*| Introduce tu nombre:");
		String nombre = scanner.nextLine();

		System.out.println("*|*|*|*| Introduce tu edad:");
		int edad = Integer.valueOf(scanner.nextLine());

		System.out.println("*|*|*|*| Introduce tu numero de telefono:");
		String numTelefono = scanner.nextLine();

		if (validadorNumeroService.contieneCaracteresValidos(numTelefono)) {
			numTelefono = formateadorNumeroService.limpiaCaracteres(numTelefono);
			numTelefono = formateadorNumeroService.formateaNumero(numTelefono);

			Persona persona = new Persona(nombre, edad, numTelefono);
			System.out.println(persona);
		} else {
			System.out.println("Numero no valido. Tiene que contener 10 digitos " +
					"y lo puedes poner con el siguiente formato: " +
					"55 12345678 o 5512 345678 o 5512345678");
		}
    }

}