package disenio_seleccion;

public class Empleado {

    // Declaracion de variables globales
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    public Empleado(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
        this.sueldo = calcularSueldo(horas,cuota);
    }

    public double calcularSueldo(int horas,double cuota){
        if(horas <= 40){
            sueldo = horas * cuota;
        } else {
            sueldo = (40*cuota) + (horas-40) * (cuota*2);
        }
        return sueldo;
    }

    public String presentar(){
        String mensaje = String.format("Nombre del empleado: %s\nSueldo del empleado: %.2f",nombre,calcularSueldo(horas,cuota));
        return mensaje;
    }
}
