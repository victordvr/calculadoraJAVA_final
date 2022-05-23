/**
 * Descripción: Clase hija de la clase Operacion
 */
public class Division extends Operacion{
    /**
     * Descripción: Método constructor de la Clase División. Realiza la división entre los 2 parámetros de tipo double ingresados.
     * @param num1 variable de tipo double, corresponde al dividendo.
     * @param num2 variable de tipo double, corresponde al divisor. Si este valor es cero, la división no será realizada y
     *             el parámetro num1 será guardado como resultado para la operación inmediatamente posterior.
     */
    public Division(double num1, double num2){
        if (num2 != 0){
            super.resultado = num1 / num2;
        }else {
            super.resultado = num1;
        }
    }

    /**
     *Descripción: Método que retorna el resultado de la división realizada
     * @return variable de tipo double. Corresponde al resultado de la división. Si num2 es igual a cero, este retorno será num1 para la siguiente operación.
     */
    public double getResultado(double num1, double num2) {
        if (num2 != 0){
            System.out.println("Resultado: " + super.resultado);
            return super.resultado;
        }else {
            System.out.println("No está definida la división entre cero (0)");
            System.out.println("El número guardado hasta el momento es: " + super.resultado);
            return super.resultado;
        }

    }
}
