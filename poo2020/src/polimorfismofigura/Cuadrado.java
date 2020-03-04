package polimorfismofigura;

public class Cuadrado extends Figura{
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        area = lado*lado;
    }
}
