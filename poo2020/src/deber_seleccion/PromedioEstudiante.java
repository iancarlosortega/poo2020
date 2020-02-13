package deber_seleccion;

public class PromedioEstudiante {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double promedio;
    private String nombre_est;
    private String estado;

    // Creacion del constructor
    public PromedioEstudiante(double nota1, double nota2, double nota3, double nota4,String nombre_est){
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
        this.setNota4(nota4);
        this.setNombre_est(nombre_est);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNombre_est() {
        return nombre_est;
    }

    public void setNombre_est(String nombre_est) {
        this.nombre_est = nombre_est;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double calcularPromedio(){
        promedio = (nota1 + nota2 + nota3 + nota4)/4;
        return promedio;
    }

    /**
     * Metodo para definir el estado del estudiante aprobado o reprobado
     * @return
     */
    public String estadoEstudiante(){
        if (promedio > 60){
            estado = "Aprobado";
        }else{
            if (promedio < 60){
                estado = "Reprobado";
            }
        }
        return estado;
    }

    public String imprimir(){
        String mensaje = String.format("Nombre del estudiante: %s\nPromedio de calificaciones: %.2f (%s)"
                ,nombre_est,calcularPromedio(),estadoEstudiante());
        return mensaje;
    }


}
