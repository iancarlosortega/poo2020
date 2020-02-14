package taller_repeticion;
/**
 * Integrantes: Ian Ortega/ Anthonny Espinosa/ Ramiro Quezada
 */

public class Multiplicacion {
    private int num1;
    private int num2;
    private int multi;

    public Multiplicacion(int num1, int num2) {
        num1=num1;
        num2=num2;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getMult() {
        return multi;
    }

    public void setMult(int mult) {
        this.multi = mult;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int multiplicarNumero(int num1,int num2) {

        multi = num1 * num2;
        return multi;
    }



}
