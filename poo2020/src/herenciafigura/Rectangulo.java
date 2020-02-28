package herenciafigura;

public class Rectangulo {
    private double base;
    private double altura;
    private double areaRectangulo;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(double areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    public void calcularAreaRectangulo(){
        areaRectangulo = base * altura;
    }
}
