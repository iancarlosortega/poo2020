package taller1;

public class Docente {

    //definicion de atributos globales

    private String nombre, apellido, nacionalidad, genero, titulo;
    private int edad, cedula;

    /**
     * Metodo para obtener la informacion del docente
     * @return docente
     */

    public String obtener_docente(){
        String informacion = nombre+"\n"+apellido+"\n"+cedula+"\n"+titulo;
        return informacion;
    }

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */

    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Metodo para obtener el apellido
     * @return apellido
     */

    public String obtener_apellido(){
        return apellido;
    }

    /**
     * Metodo para obtener la nacionalidad
     * @return nacionalidad
     */

    public String obtener_nacionalidad(){
        return nacionalidad;
    }

    /**
     * Metodo para obtener el genero
     * @return genero
     */

    public String obtener_genero(){
        return genero;
    }

    /**
     * Metodo para obtener el titulo
     * @return genero
     */

    public String obtener_titulo(){
        return genero;
    }

    /**
     * Metodo para obtener la edad
     * @return edad
     */

    public int obtener_edad(){
        return edad;
    }

    /**
     * Metodo para obtener la cedula
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
     * Metodo para actualizar la variable titulo
     * @return this.titulo
     */

    public void actualizar_titulo(String titulo){
        this.titulo = titulo;
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

    public String enseniar(){
        String mensaje = "Realiza la accion de enseniar";
        return mensaje;
    }
}
