package Ejercicio2;

public class Main {

    public static void main(String args[])
    {


        CambioDeBase cambio = new CambioDeBase();
        cambio.establecerNum(144);
        cambio.establecerBase(8);


        System.out.println("el numero elegido: "+cambio.obtenerNum());
        System.out.println("el cambio de base: "+cambio.obtenerBase());


        cambio.operacion();


    }
}
