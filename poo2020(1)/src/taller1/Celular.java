package taller1;

public class Celular {

    //definicion de atributos globales

    private String tamanio, modelo, color, sistema_operativo;
    private int capacidad;

    /**
     * Metodo para obtener la informacion del celular
     * @return celular
     */

    public String obtener_celular(){
        String celular = modelo+"\n"+color+"\n"+sistema_operativo;
        return celular;
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
     * Metodo para obtener el sistema operativo
     * @return sistema_operativo
     */

    public String obtener_sistema_operativo(){
        return sistema_operativo;
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
     * Metodo para actualizar la variable sistema_operativo
     * @return this.sistema_operativo
     */

    public void actualizar_sistema_operativo(String sistema_operativo){
        this.sistema_operativo = sistema_operativo;
    }

    /**
     * Metodo para actualizar la variable capacidad
     * @return this.capacidad
     */

    public void actualizar_capacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public String comunicar(){
        String mensaje = "Realiza la accion de comunicar";
        return mensaje;
    }
}
