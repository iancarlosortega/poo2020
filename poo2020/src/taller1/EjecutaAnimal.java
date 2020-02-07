package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.actualizar_alimentacion("dinorey");
        animal.actualizar_clasificacion("a");
        animal.actualizar_especie("Tito");
        animal.actualizar_peso(15);
        animal.actualizar_reproduccion("asd");
        animal.actualizar_tamanio("45");
        String informacion = animal.obtener_animal();
        System.out.println(informacion);

    }
}
