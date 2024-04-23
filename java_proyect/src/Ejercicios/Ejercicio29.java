package Ejercicios;

/*Elabore un programa que lea los siguientes datos para N alumnos: No. de semestre, Calif 1, Calif
2, Calif 3. Imprima el No. de semestre  de los alumnos que tengan promedio >= 3.0. El promedio es
ponderado, la primera calificación equivale al 30 %, la segunda al 35 % y la tercera al 35 %. Lo
que se pide calcular es lo siguiente:
a) El promedio para cada alumno.
b) Cuántos alumnos hay en primer semestre.
c) Cuántos alumnos hay en noveno semestre.
d) Cuántos alumnos hay en cada especialidad */
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {

        Double matriz[][] = new Double[5][5];
        Scanner variado = new Scanner(System.in);
        Double suma = 0.0;

        // for para cargar la matriz

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la calificacion del alumno n° " + f);
                matriz[f][c] = variado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][4] = suma / 3;
            suma = 0.0;

        }

        // for para recorrer la matriz
        for (int f = 0; f < 4; f++) {
            System.out.println("las notas del alumno n° " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota n° " + c + " " + matriz[f][c]);

            }

            System.out.println("El promedio de las notas es: " + matriz[f][4]);

            variado.close();

        }

    }
}
