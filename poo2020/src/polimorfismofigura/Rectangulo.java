package polimorfismofigura;

public class Rectangulo extends Figura {
    private double baseRect;
    private double alturaRect;

    public void setBaseRect(double baseRect) {
        this.baseRect = baseRect;
    }

    public void setAlturaRect(double alturaRect) {
        this.alturaRect = alturaRect;
    }

    @Override
    public void calcularArea(){
        area = baseRect*alturaRect;
    }
}
