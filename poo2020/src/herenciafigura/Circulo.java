package herenciafigura;

public class Circulo {
    private double radio;
    private double areaCirculo;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(double areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public void calcularAreaCirculo(){
        areaCirculo = 3.1416*(radio*radio);
    }
}
