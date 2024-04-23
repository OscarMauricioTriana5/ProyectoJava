package herencia.clasesAbstatas;

public class cuadrado extends Figura {

    private double lado;

    public cuadrado() {
    }

    public cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;

        return resultado;
    }

}
