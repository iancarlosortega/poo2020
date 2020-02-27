package herencia;

/**
 * Clase principal o superclase
 */
public class Persona {
    protected String nombre;
    protected String identificacion;
    protected String estCivil;
    protected String fechaNacim;

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
     * Metodo para obtener la identificacion
     *
     * @return identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Metodo para actualizar la identificacion
     *
     * @param identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Metodo para obtener el estado civil
     *
     * @return estCivil
     */
    public String getEstCivil() {
        return estCivil;
    }

    /**
     * Metodo para actualizar el estado civil
     *
     * @param estCivil
     */
    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    /**
     * Metodo para obtener la fecha de nacimiento
     *
     * @return fechaNacim
     */
    public String getFechaNacim() {
        return fechaNacim;
    }

    /**
     * Metodo para actualizar la fecha de nacimiento
     *
     * @param fechaNacim
     */
    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
}
