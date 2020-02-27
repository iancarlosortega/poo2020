package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {
    private double valorMensual;
    private double sueldo;

    /**
     * Metodo constructor para EmpleadoAsalariado
     *
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param valorMensual
     */
    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double valorMensual) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valorMensual = valorMensual;
    }

    /**
     * Metodo para obtener el valor mensual
     *
     * @return valorMensual
     */
    public double getValorMensual() {
        return valorMensual;
    }

    /**
     * Metodo para calcular el sueldo
     *
     * @return sueldo
     */
    public double calcularSueldo() {
        sueldo = valorMensual;
        return sueldo;
    }
}
