package post.work.sesion4.sesion4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import post.work.sesion4.sesion4.model.Persona;

import java.util.Scanner;

@SpringBootApplication
public class Sesion4Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Sesion4Application.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("*|*|*|*| Introduce tu nombre:");
		String nombre=scanner.nextLine();
		System.out.println("*|*|*|*| Introduce tu edad: ");
		int edad=scanner.nextInt();

		Persona persona=new Persona(nombre,edad);
		System.out.println(persona);
    }

}
