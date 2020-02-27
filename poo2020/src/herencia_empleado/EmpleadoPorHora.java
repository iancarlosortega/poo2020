package herencia_empleado;

public class EmpleadoPorHora extends Empleado {
    private double hora;
    private double valorHora;
    private double sueldo;

    /**
     * Metodo constructor para EmpleadoPorHora
     *
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param hora
     * @param valorHora
     */
    public EmpleadoPorHora(String nombre, String cargo, String dependencia, double hora, double valorHora) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    /**
     * Metodo para obtener la hora
     *
     * @return hora
     */
    public double getHora() {
        return hora;
    }

    /**
     * Metodo para obtener el valor por hora
     *
     * @return valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * Metodo para calcular el sueldo
     *
     * @return sueldo
     */
    public double calcularSueldo() {
        sueldo = hora * valorHora;
        return sueldo;
    }
}
