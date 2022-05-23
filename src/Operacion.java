/**
 * Descripción: Clase padre donde se declara la variable como resultado de las operaciones, en este caso: suma, resta,
 * multiplicación, división y módulo.
 */
public class Operacion {
    public double resultado;

    /**
     * Descripción: Método constructor
     */
    public Operacion(){

    }

    /**
     * Descripción:
     * @return retorna una variable de tipo double, es el resultado de las operaciones
     */
    public double getResultado(){
        System.out.println("");
        return this.resultado;
    }
}
