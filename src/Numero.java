import java.util.Scanner;

/**
 * Descripción: Clase para leer un número de tipo double como entrada desde el teclado.
 * Tiene de atributo una variable de tipo double y recibe el nombre de "numero"
 * @author Victor
 */
public class Numero {
    double numero;

    /**
     * Descripción: Método constructor de la clase Numero.
     *Lee y guarda un número de tipo double como entrada desde el teclado
     */
    public Numero(){
        Scanner input = new Scanner(System.in);
        this.numero = input.nextDouble();
    }

    /**
     * Descripción: Método que retorna el número double ingresado desde el teclado
     * @return numero variable de tipo double
     */
    public double valor(){
        return this.numero;
    }
}
