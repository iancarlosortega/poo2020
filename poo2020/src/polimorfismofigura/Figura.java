package polimorfismofigura;

public abstract class Figura {
    protected String nombre;
    protected double area;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
