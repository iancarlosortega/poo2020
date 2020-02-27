package herencia_empleado;

public class Empleado {
    protected String nombre;
    protected String cargo;
    protected String dependencia;

    /**
     * Metodo para obtener el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el cargo
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Metodo para actualizar el cargo
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Metodo para obtener la dependencia
     *
     * @return dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * Metodo para actualizar la dependencia
     *
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
