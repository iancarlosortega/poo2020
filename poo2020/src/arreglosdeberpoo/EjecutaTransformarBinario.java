package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaTransformarBinario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero binario que desea transformar a decimal:");
        String numero = entrada.nextLine();

        TransformarBinario transformarBinario = new TransformarBinario();
        transformarBinario.setNumero(numero);

        System.out.printf("%s en binario = %d en decimal",numero,transformarBinario.calcularDecimal());
    }
}
