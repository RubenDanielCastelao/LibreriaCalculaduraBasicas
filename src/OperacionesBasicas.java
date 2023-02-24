/**
 * @author RubenDanielCastelao
 * @version 1.0
 */
public class OperacionesBasicas {
    /**
     * Declaro las constantes de opciones
     */
    private static Float resultado = null;
    static final int SUM = 1;
    static final int SUBSTRACTION = 2;
    static  final int MULT = 3;
    static  final  int DIV = 4;
    static final int RAIZ = 5;
    private OperacionesBasicas(){};

    /**
     *
     * @param device Usado para elegir la operacion que se va a usar
     * @param num1 Primer numero
     * @param num2 Segundo numero
     * @return Float resultado de la operacion
     */
    public static Float operar(int device, float num1,float num2){ //retornamos FLOAT para poder devolver null
        switch (device){
            case SUM:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("SUM ERROR");
                }
                break;
            case SUBSTRACTION:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("SUBSTRACTION ERROR");
                }
                break;
            case MULT:
                try{
                    resultado = num1 * num2;
                }catch (Exception e){
                    System.out.println("MULT ERROR");
                }
                break;
            case DIV:
                try{
                    resultado =num1 / num2;
                }catch (Exception e){
                    System.out.println("DIV ERROR");
                }
                break;
            case RAIZ:
                float sqrt;
                try{
                    if(num2 == 2){
                        sqrt = (float)Math.sqrt(num1);
                        return sqrt;
                    } else if (num2 == 3) {
                        sqrt = (float)Math.cbrt(num1);
                    } else{
                        sqrt = (float)Math.pow(num1, 1.0 / num2);
                        return sqrt;
                    }
                }catch (Exception e){
                    System.out.println("RAIZ ERROR");
                }
            default:
                System.out.println("OPTION DOES NOT EXIST");
                break;
        }
        return resultado;

    }



}