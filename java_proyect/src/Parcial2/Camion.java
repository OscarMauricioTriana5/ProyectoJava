package Parcial2;

public class Camion extends Vehiculo1 {

    private String carroceria;
    private String tipoDeCamion;
    private double capacidad;

    public Camion(String marca, double precio, int cilindraje, String carroceria, String tipoDeCamion,
            double capacidad) {
        super(marca, precio, cilindraje);
        this.carroceria = carroceria;
        this.tipoDeCamion = tipoDeCamion;
        this.capacidad = capacidad;

    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getTipoDeCamion() {
        return tipoDeCamion;
    }

    public void setTipoDeCamion(String tipoDeCamion) {
        this.tipoDeCamion = tipoDeCamion;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void aumentoCuotaMesGarage(double cuotaMesGarajes) {
        if (tipoDeCamion.equalsIgnoreCase("sencillo")) {
            super.setCuotaMesGaraje(super.getCuotaMesGaraje() * 0.75);
        } else {
            super.setCuotaMesGaraje(super.getCuotaMesGaraje() * 1.25);
        }
    }

    @Override
    public double calcularImpuestoCirculacion() {
        double impuestoCamion = (getPrecio() * 0.09);
        double incrementoCamion = (getPrecio() + impuestoCamion);
        return impuestoCamion + incrementoCamion;

    }
}