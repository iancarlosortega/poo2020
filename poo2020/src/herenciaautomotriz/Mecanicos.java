package herenciaautomotriz;

public class Mecanicos {
    private double valorTrabajo;
    private int numTrabajos;
    private double sueldoQuincenal;

    public double getValorTrabajo() {
        return valorTrabajo;
    }

    public void setValorTrabajo(double valorTrabajo) {
        this.valorTrabajo = valorTrabajo;
    }

    public int getNumTrabajos() {
        return numTrabajos;
    }

    public void setNumTrabajos(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public void calcularSueldoQuincenal(){
        sueldoQuincenal = 0.4*(valorTrabajo*numTrabajos);
    }
}
