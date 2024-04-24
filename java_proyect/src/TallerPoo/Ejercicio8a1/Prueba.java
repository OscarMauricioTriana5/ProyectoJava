package TallerPoo.Ejercicio8a1;

public class Prueba {
    public static void main(String[] args) {

        triangulo t1 = new triangulo("rojo", "triangulo", 0, 0, 45, 15);
        System.out.println("El area del trinagulo es: " + t1.calcularArea());

        triangulo t2 = new triangulo("rojo", "triangulo", 0, 0, 30, 15);
        System.out.println("El area del trinagulo es: " + t2.calcularArea());

        Cuadrado t3 = new Cuadrado("verde", "cuadrado", 0, 0, 6);
        System.out.println("El area del cuadrado es: " + t3.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + t3.calcularPerimetro());

        Cuadrado t4 = new Cuadrado("verde", "cuadrado", 0, 0, 9);
        System.out.println("El area del cuadrado es: " + t4.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + t4.calcularPerimetro());

    }
}
