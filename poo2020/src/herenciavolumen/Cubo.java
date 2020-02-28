package herenciavolumen;

public class Cubo extends Figura {
    protected double arista;
    protected double volumenCubo;

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getVolumenCubo() {
        return volumenCubo;
    }

    public void setVolumenCubo(double volumenCubo) {
        this.volumenCubo = volumenCubo;
    }
    public void calcularVolumenCubo(){
        volumenCubo = Math.pow(arista,3);
    }
}
