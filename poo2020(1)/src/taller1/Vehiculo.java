package taller1;

public class Vehiculo {

    //definicion de atributos globales

    private String modelo, color, tamanio, marca;
    private int capacidad;

    /**
     * Metodo para obtener la informacion del vehiculo
     * @return vehiculo
     */

    public String obtener_vehiculo(){
        String vehiculo = modelo+"\n"+color+"\n"+tamanio+"\n"+capacidad;
        return vehiculo;
    }

    /**
     * Metodo para obtener el modelo
     * @return modelo
     */

    public String obtener_modelo(){
        return modelo;
    }

    /**
     * Metodo para obtener el tamanio
     * @return tamanio
     */

    public String obtener_tamanio(){
        return tamanio;
    }

    /**
     * Metodo para obtener el color
     * @return color
     */

    public String obtener_color(){
        return color;
    }

    /**
     * Metodo para obtener la marca
     * @return marca
     */

    public String obtener_marca(){
        return marca;
    }

    /**
     * Metodo para obtener la capacidad
     * @return capacidad
     */

    public int obtener_capacidad(){
        return capacidad;
    }


    /**
     * Metodo para actualizar la variable modelo
     * @return this.modelo
     */

    public void actualizar_modelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Metodo para actualizar la variable tamanio
     * @return this.tamanio
     */

    public void actualizar_tamanio(String tamanio){
        this.tamanio = tamanio;
    }

    /**
     * Metodo para actualizar la variable color
     * @return this.color
     */

    public void actualizar_color(String color){
        this.color = color;
    }

    /**
     * Metodo para actualizar la variable marca
     * @return this.marca
     */

    public void actualizar_marca(String marca){
        this.marca = marca;
    }

    /**
     * Metodo para actualizar la variable capacidad
     * @return this.capacidad
     */

    public void actualizar_capacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public String transportar(){
        String mensaje = "Realiza la accion de transportar";
        return mensaje;
    }
}
