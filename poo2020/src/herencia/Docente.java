package herencia;

public class Docente extends Persona{
    private String area;

    /**
     * Metodo constructor para Docente
     * @param nombre
     * @param identificacion
     * @param area
     * @param estCivil
     * @param fechaNacim
     */
    public Docente (String nombre, String identificacion, String area, String estCivil, String fechaNacim) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.area = area;
        this.estCivil = estCivil;
        this.fechaNacim = fechaNacim;
    }

    /**
     * Metodo para obtener el area
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * Metodo para la enseñanza
     */
    public void getEnseñar(){
        System.out.println("Metodo para la enseñanza");
    }

    /**
     * Metodo para calificar
     */
    public void getCalificar(){
        System.out.println("Metodo para calificar");
    }
}
