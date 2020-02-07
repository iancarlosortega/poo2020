package taller1;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_apellido("Nice");
        estudiante.actualizar_nombre("Tito");
        estudiante.actualizar_cedula(1150237046);
        estudiante.actualizar_edad(18);
        estudiante.actualizar_genero("M");
        estudiante.actualizar_nacionalidad("Ecuatoriano");
        String estudiantes = estudiante.obtener_estudiante();
        System.out.println(estudiantes);
    }
}
