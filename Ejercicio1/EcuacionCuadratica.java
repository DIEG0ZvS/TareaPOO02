package Ejercicio1;

import java.lang.Math;

public class EcuacionCuadratica {

    double a;

    double b;

    double c;


    public void establecerA(double numA)
    {
        a = numA;
    }

    public double obtenerA()
    {
        return a;
    }

    public void establecerB(double numB)
    {
        b = numB;
    }

    public double obtenerB()
    {
        return b;
    }

    public void establecerC(double numC)
    {
        c = numC;
    }

    public double obtenerC()
    {
        return c;
    }

    public double discriminante()
    {
        double valor;

        //valor = Math.pow(obtenerB(), 2);


        double expresion;

        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();

        if (expresion > 0)
        {
            double X1 = (-obtenerB() + Math.sqrt(expresion)) / 2*obtenerA();
            double X2 = (-obtenerB() - Math.sqrt(expresion)) / 2*obtenerA();
        }
        else {
            if (expresion == 0){
                double X1 =(-obtenerB()) / 2*obtenerA();
            }
        }

        return 0;
    }

    public double raiz()
    {
        return 0;
    }

}
