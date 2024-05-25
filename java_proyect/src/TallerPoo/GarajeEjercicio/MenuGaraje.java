package TallerPoo.GarajeEjercicio;

import java.util.Scanner;

public class MenuGaraje {
    public static void main(String[] args) {

        Moto gp = new Moto("ser56", "yamaha", 12.000, 500, false);
        Auto ferrari = new Auto("Gay690", "ferrari", 12.000, 10, false, false);
        // Scanner eleccion = new Scanner(System.in);
        Vehiculo maotogp = new Moto("sr567", "Yamaha", 12.000, 1200, true);

        System.out.println("la moto es : " + maotogp);
        System.out.println("no va a salir nada " + ferrari);

        /*
         * int opcion;
         * do {
         * System.out.println("Menú de Gestión del Garaje");
         * System.out.println("1.- Alquilar un espacio");
         * System.out.println("2.- Retirar vehículo");
         * System.out.println("3.- Consulta de ingresos mensuales");
         * System.out.println("4.- Consulta proporción autos / motos");
         * System.out.
         * println("5.- Listado de matrículas y cuota mensual y tipo vehículo");
         * System.out.println("0.- Salir");
         * System.out.print("Seleccione una opción: ");
         * //opcion = eleccion.nextInt();
         */
    }

}
