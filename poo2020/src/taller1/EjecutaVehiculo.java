package taller1;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizar_capacidad(5);
        vehiculo.actualizar_color("Blanco");
        vehiculo.actualizar_modelo("TOYOTA");
        vehiculo.actualizar_tamanio("Grande");
        String informacion = vehiculo.obtener_vehiculo();
        System.out.println(informacion);
    }
}
