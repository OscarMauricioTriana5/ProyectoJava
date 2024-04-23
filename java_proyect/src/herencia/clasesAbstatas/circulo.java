package herencia.clasesAbstatas;

public class circulo extends Figura {

    private double radio;

    public circulo() {
    }

    public circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;

        return resultado;
    }

}
