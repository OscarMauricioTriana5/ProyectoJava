package TallerPoo.GarajeEjercicio;

public class Vehiculo {

    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    protected static double cuota_Mes_Garaje = 100;

    public Vehiculo(String placa, String marca, double precio, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;

    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public static double getCuotaMesGaraje() {
        return cuota_Mes_Garaje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuota_Mes_Garaje = cuotaMesGaraje;
        }
    }

    public boolean matricula(String matricula) {
        if (matricula.length() == 6) {
            return true;
        } else {
            return false;
        }

    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
    }
}
