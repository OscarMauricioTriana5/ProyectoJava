package Ejercicios;

//Oscar Mauricio  Triana Castillo 20232217856

import java.util.Random;

public class Parcial {

    public static void main(String[] args) {

        String[] corredores = { "Ana", "Pedro", "Juan", "Cesar", "Diana", "Maria" };
        int carrera = (int) (Math.random() * 20) + 1;

        int[][] car = new int[carrera][7];
        for (int c = 0; c < carrera; c++) {
            car[c][0] = c;
            car[c][1] = (int) (Math.random() * 6);
            car[c][2] = (int) (Math.random() * 120) + 100;
            car[c][3] = (int) (Math.random() * 6);
            car[c][4] = (int) (Math.random() * 135) + 120;
            car[c][5] = (int) (Math.random() * 6);
            car[c][6] = (int) (Math.random() * 150) + 135;
        }
        int[][] puntuaciones = new int[6][5];
        for (int c = 0; c < carrera; c++) {
            int primero = car[c][1];
            int segundo = car[c][3];
            int tercero = car[c][5];

            puntuaciones[primero][0]++;
            puntuaciones[segundo][1]++;
            puntuaciones[tercero][2]++;

        }
        int[][] podio = new int[3][2];
        for (int c = 0; c < 3; c++) {
            int puntuacionMax = -1;
            int maxFolder = -1;
            for (int a = 0; a < 6; a++) {
                if (puntuaciones[a][3] > puntuacionMax) {
                    puntuacionMax = puntuaciones[a][3];
                    maxFolder = a;
                } else if (puntuaciones[a][3] == puntuacionMax) {
                    if (puntuaciones[a][0] > puntuaciones[maxFolder][0]) {
                        maxFolder = a;
                    }
                }
            }
            podio[c][0] = maxFolder;
            podio[c][1] = puntuacionMax;
            puntuaciones[maxFolder][3] = -1;
        }
        for (int c = 0; c < carrera; c++) {
            System.out.println("Carrera " + c);
            System.out.println("Primero: " + corredores[car[c][1]] + " Tiempo: " + car[c][2] + " segundos");
            System.out.println("Segundo lugar: " + corredores[car[c][3]] + " Tiempo: " + car[c][4] + " segundos");
            System.out.println("Tercer lugar: " + corredores[car[c][5]] + " Tiempo: " + car[c][6] + " segundos");
        }
        System.out.println("el podio es :");
        for (int c = 0; c < 3; c++) {
            System.out.println((c + 1) + ". " + corredores[podio[c][0]] + " - Puntuación: " + podio[c][1]);
        }

    }
}
