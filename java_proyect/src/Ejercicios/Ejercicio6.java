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
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner Messi = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String Nombre = Messi.nextLine();
        System.out.println("digite su sexo");
        String sexo = Messi.nextLine();
        System.out.println("digite su edad ");
        int edad = Messi.nextInt();
        System.out.println("Digite su nivel de Hemoglobina");
        double hemoglobina = Messi.nextDouble();
        double nivelEmoglobina = 0;
        double limiteMasculino = 0;
        double limiteFemenino = 0;
    }
}
