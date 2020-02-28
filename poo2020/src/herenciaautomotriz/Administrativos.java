package herenciaautomotriz;

public class Administrativos {
    private double sueldoMensual;
    private double sueldoQuincenal;

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public void calcularSueldoQuincenal(){
        sueldoQuincenal = sueldoMensual / 2;
    }
}
