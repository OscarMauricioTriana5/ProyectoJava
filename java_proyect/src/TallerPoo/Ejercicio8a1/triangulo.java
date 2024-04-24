package TallerPoo.Ejercicio8a1;

public class triangulo extends Forma {
    double base;
    double altura;

    public triangulo(String color, String nombre, double poicionX, double posicionY, double base, double altura) {
        super(color, nombre, poicionX, posicionY);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura / 2);
    }
}
