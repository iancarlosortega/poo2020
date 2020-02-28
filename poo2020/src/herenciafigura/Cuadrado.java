package herenciafigura;

public class Cuadrado extends Figura{
    private double lado;
    private double areaCuadrado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(double areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    public void calcularAreaCuadrado(){
        areaCuadrado = lado * lado;
    }
}
