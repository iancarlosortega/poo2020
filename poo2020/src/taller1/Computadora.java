package taller1;

public class Computadora {

    //definicion de atributos globales

    private String procesador, grafica, placa_madre, memoria_ram, monitor, perifericos;

    /**
     * Metodo para obtener la informacion de la computadora
     * @return computadora
     */

    public String obtener_computadora(){
        String computador = procesador+"\n"+grafica+"\n"+memoria_ram+"\n"+monitor;
        return computador;
    }

    /**
     * Metodo para obtener el procesador
     * @return procesador
     */

    public String obtener_grafica(){
        return grafica;
    }

    /**
     * Metodo para obtener la placa madre
     * @return placa_madre
     */

    public String obtener_placa_madre(){
        return placa_madre;
    }

    /**
     * Metodo para obtener la memoria ram
     * @return memoria_ram
     */

    public String obtener_memoria_ram(){
        return memoria_ram;
    }

    /**
     * Metodo para obtener el monitor
     * @return monitor
     */

    public String obtener_monitor(){
        return monitor;
    }

    /**
     * Metodo para obtener los perifericos
     * @return perifericos
     */

    public String obtener_perifericos(){
        return perifericos;
    }

    /**
     * Metodo para actualizar la variable procesador
     * @return this.procesador
     */

    public void actualizar_procesador(String procesador){
        this.procesador = procesador;
    }

    /**
     * Metodo para actualizar la variable placa madre
     * @return this.placa_madre
     */

    public void actualizar_placa_madre(String placa_madre){
        this.placa_madre = placa_madre;
    }

    /**
     * Metodo para actualizar la variable grafica
     * @return this.grafica
     */

    public void actualizar_grafica(String grafica){
        this.grafica = grafica;
    }

    /**
     * Metodo para actualizar la variable memoria ram
     * @return this.memoria_ram
     */

    public void actualizar_memoria_ram(String memoria_ram){
        this.memoria_ram = memoria_ram;
    }

    /**
     * Metodo para actualizar la variable monitor
     * @return this.monitor
     */

    public void actualizar_monitor(String monitor){
        this.monitor = monitor;
    }

    /**
     * Metodo para actualizar la variable perifericos
     * @return this.perifericos
     */

    public void actualizar_perifericos(String perifericos){
        this.perifericos = perifericos;
    }

    /**
     * Metodo para actualizar la variable peso
     * @return this.peso
     */

    public String alimentar(){
        String mensaje = "Realiza la accion de realizar procesos";
        return mensaje;
    }
}
