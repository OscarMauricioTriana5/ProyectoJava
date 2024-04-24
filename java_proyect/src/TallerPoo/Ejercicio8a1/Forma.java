package TallerPoo.Ejercicio8a1;
/*8.a.1. Crea una clase llamada Forma:
• Con los siguientes atributos y métodos:
◦ String nombre
◦ double posicionX, double posicionY
◦ String color
◦ constructor propio con todos sus atributos
◦ método: double calcularArea( ), y getters y setters de los atributos.
• Crea una clase llamada Triangulo que herede de la clase Forma, y con los atributos base y altura.
Define en ella el método calcularArea().
• Crea una clase llamada Cuadrado que herede de la clase Forma, y con el atributo lado. Define en
ella el método calcularArea() y calcularPerimetro().
• Crea una clase aparte con el método main para probar los métodos de las subclases Triangulo y
Cuadrado. */

public class Forma {
    String color;
    String nombre;
    double poicionX;
    double posicionY;

    public Forma(String color, String nombre, double poicionX, double posicionY) {
        this.color = color;
        this.nombre = nombre;
        this.poicionX = poicionX;
        this.posicionY = posicionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPoicionX() {
        return poicionX;
    }

    public void setPoicionX(double poicionX) {
        this.poicionX = poicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double calcularArea() {
        return 0;

    }

}
