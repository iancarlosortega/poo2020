package herenciavolumen;

public class Cilindro extends Figura {
    protected double radio;
    protected double altura;
    protected double volumenCilindro;

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

    public double getVolumenCilindro() {
        return volumenCilindro;
    }

    public void setVolumenCilindro(double volumenCilindro) {
        this.volumenCilindro = volumenCilindro;
    }

    public void calcularVolumenCilindro(){
        volumenCilindro = Math.PI*Math.pow(radio,2)*altura;
    }
}
