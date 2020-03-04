package polimorfismopoo;

public class EmpleadosPorHoras2 extends Empleado12 {

    private double horasTra;
    private double cuotaHora;


    public void setHorasTra(double horasTra) {
        this.horasTra = horasTra;
    }

    public void setCuotaHora(double cuotaHora) {
        this.cuotaHora = cuotaHora;
    }

    @Override
    public void calcularSueldoQna(){
        sueldo = horasTra * cuotaHora;
    }




}
