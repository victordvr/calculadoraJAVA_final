import java.util.Scanner;

public class Main {
    /**
     * Descripción: Función que programa una calculadora con las operaciones suma, resta, multiplicación, división y módulo.
     */
    public static void main(String[] args) {
        //Declaración de variables que guardan los números a operar
        double numero1, numero2;
        //Declaración y asignación de variable que guarda el resultado de la operación
        double resultado = 0;
        //Declaración de variable que guarda el operador
        String operacion;
        //Variable booleana que mantiene activa o cierra el ciclo while
        boolean signal = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("");
        System.out.print("Ingrese primer número: ");
        //Instancia de clase Numero para crear objeto que representa el primer número involucrado en las operaciones a realizar
        Numero digito1 = new Numero();
        //Guarda el valor retornado del objeto en la variable numero1
        numero1 = digito1.valor();
        do{
            Menu menu = new Menu();
            System.out.print("Ingrese operación: ");
            //Leer y guardar entrada desde el teclado en la variable operación, este será el operador.
            operacion = input.next();
            if (operacion.equals("x")){
                System.out.println("Cerrando aplicación");
                //Si el dato u operador ingresado es x, se asigna a signal como false para cerrar el ciclo while.
                signal = false;
            }else {
                System.out.print("Ingrese segundo número: ");
                //Instancia de clase Numero para crear el objeto que representa el segundo número involucrado en las operaciones a realizar
                Numero digito2 = new Numero();
                //Guarda el valor retornado del objeto en la variable numero2
                numero2 = digito2.valor();
                System.out.println("");
                //Según la variable operación asignada líneas antes, seleccione el caso: suma, resta, multiplicación, división, módulo
                switch (operacion){
                    case "+":
                        Suma suma = new Suma(numero1, numero2);
                        resultado = suma.getResultado();
                        break;
                    case "-":
                        Resta resta = new Resta(numero1, numero2);
                        resultado = resta.getResultado();
                        break;
                    case "*":
                        Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);
                        resultado = multiplicacion.getResultado();
                        break;
                    case "/":
                        Division division = new Division(numero1, numero2);
                        resultado = division.getResultado(numero1, numero2);
                        break;
                    case "%":
                        Modulo modulo = new Modulo(numero1, numero2);
                        resultado = modulo.getResultado(numero1, numero2);
                        break;
                    default:
                        System.out.println("Ingrese una operación válida.");
                }
                //Se asigna resultado al numero1 para dar continuidad a operaciones consecutivas
                numero1 = resultado;
            }
        } while (signal);

    }
}
