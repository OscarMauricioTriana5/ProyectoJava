package Ejercicios;

/*Oscar Triana 20232217856 */
/*
 En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Igrese la cantidad de  llantas desea comprar: ");
        int cantidadLlantas = scanner.nextInt();

        double precioUnitario = 0;

        if (cantidadLlantas < 5) {
            precioUnitario = 100;
        } else if (cantidadLlantas <= 10) {
            precioUnitario = 75;
        } else if (cantidadLlantas > 10) {
            precioUnitario = 50;
        }
        double valorTotal = precioUnitario * cantidadLlantas;
        System.out.println("El precio unitario por cada llanta es: $ " + precioUnitario);
        System.out.println("El precio total es : $" + valorTotal);

        scanner.close();
    }
}