package Ejercicios;

/*Oscar Triana 20232217856 */
/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner mau = new Scanner(System.in);
        System.out.println(
                "Hola buenas tardes, el kilo de manzana cuesta $3000 pesos,cuanto kilos de manzana desea llevar ");
        double manzana = mau.nextDouble();
        double descuento = 0;
        double valorTotal = manzana * 3000;

        if (manzana <= 2) {
            descuento = 0;
        } else if (manzana <= 5) {
            descuento = 0.10;
        } else if (manzana <= 10) {
            descuento = 0.15;
        } else {
            descuento = 0.20;
        }
        double valorConDescuento = valorTotal - (valorTotal * descuento);
        System.out.println("Sub total $: " + valorTotal);
        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: " + valorConDescuento);
        mau.close();

    }
}