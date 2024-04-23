package Ejercicios;

import java.util.Scanner;

public class Ejercicio29chatgpt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de alumnos: ");
        int N = scanner.nextInt();

        int alumnosPrimerSemestre = 0;
        int alumnosNovenoSemestre = 0;
        int[] alumnosPorEspecialidad = new int[3]; // Se asume que hay 3 especialidades (A, B, C)

        for (int i = 0; i < N; i++) {
            System.out.println("\nIngrese los datos para el alumno " + (i + 1) + ":");
            System.out.print("Número de semestre: ");
            int semestre = scanner.nextInt();
            System.out.print("Calificación 1: ");
            double calif1 = scanner.nextDouble();
            System.out.print("Calificación 2: ");
            double calif2 = scanner.nextDouble();
            System.out.print("Calificación 3: ");
            double calif3 = scanner.nextDouble();

            // Calcular el promedio ponderado
            double promedio = (calif1 * 0.3 + calif2 * 0.35 + calif3 * 0.35);

            // Imprimir el promedio para cada alumno
            System.out.println("El promedio del alumno " + (i + 1) + " es: " + promedio);

            // Verificar si el promedio es mayor o igual a 3.0
            if (promedio >= 3.0) {
                System.out.println("El alumno " + (i + 1)
                        + " tiene un promedio mayor o igual a 3.0 y pertenece al semestre " + semestre);
            }

            // Contar alumnos por semestre
            if (semestre == 1) {
                alumnosPrimerSemestre++;
            } else if (semestre == 9) {
                alumnosNovenoSemestre++;
            }

            // Contar alumnos por especialidad
            System.out.print("Especialidad del alumno (A/B/C): ");
            char especialidad = scanner.next().charAt(0);
            switch (especialidad) {
                case 'A':
                    alumnosPorEspecialidad[0]++;
                    break;
                case 'B':
                    alumnosPorEspecialidad[1]++;
                    break;
                case 'C':
                    alumnosPorEspecialidad[2]++;
                    break;
                default:
                    System.out.println("Especialidad no válida. Se omitirá este alumno en el conteo por especialidad.");
            }
        }

        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("Cantidad de alumnos en primer semestre: " + alumnosPrimerSemestre);
        System.out.println("Cantidad de alumnos en noveno semestre: " + alumnosNovenoSemestre);
        System.out.println("Cantidad de alumnos por especialidad:");
        System.out.println("Especialidad A: " + alumnosPorEspecialidad[0] + " alumnos");
        System.out.println("Especialidad B: " + alumnosPorEspecialidad[1] + " alumnos");
        System.out.println("Especialidad C: " + alumnosPorEspecialidad[2] + " alumnos");

        scanner.close();
    }
}
