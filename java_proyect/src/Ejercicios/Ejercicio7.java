package Ejercicios;

/*Oscar Triana 20232217856
Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de descuento.
▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
descuento.
▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de descuento.
▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner Lu = new Scanner(System.in);
        System.out.println("Ingrese la carrera que estudia ");
        String Carrera = Lu.next();
        System.out.println("Ingrese su promedio ");
        double Promedio = Lu.nextDouble();
        System.out.println("Ingrese la cantidad de materias reprobadas ");
        int Reprobadas = Lu.nextInt();

        double Creditos = 0;
        double Descuento = 0;
        double Matricula = 0;

        if (Carrera.equalsIgnoreCase("Tecnologia") && Promedio >= 9.5) {
            Creditos = 55;
            Descuento = 0.25;
            Matricula = 18000 * (Creditos / 5);
        } else if (Promedio >= 9 && Carrera.equalsIgnoreCase("Tecnologia ")) {
            Creditos = 50;
            Descuento = 0.10;
            Matricula = 18000 * (Creditos / 5);
        } else if (Promedio > 7 && Carrera.equalsIgnoreCase("Tecnologia ")) {
            Creditos = 45;
            Descuento = 0.0;
            Matricula = 18000 * (Creditos / 5);
        } else if (Promedio < 7 && Carrera.equalsIgnoreCase("Tecnologia ")) {
            Creditos = 45;
            Descuento = 0.0;
            Matricula = 18000 * (Creditos / 5);
            if (Reprobadas <= 3)
                ;
        } else if (Promedio > 7 && Carrera.equalsIgnoreCase("Tecnologia ")) {
            Creditos = 40;
            Descuento = 0.0;
            Matricula = 18000 * (Creditos / 5);
            if (Reprobadas > 4)
                ;
        } else if (Promedio >= 9.5 && Carrera.equalsIgnoreCase("Profesional")) {
            Creditos = 45;
            Descuento = 0.20;
            Matricula = 30000 * (Creditos / 5);
        } else if (Promedio < 9.5 && Carrera.equalsIgnoreCase("Profesional")) {
            Creditos = 55;
            Descuento = 0.0;
            Matricula = 30000 * (Creditos / 5);

        }

        double ValorPagar = Matricula - (Matricula * Descuento);
        System.out.println("El valor de la matricula es de: " + ValorPagar);

        Lu.close();

    }

}
