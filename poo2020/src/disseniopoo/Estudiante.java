package diseniopoo;

public class Estudiante {

    // Creacion de variables globales
    private double nota1,nota2,promedio;
    private String nombre, materia;


    /**
     * Creacion del constructor con los siguientes atributos:
     * @param nota1
     * @param nota2
     * @param nombre
     * @param materia
     */
    public Estudiante(double nota1, double nota2, String nombre, String materia){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nombre = nombre;
        this.materia = materia;
        promedio = (this.nota1 + this.nota2);

    }

    /**
     * Metodo para saber si el estudiante esta aprobado o reprobado
     * @return mensaje
     */
    public String circunstancia_estudiante(){
        String mensaje = "";
        if (promedio >= 28){
            mensaje = "Aprobado";
        } else {
            if (promedio < 28){
                mensaje = "Reprobado";
            }
        }
        return mensaje;
    }

    /**
     * Metodo para ordenar el mensaje que se mostrara en pantalla utilizando el String.format
     * @return mensaje
     */
    public String imprimir(){
        String mensaje = String.format("Nombre: %s\nMateria: %s\nPrimer Bimestre: %.2f\n" +
                "Segundo Bimestre: %.2f\nPromedio: %.2f (%s).",nombre,materia,nota1,nota2,promedio,
                circunstancia_estudiante());
        return mensaje;
    }

}
