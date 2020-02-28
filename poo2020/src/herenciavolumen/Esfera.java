package herenciavolumen;

public class Esfera extends Figura {
    protected double radio;
    protected double volumenEsfera;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumenEsfera() {
        return volumenEsfera;
    }

    public void setVolumenEsfera(double volumenEsfera) {
        this.volumenEsfera = volumenEsfera;
    }

    public void calcularVolumenEsfera(){
        volumenEsfera = (4/3)*Math.PI*(radio*radio*radio);
    }
}
