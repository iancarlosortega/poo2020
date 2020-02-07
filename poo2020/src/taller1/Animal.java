package taller1;

public class Animal {

    //definicion de atributos globales

    private String especie, tamanio, alimentacion, reproduccion, clasificacion;
    private int peso;

    /**
     * Metodo para obtener la informacion del animal
     * @return animal
     */

    public String obtener_animal(){
        String animal = especie+"\n"+tamanio+"\n"+alimentacion;
        return animal;
    }

    /**
     * Metodo para obtener la especie
     * @return especie
     */

    public String obtener_especie(){
        return especie;
    }

    /**
     * Metodo para obtener el tamanio
     * @return tamanio
     */

    public String obtener_tamanio(){
        return tamanio;
    }

    /**
     * Metodo para obtener la alimentacion
     * @return alimentacion
     */

    public String obtener_alimentacion(){
        return alimentacion;
    }

    /**
     * Metodo para obtener la reproduccion
     * @return reproduccion
     */

    public String obtener_reproduccion(){
        return reproduccion;
    }

    /**
     * Metodo para obtener la clasificacion
     * @return clasificacion
     */

    public String obtener_clasificacion(){
        return clasificacion;
    }

    /**
     * Metodo para obtener el peso
     * @return peso
     */

    public int obtener_peso(){
        return peso;
    }

    /**
     * Metodo para actualizar la variable especie
     * @return this.especie
     */

    public void actualizar_especie(String especie){
        this.especie = especie;
    }

    /**
     * Metodo para actualizar la variable tamanio
     * @return this.tamanio
     */

    public void actualizar_tamanio(String tamanio){
        this.tamanio = tamanio;
    }

    /**
     * Metodo para actualizar la variable alimentacion
     * @return this.alimentacion
     */

    public void actualizar_alimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }

    /**
     * Metodo para actualizar la variable reproduccion
     * @return this.reproduccion
     */

    public void actualizar_reproduccion(String reproduccion){
        this.reproduccion = reproduccion;
    }

    /**
     * Metodo para actualizar la variable clasificacion
     * @return this.clasificacion
     */

    public void actualizar_clasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    /**
     * Metodo para actualizar la variable peso
     * @return this.peso
     */

    public void actualizar_peso(int peso){
        this.peso = peso;
    }

    public String alimentar(){
        String mensaje = "Realiza la accion de alimentar";
        return mensaje;
    }

    public String reproducir(){
        String mensaje = "Realiza la accion de reproducir";
        return mensaje;
    }
}
