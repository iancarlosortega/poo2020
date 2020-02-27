package herencia;

import javax.print.DocFlavor;

/**
 * Clase que hereda de la clase persona
 * Contendra todos los datos definidos en persona
 */
public class Estudiante extends Persona{
    private String carrera;

    /**
     * Metodo constructor para Estudiante
     * @param nombre
     * @param identificacion
     * @param carrera
     * @param estCivil
     * @param fechaNacim
     */
    public Estudiante(String nombre, String identificacion, String carrera, String estCivil, String fechaNacim){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.carrera = carrera;
        this.estCivil = estCivil;
        this.fechaNacim = fechaNacim;
    }

    /**
     * Metodo para obtener la carrera
     * @return
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Metodo par matricular
     */
    public void getMatricular(){
        System.out.println("Metodo para matricular");
    }

    /**
     * Metodo para aprender
     */
    public void getAprender(){
        System.out.println("Metodo para aprender");
    }
}
