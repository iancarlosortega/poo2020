package arreglosdeberpoo;

public class TransformarBinario {
    private String numero = "";
    private int decimal = 0;
    private  int posicion = 0;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int[] transformar(){
        int[] numeros = new int[numero.length()];
        for(int i=0; i<numero.length(); i++){
            numeros[i] = Character.getNumericValue(numero.charAt(i));
        }
        return numeros;
    }

    public int calcularDecimal(){
        for (int i = transformar().length-1; i >=0 ; i--) {
            double multiplicacion = Math.pow(2,posicion);
            decimal += transformar()[i] * multiplicacion;
            posicion++; // Uso del ++ para que vaya incrementando en 1
        }
        return decimal;
    }

}
