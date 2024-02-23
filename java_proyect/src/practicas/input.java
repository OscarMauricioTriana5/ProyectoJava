package practicas;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero1 = Sc.nextInt();
        System.out.print("Ingresa otro número: ");
        int numero2 = Sc.nextInt();
        System.out.println("La suma es: " + (numero1 + numero2));
    }
}
