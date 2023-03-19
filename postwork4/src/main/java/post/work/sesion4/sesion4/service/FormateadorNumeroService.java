package post.work.sesion4.sesion4.service;

import org.springframework.stereotype.Service;

@Service
public class FormateadorNumeroService {

    // Es recomendable utilizar una constante para evitar recompilar la expresión cada vez
    private static final String REGEX_PATTERN = "^(\\d{2})(\\d{4})(\\d{4})$";
    /**
     * Método que realiza el punto 3 del postwork.
     * 3. Si se tiene un número válido, elimine todos los caracteres que no sean numéricos. (Limpia todos los caracteres)
     * @param numTelefono entrada a limpiar/quitar caracteres que no sean dígitos
     * @return la entrada limpia de caracteres
     */
    public String limpiaCaracteres(String numTelefono) {
        // queremos quitar cualquier caracter que no sea un dígito
        return numTelefono.replaceAll("[^0-9]", "");
    }

    /**
     * Método que da formato de salida final al número de teléfono.
     * 4. De al número de teléfono un formato de (##)-####-#### antes de imprimirlo en la consola.
     * @param numTelefono entrada a formatear
     * @return número de teléfono con formato (##)-####-####
     */
    public String formateaNumero(String numTelefono) {
        return String.valueOf(numTelefono).replaceFirst(REGEX_PATTERN, "($1)-$2-$3");
    }

}