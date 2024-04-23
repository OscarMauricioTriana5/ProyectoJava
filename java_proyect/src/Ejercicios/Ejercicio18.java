package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = { "lunes", "martes", "miercoles", " jueves", " viernes", " sabado", "domingo" };
        double[] temp = new double[diasSemana.length];

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("ingrese el día de la semana ");
            String dia = sc.next();
            System.out.println("ingrese la temperatura promedio para el día " + dia + ":");
            double temperatura = sc.nextDouble();
            temp[i] = temperatura;

            if (temperatura < 10) {
                System.out.println("El día está muy Frío");
            } else if (temperatura < 20) {
                System.out.println("El día está Frío");
            } else if (temperatura < 24) {
                System.out.println("El día está Templado");
            } else if (temperatura < 29) {
                System.out.println("El día está Agradable");
            } else if (temperatura < 35) {
                System.out.println("El día está caliente");
            } else if (temperatura > 35) {
                System.out.println("El día está muy Caliente");
            }

            System.out.println("la temperatura promedio del día" + dia + " fue de " + temp[i]);
        }

    }
}
