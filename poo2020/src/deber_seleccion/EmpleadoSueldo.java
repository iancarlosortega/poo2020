package deber_seleccion;

public class EmpleadoSueldo {
    private double cuota;
    private double sueldo;
    private int horas;
    private String nombre;

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Creacion del constructor
    public EmpleadoSueldo(double cuota, int horas, String nombre){
        this.cuota = cuota;
        this.horas = horas;
        this.nombre = nombre;
    }

    public Double calcularSueldo(){
        if (horas < 50){
            sueldo = cuota * horas;
        }
        else{
            sueldo = (cuota * 50) + (horas - 50) * (3*cuota);
        }
        return sueldo;
    }

    public String imprimir(){
        String mensaje = String.format("Nombre del empleado: %s\nSueldo:%.2f",nombre,calcularSueldo());
        return mensaje;
    }
}
