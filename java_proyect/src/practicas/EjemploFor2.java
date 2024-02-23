package practicas;

public class EjemploFor2 {

    public static void main(String[] args) {
        // Para i=1 Hasta 5 Hacer
        //
        // FinPara
        for (int i = 1; i <= 5; i++) {
            System.out.println("i:" + i);

        }
        int na, acum = 0;
        int numeroMinimo = 1, numeroMaximo = 10;
        for (int i = 1; i <= 5; i++) {
            System.out.println("i:" + i);
            na = (int) (Math.random() * ((numeroMaximo + 1) - numeroMinimo) + numeroMinimo);
            System.out.println("na: " + na);
            acum += na;
        }
        System.out.println("acum:" + acum);

    }
}