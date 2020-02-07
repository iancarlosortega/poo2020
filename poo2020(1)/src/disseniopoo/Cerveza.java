package disseniopoo;

public class Cerveza {

    // Creacion de atributos globales
    private String nombre;
    private String tipo;
    private double precio;
    private int unidades_vendidas;
    private double total;

    // Creacion del constructor
    public Cerveza(String nombre, String tipo, double precio, int unidades_vendidas, double total){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
    }

    /**
     * Metodo para calcular el total de ventas
     * @return total
     */
    public double calcular_ventas(){
        double total = precio * unidades_vendidas;
        return total;
    }

    public String salida(){
        String salida = "Cerveza: "+nombre+"\n"+"Tipo: "+tipo+"\n"+"Precio: "+precio+"\n"+"Unidades vendidas: "+unidades_vendidas+"\n\n\tTOTAL DE VENTAS: "+total;
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }
}
