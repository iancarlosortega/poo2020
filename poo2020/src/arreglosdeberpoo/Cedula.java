package arreglosdeberpoo;

public class Cedula {
    private String cedula;
    private String cadena;
    private int dv =0;
    private int producto = 0;
    private int residuo = 0;
    private int suma = 0;
    private int[] coef = {2, 1, 2, 1, 2, 1, 2, 1, 2};

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getResiduo() {
        return residuo;
    }

    public void setResiduo(int residuo) {
        this.residuo = residuo;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int[] getCoef() {
        return coef;
    }

    public void setCoef(int[] coef) {
        this.coef = coef;
    }

    public int[] transformar() {
        int[] numeros = new int[cedula.length()];
        for (int i = 0; i < cedula.length(); i++) {
            numeros[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return numeros;
    }

    public int calcularDigitoV() {
        suma = 0;
        residuo = 0;
        for (int i = 0; i < 9; i++) {
            producto = transformar()[i] * coef[i];
            if (producto >= 10) {
                producto = producto - 9;
            }
            suma = suma + producto;
        }
        residuo = suma%10;
        dv = 10 - residuo;
        if (dv == 10){
            dv = 0;
        }
        return dv;
    }

}
