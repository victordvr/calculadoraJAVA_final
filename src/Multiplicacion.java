/**
 * Descripción: Clase hija de la clase Operacion
 */
public class Multiplicacion extends Operacion{
    /**
     * Descripción: Método constructor de la Clase Multiplicación. Multiplica los 2 parámetros de tipo double ingresados.
     * @param num1 variable de tipo double.
     * @param num2 variable de tipo double.
     */
    public Multiplicacion(double num1, double num2){
        super.resultado = num1 * num2;
    }

    /**
     *Descripción: Método que retorna el resultado de la multiplicación realizada
     * @return variable de tipo double. Corresponde al resultado de la multiplicación.
     */
    @Override
    public double getResultado() {
        System.out.print("Resultado: " + super.resultado + "\n");
        return super.resultado;
    }
}
