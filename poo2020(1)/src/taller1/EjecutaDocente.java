package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.actualizar_nombre("Wilson");
        docente.actualizar_apellido("Guanoquiza");
        docente.actualizar_cedula(114874965);
        docente.actualizar_edad(35);
        docente.actualizar_genero("M");
        docente.actualizar_nacionalidad("Ecuatoriano");
        docente.actualizar_titulo("Docente");
        String informacion = docente.obtener_docente();
        System.out.println(informacion);
    }
}
