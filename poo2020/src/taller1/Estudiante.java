package taller1;

public class Estudiante {

    //definicion de atributos globales

    private String nombre, apellido, nacionalidad, genero,estudiante;
    private int edad, cedula;

    /**
     * Metodo para mostrar la informacion del estudiante
     * @return estudiante
     */

    public String obtener_estudiante(){
        String estudiante = nombre+"\n"+apellido+"\n"+cedula+"\n"+nacionalidad+"\n"+genero+"\n"+edad;
        return estudiante;
    }

    /**
     * Metodo para obtener el nombre del estudiante
     * @return nombre
     */

    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Metodo para obtener el apellido del estudiante
     * @return apellido
     */

    public String obtener_apellido(){
        return apellido;
    }

    /**
     * Metodo para obtener la nacionalidad del estudiante
     * @return nacionalidad
     */

    public String obtener_nacionalidad(){
        return nacionalidad;
    }

    /**
     * Metodo para obtener el genero del estudiante
     * @return genero
     */

    public String obtener_genero(){
        return genero;
    }

    /**
     * Metodo para obtener la edad del estudiante
     * @return edad
     */

    public int obtener_edad(){
        return edad;
    }

    /**
     * Metodo para obtener la cedula del estudiante
     * @return cedula
     */

    public int obtener_cedula(){
        return cedula;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @return this.nombre
     */

    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la variable apellido
     * @return this.apellido
     */

    public void actualizar_apellido(String apellido){
        this.apellido = apellido;
    }

    /**
     * Metodo para actualizar la variable nacionalidad
     * @return this.nacionalidad
     */

    public void actualizar_nacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    /**
     * Metodo para actualizar la variable genero
     * @return this.genero
     */

    public void actualizar_genero(String genero){
        this.genero = genero;
    }

    /**
     * Metodo para actualizar la variable edad
     * @return this.edad
     */

    public void actualizar_edad(int edad){
        this.edad = edad;
    }

    /**
     * Metodo para actualizar la variable no
     * @return this.nombre
     */

    public void actualizar_cedula(int cedula){
        this.cedula = cedula;
    }

    public String estudiar(){
        String mensaje = "Realiza la accion de estudiar";
        return mensaje;
    }
}
