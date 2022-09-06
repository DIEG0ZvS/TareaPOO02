package Ejercicio1;

public class Main {


    private static String X1;
    private static String X2;

    public static void main(String args[])
    {
        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ecuacion.establecerA(2);
        ecuacion.establecerB(3);
        ecuacion.establecerC(4);

        System.out.println("Valor A:"+ecuacion.obtenerA());
        System.out.println("Valor B:"+ecuacion.obtenerB());
        System.out.println("Valor C:"+ecuacion.obtenerC());
        System.out.println("Valor X1:"  +X1+"y el valor de de X2:"+X2);
    }
}
