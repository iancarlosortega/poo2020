package herenciaautomotriz;

public class Vendedor {
    private double precioAuto;
    private int numVendidos;
    private double sueldoQuincenal;

    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }

    public int getNumVendidos() {
        return numVendidos;
    }

    public void setNumVendidos(int numVendidos) {
        this.numVendidos = numVendidos;
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public void calcularSueldoQuincenal(){
        sueldoQuincenal = 400 + (0.2*(precioAuto*numVendidos));
    }
}
