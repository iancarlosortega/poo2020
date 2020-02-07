package taller1;

public class EjecutaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.actualizar_capacidad(64);
        celular.actualizar_color("Rojo");
        celular.actualizar_modelo("Note 8");
        celular.actualizar_sistema_operativo("Android");
        celular.actualizar_tamanio("mediano");
        String informacion = celular.obtener_celular();
        System.out.println(informacion);
    }
}
