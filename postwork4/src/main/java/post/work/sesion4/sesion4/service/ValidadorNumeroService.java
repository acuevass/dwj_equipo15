package post.work.sesion4.sesion4.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidadorNumeroService {

    /**
     * Método que se encarga de valira el punto 1 y 2 del postwork.
     * 1. Valide que el número de teléfono solo contenga caracteres válidos: números, guion medio y espacio en blanco.
     * 2. Valide que el número tenga 10 dígitos
     * @param numTelefono numero de teléfono ingresado por consola
     * @return true en caso de ser un número valido.
     */
    public boolean contieneCaracteresValidos(String numTelefono) {
        //Regex para hacer coincidir el número de teléfono de 10 dígitos con espacios en blanco, guiones o sin espacios.
        Pattern pattern = Pattern.compile("^(\\d{2,4}[- ]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(numTelefono);
        // verificamos si la entrada coincide con el patrón con el método matches()
        return matcher.matches();
    }


}