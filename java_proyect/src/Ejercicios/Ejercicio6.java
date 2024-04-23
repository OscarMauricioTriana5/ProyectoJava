package Ejercicios;

/*Oscar Triana 20232217856 
Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente 
EDAD                             NIVEL HEMOGLOBINA
0 - 1 mes                        13 - 26 g%
> 1 y < = 6 meses                10 - 18 g%
> 6 y < = 12 meses               11 - 15 g%
> 1 y < = 5 años                 11.5 - 15 g%
> 5 y < = 10 años                12.6 - 15.5 g%
> 10 y < = 15 años               13 - 15.5 g%
Mujeres > 15 años                12 - 16 g%
Hombres > 15 años                14 - 18 g%
*/
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar datos de los jockeys
        String[] jockeys = { "Ana", "Pedro", "Juan", "Cesar", "Diana", "María" };

        // Generar datos aleatorios de carreras
        int numCarreras = (int) (Math.random() * 20) + 1; // Número de carreras entre 1 y 20
        int[][] carreras = new int[numCarreras][6]; // Arreglo para almacenar datos de las carreras
        for (int i = 0; i < numCarreras; i++) {
            carreras[i][0] = i; // Número de carrera
            carreras[i][1] = (int) (Math.random() * 6); // Código del jockey ganador
            carreras[i][2] = (int) (Math.random() * 150) + 100; // Tiempo del ganador en segundos
            carreras[i][3] = (int) (Math.random() * 6); // Código del segundo lugar
            carreras[i][4] = (int) (Math.random() * 150) + 100; // Tiempo del segundo lugar en segundos
            carreras[i][5] = (int) (Math.random() * 6); // Código del tercer lugar
        }

        // Generar arreglo para almacenar puntuaciones de jockeys
        int[][] puntuaciones = new int[6][5]; // [Jinete][CarrerasGanadas, CarrerasSegundo, CarrerasTercero, Puntuación]

        // Calcular puntuaciones y actualizar arreglo de puntuaciones
        for (int i = 0; i < numCarreras; i++) {
            int ganador = carreras[i][1];
            int segundo = carreras[i][3];
            int tercero = carreras[i][5];

            puntuaciones[ganador][0]++; // Incrementar carreras ganadas
            puntuaciones[segundo][1]++; // Incrementar carreras segundo
            puntuaciones[tercero][2]++; // Incrementar carreras tercero

            int diferenciaTiempo = carreras[i][2] - carreras[i][4]; // Diferencia de tiempo entre ganador y segundo
                                                                    // lugar
            if (diferenciaTiempo > 5) {
                puntuaciones[ganador][3] += 6; // 5 puntos por ganar + 1 punto adicional
            } else {
                puntuaciones[ganador][3] += 5; // 5 puntos por ganar
            }
            puntuaciones[segundo][3] += 3; // 3 puntos por segundo lugar
            puntuaciones[tercero][3] += 1; // 1 punto por tercer lugar
        }

        // Generar podio
        int[][] podio = new int[3][2]; // [Posición en el podio][Código del jockey]
        for (int i = 0; i < 3; i++) {
            int maxPuntuacion = -1;
            int maxIndex = -1;
            for (int j = 0; j < 6; j++) {
                if (puntuaciones[j][3] > maxPuntuacion) {
                    maxPuntuacion = puntuaciones[j][3];
                    maxIndex = j;
                } else if (puntuaciones[j][3] == maxPuntuacion) {
                    if (puntuaciones[j][0] > puntuaciones[maxIndex][0]) {
                        maxIndex = j; // Si hay empate en la puntuación, se considera la cantidad de carreras ganadas
                    }
                }
            }
            podio[i][0] = maxIndex; // Código del jockey en el podio
            podio[i][1] = maxPuntuacion; // Puntuación del jockey en el podio
            puntuaciones[maxIndex][3] = -1; // Marcar como procesado
        }

        // Imprimir resultados
        System.out.println("Podio del torneo:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + jockeys[podio[i][0]] + " - Puntuación: " + podio[i][1]);
        }
    }
}