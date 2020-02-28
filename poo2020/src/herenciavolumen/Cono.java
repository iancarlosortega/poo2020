package herenciavolumen;

public class Cono extends Figura {
    protected double radio;
    protected double altura;
    protected double volumenCono;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumenCono() {
        return volumenCono;
    }

    public void setVolumenCono(double volumenCono) {
        this.volumenCono = volumenCono;
    }

    public void calcularVolumenCono(){
        volumenCono = (Math.PI*(radio*radio)*altura)/3;

    }
}
