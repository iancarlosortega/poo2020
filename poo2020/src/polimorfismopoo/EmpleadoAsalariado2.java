package polimorfismopoo;

public class EmpleadoAsalariado2 extends Empleado12{
    private double sueldoMensual;

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public void calcularSueldoQna(){
        sueldo = sueldoMensual/2;
    }
}
