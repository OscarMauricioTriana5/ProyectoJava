package TallerPoo.GarajeEjercicio;

public class Auto extends Vehiculo {

    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String placa, String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(placa, marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;

        if (tieneRadio) {
            super.setImpuestoCirculacion(super.getImpuestoCirculacion() * 0.01);
        }
        if (tieneNavegador) {
            super.setImpuestoCirculacion(super.getImpuestoCirculacion() * 0.02);
        }
        if (cilindraje > 2499) {
            super.setCuotaMesGaraje(super.getCuotaMesGaraje() * 0.2);
        }
    }

    public boolean siTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean siTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }
}
