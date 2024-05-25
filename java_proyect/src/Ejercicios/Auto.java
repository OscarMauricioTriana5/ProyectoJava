package Ejercicios;

import Ejercicios.Parcial2.Vehiculo;

public class Auto extends Vehiculo {

    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    // Getters and Setters
    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }

    // Cálculo del impuesto de circulación
    @Override
    public double calcularImpuestoCirculacion() {
        double impuestoBase = super.calcularImpuestoCirculacion();
        if (tieneRadio) {
            impuestoBase *= 1.01;
        }
        if (tieneNavegador) {
            impuestoBase *= 1.02;
        }
        return impuestoBase;
    }

    // Aumento de la cuota mensual de garaje
    @Override
    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (getCilindraje() > 2499) {
            super.setCuotaMesGaraje(cuotaMesGaraje * 1.2);
        } else {
            super.setCuotaMesGaraje(cuotaMesGaraje);
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "tieneRadio=" + tieneRadio +
                ", tieneNavegador=" + tieneNavegador +
                ", " + super.toString() +
                '}';
    }
}
