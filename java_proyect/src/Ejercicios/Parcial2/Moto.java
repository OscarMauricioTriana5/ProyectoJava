package Ejercicios.Parcial2;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
    }

    // Getters and Setters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    // Cálculo del impuesto de circulación
    @Override
    public double calcularImpuestoCirculacion() {
        double impuestoBase = super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            impuestoBase *= 1.1;
        }
        return impuestoBase;
    }

    // Aumento de la cuota mensual de garaje
    @Override
    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        super.setCuotaMesGaraje(cuotaMesGaraje * 1.5);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tieneSidecar=" + tieneSidecar +
                ", " + super.toString() +
                '}';
    }

}
