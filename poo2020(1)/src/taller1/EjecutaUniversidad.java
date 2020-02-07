package taller1;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.actualizar_nombre("UTPL");
        universidad.actualizar_calificacion("A");
        universidad.actualizar_carrera("Variedad");
        universidad.actualizar_tipo_uni("Privada");
        universidad.actualizar_ubicacion("Loja,Ecuador");
        universidad.actualizar_infraestructura("Muy buena");
        String informacion = universidad.obtener_universidad();
        System.out.println(informacion);

    }
}
