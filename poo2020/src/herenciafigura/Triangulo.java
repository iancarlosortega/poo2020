package herenciafigura;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double areaTriangulo;

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

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public void calcularAreaTriangulo(){
        areaTriangulo = (base * altura)/2;
    }
}
