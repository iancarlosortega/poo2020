package arreglosdeberpoo;

public class Estudiante {
    private String [] nombre = new String[5];
    private int [] edad = new int[5];
    private String [] universidad = new String[5];
    private String [] celular = new String[5];


    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    public Estudiante(String[] nombre, int[] edad, String[]universidad, String[] celular){
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.celular = celular;
    }

    public String imprimir(){
        String cadena = "";
        for (int i = 0; i < 5; i++) {
            cadena = String.format("%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n\n",cadena,nombre[i],
                    edad[i],universidad[i],celular[i]);
        }
        return cadena;
    }
}
