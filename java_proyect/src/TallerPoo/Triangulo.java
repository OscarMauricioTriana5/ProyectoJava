package TallerPoo;
// OSCAR TRIANA 2023217856

/* Crear una clase Triangulo que representa un triángulo equilátero, con los atributos enteros base y
altura. Crear métodos para dar valor y poder consultar los atributos, un método constructor, y un
método para calcular el área del triángulo.
Crear una clase Prueba que en su main cree varios objetos de Triángulo, consulte sus atributos, cambie
el valor nuevamente de los atributos y pruebe su método. */

public class Triangulo {

    int base;
    int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double mostrarArea() {
        return (base * altura / 2);

    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

}
