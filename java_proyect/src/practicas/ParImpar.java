/*
Hacer un bucle que genere 10 números enteros (de 1 a 10) y los almacene en un array,
y que se calcule posteriormente 
- la suma de los números que sean pares 
- la suma de los números que sean impares
- diga por pantalla cual de las dos sumas es mayor 
*/
package practicas;

public class ParImpar {
    public static void main(String[] args) {
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) ((Math.random() * 10) + 1);
            System.out.println("i: " + i + "- num[i]:" + num[i]);
        }
        int acPar = 0, acImpar = 0;
        for (int n : num) {
            if (n % 2 == 0) {
                acPar += n;
            } else {
                acImpar += n;
            }
        }
        if (acPar > acImpar) {
            System.out.println("Es mayor la suma de pares");
        } else
            System.out.println("Es mayor la suma de impares");

    }
}