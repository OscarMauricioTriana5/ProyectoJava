package Ejercicios;

/*Oscar Triana 20232217856 */
/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500. 
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double precioComputadora = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantas computadoras compró:");
        int numero = scanner.nextInt();

        double valorTotal = numero * precioComputadora;
        double descuento;

        if (numero < 5) {
            descuento = 0.1;
        } else if (numero < 10) {
            descuento = 0.2;
        } else {
            descuento = 0.4;
        }

        double valorConDescuento = valorTotal - (valorTotal * descuento);

        System.out.println("valor total: $" + valorTotal);
        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("valor con descuento: $" + valorConDescuento);
        scanner.close();
    }
}
