package herencia;

public class Administrativo extends Persona{
    private String dependecia;

    /**
     * Metodo constructor para Administrativo
     * @param nombre
     * @param identificacion
     * @param dependecia
     * @param estCivil
     * @param fechaNacim
     */
    public Administrativo (String nombre, String identificacion, String dependecia, String estCivil, String fechaNacim) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.dependecia = dependecia;
        this.estCivil = estCivil;
        this.fechaNacim = fechaNacim;
    }

    /**
     * Metodo para obtener la dependencia
     * @return dependencia
     */
    public String getDependecia() {
        return dependecia;
    }

    /**
     * Metodo para gestionar
     */
    public void getGestionar(){
        System.out.println("Metodo para gestionar");
    }
}
