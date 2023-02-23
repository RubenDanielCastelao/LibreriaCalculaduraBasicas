import com.ruben.entradasalida.EntradaSalida;
public class Main {
    public static void main(String[] args) {


        EntradaSalida.salida("Hello world!",EntradaSalida.SALIDA_CONSOLA);
        Float num1 = EntradaSalida.EntradaFloat("Introduce el primer número");
        Float num2 = EntradaSalida.EntradaFloat("Introduce el segundo número");
        float resultado = OperacionesBasicas.operar(OperacionesBasicas.MULT,num1,num2);
        EntradaSalida.salida(String.valueOf(resultado),EntradaSalida.SALIDA_VENTANA);
        if(num1 == null || num2 == null){
            EntradaSalida.salida("Tiene que ser un número, no una letra", EntradaSalida.SALIDA_CONSOLA);
        }
        else {

            resultado = OperacionesBasicas.operar(OperacionesBasicas.MULT,num1, num2);
            if (Float.isNaN(resultado)) {
                EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
            } else {
                EntradaSalida.salida(("O resultado da operación é " + resultado), EntradaSalida.SALIDA_VENTANA);
            }

        }
    }
}