package post.work.sesion4.sesion4.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidadorNumeroService {
    public String limpiaNumero(String numTelefono){
        return numTelefono.replaceAll("[^0-9]", "");
    }
}
