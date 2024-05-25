package Parcial2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import TallerPoo.GarajeEjercicio.iGaraje;

public class Garaje1 implements iGaraje {

    private static final int NUM_ESPACIOS_Camiones = 5;
    private List<Vehiculo1> espacio;

    public void Garaje() {
        this.espacio = new ArrayList<>(NUM_ESPACIOS_Camiones);
    }

    public void agregarVehiculo(Vehiculo1 espacio) {
        if (espacio.size() < NUM_ESPACIOS_Camiones && (countCamion() ,+ Vehiculo1.getClass().equals(Camion.class)) <= NUM_ESPACIOS_Camiones * 0.3) {
            if (espacio.getPlaca() != null) {
                espacio.add(espacio);
                System.out.println("Vehículo agregado exitosamente");
            } else {
                System.out.println("El vehículo debe tener una matrícula para ser agregado");
            }
        } else {
            System.out.println("No hay espacio disponible en el garaje o se ha superado el límite de Camiones ");
        }
    }

    private void int countCamion() {
       
    }

    // Retirar vehículo
    public void retirarVehiculo(String placa) {
        for (int i = 0; i < espacio.size(); i++) {
            Vehiculo1 espacio = espacio.get(i);
            if (espacio.getPlaca().equals(placa)) {
                espacio.remove(i);
                System.out.println("Vehículo retirado exitosamente");
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con la matrícula indicada");
    }

    public double calcularIngresos() {
        double ingresosTotales = 0;
        for (Vehiculo1 espacio : espacio) {
            ingresosTotales += espacio.getCuotaMesGaraje();
        }
        return ingresosTotales;
    }

    public int calcularOcupacionPorTipoVehiculo(Vehiculo1 Espacio) {
        int contador = 0;
        for (Vehiculo1 vehiculoEnGaraje : espacio) {
            if (vehiculoEnGaraje.getClass().equals(espacio.getClass())) {
                contador++;
            }
        }
        return contador;
    }

    // Conteo de CAMION
    public int countMotos() {
        int count = 0;
        for (Vehiculo1 espacio : espacio) {
            if (espacio.getClass().equals(Camion.class)) {
                count++;
            }
        }
        return count;
    }

    public void menuGaraje() {
        int opcion;
        do {
            System.out.println("\n\nMenú Garaje:");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción de camiones");
            System.out.println("5. Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("0. Salir");
            System.out.print("Introduzca una opción: ");

            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarVehiculo(null);
                    break;
                case 2:
                    retirarVehiculo(null);
                    break;
                case 3:
                    consultarIngresosMensuales();
                    break;
                case 4:
                    consultarProporcionCamiones();
                    break;
                case 5:
                    listarVehiculos();
                    break;
                case 0:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void consultarProporcionCamiones() {
    }

    private void listarVehiculos() {

    }

    private void consultarIngresosMensuales() {

    }

    // Leer la opción del menú
    private int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe introducir un número entero.");
            scanner.next();
            return -1;
        }
    }
}
