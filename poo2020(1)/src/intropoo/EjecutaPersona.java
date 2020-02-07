package intropoo;

public class EjecutaPersona {

    public static void main(String[] args) {
        // Creacion de objeto
        Persona persona = new Persona("Masculino","Catolica","Dinorey",12);
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("edad: "+persona.getEdad());
        System.out.println("religion: "+persona.getReligion());
        System.out.println("genero: "+persona.getGenero());

        //Creacion de objeto
        Persona persona2 = new Persona("Masculino", "Catolico", 15);
        Persona persona3 = new Persona("Femenino","Catolico",49);
        System.out.println("Edad persona 2: "+persona2.getEdad());
        System.out.println("Edad persona 3: "+persona3.getEdad());
        System.out.println("Nombre persona 2: "+persona2.getNombre());
    }
}
