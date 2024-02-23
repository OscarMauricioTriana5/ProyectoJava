package Ejercicios;

/*Oscar Triana 20232217856 */
/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19% */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        System.out.print("Ingrese el precio   sin IVA: ");
        double SinIVA = os.nextDouble();
        System.out.print("Ingrese la marca del reproductor: ");
        String marca = os.next();
        double descuento = 0;
        if (SinIVA >= 500) {
            descuento += 0.10;
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;
        }
        double precioConDescuento = SinIVA - (SinIVA * descuento);
        double iva = precioConDescuento * 0.19;
        double precioConIVA = precioConDescuento + iva;

        System.out.println("El precio con IVA incluido es: $" + precioConIVA);
        os.close();

    }
}