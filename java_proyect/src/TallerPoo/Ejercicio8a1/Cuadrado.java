package TallerPoo.Ejercicio8a1;

public class Cuadrado extends Forma {
    double lado;

    public Cuadrado(String color, String nombre, double poicionX, double posicionY, double lado) {
        super(color, nombre, poicionX, posicionY);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (lado * lado);
    }

    public double calcularPerimetro() {
        return (4 * lado);
    }

}
