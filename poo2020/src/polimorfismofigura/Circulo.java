package polimorfismofigura;

public class Circulo extends Figura{
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea(){
        area = Math.PI * Math.pow(radio,2);
    }
}
