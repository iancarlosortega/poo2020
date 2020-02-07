package taller1;

public class Universidad {

    //definicion de atributos globales

    private String nombre,ubicacion, infraestructura, carrera, tipo_uni, calificacion;

    /**
     * Metodo para obtener la informacion de la universidad
     * @return universidad
     */

    public String obtener_universidad(){
        String informacion = nombre+"\n"+ubicacion+"\n"+tipo_uni+"\n"+calificacion;
        return informacion;
    }

    /**
     * Metodo para obtener el nombre de la universidad
     * @return nombre
     */

    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Metodo para obtener la ubicacion de la universidad
     * @return ubicacion
     */

    public String obtener_ubicacion(){
        return ubicacion;
    }

    /**
     * Metodo para obtener la infraestructura de la universidad
     * @return infraestructura
     */

    public String obtener_infraestructura(){
        return infraestructura;
    }

    /**
     * Metodo para obtener la carrera de la universidad
     * @return carrera
     */

    public String obtener_carrera(){
        return carrera;
    }

    /**
     * Metodo para obtener el tipo de la universidad
     * @return tipo_uni
     */

    public String obtener_tipo(){
        return tipo_uni;
    }

    /**
     * Metodo para obtener la calificacion de la universidad
     * @return calificaion
     */

    public String obtener_calificacion(){
        return calificacion;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @return this.nombre
     */

    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la variable ubicacion
     * @return this.ubicacion
     */

    public void actualizar_ubicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    /**
     * Metodo para actualizar la variable infraestructura
     * @return this.infraestructura
     */

    public void actualizar_infraestructura(String infraestructura){
        this.infraestructura = infraestructura;
    }

    /**
     * Metodo para actualizar la variable carrera
     * @return this.carrera
     */

    public void actualizar_carrera(String carrera){
        this.carrera = carrera;
    }

    /**
     * Metodo para actualizar la variable tipo_uni
     * @return this.tipo_uni
     */

    public void actualizar_tipo_uni(String tipo_uni){
        this.tipo_uni = tipo_uni;
    }

    /**
     * Metodo para actualizar la variable clasificacion
     * @return this.clasificacion
     */

    public void actualizar_calificacion(String calificacion){
        this.calificacion = calificacion;
    }

    public String ofrecer_estudio(){
        String mensaje = "La universidad ofrece estudio";
        return mensaje;
    }

    public String ofrecer_trabajo(){
        String mensaje = "La universidad ofrece trabajo";
        return mensaje;
    }


}
