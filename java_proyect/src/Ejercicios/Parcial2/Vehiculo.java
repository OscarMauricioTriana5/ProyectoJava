package Ejercicios.Parcial2;

public class Vehiculo {

    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    private static double cuotaMesGaraje = 100;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.placa = null;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.impuestoCirculacion = calcularImpuestoCirculacion();
    }

    // Setters and Getters
    public void setPlaca(String placa) {
        if (placa.length() == 6) {
            this.placa = placa;
        } else {
            System.out.println("La matrícula debe tener 6 caracteres");
        }
    }

    public String getPlaca() {
        return placa;
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

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        } else {
            System.out.println("La cuota mensual de garaje no puede ser negativa");
        }
    }

    // Método calcularImpuestoCirculacion
    public double calcularImpuestoCirculacion() {
        return precio * 0.02;
    }

    // Método matricular
    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cilindraje=" + cilindraje +
                ", impuestoCirculacion=" + impuestoCirculacion +
                ", cuotaMesGaraje=" + cuotaMesGaraje +
                '}';
    }

}
