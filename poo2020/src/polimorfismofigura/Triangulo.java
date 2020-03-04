package polimorfismofigura;

public class Triangulo extends Figura {
    private double baseTria;
    private double alturaTria;

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }
    @Override
    public void calcularArea(){
        area = (baseTria*alturaTria)/2;
    }
}
