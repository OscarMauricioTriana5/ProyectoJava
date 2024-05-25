package TallerPoo.GarajeEjercicio;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String placa, String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(placa, marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion();
        getCuotaMesGaraje();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            double motoImpuesto = getImpuestoCirculacion();
            double incremento = (getPrecio() * 0.1);
            setImpuestoCirculacion(motoImpuesto + incremento);
        }
    }

    public void aumentoCuotaMesGarage() {
        if (tieneSidecar) {
            double incrementoCuota = (cuota_Mes_Garaje * 0.5);
            setCuotaMesGaraje(getCuotaMesGaraje() + incrementoCuota);

        }
    }
}
