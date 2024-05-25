package Ejercicios.Parcial2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import TallerPoo.GarajeEjercicio.iGaraje;

public class Garaje implements iGaraje {

    private static final int NUM_ESPACIOS = 10; // Constante de número de espacios
    private List<Vehiculo> vehiculos; // Lista de vehículos

    public Garaje() {
        this.vehiculos = new ArrayList<>(NUM_ESPACIOS);
    }

    // Agregar vehículo
    /**
     * @param vehiculo
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() < NUM_ESPACIOS && (countMotos() ,+ vehiculo.getClass().equals(Moto.class)) <= NUM_ESPACIOS * 0.8) {
            if (vehiculo.getPlaca() != null) {
                vehiculos.add(vehiculo);
                System.out.println("Vehículo agregado exitosamente");
            } else {
                System.out.println("El vehículo debe tener una matrícula para ser agregado");
            }
        } else {
            System.out.println("No hay espacio disponible en el garaje o se ha superado el límite de motos");
        }
    }

    // Retirar vehículo
    public void retirarVehiculo(String placa) {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculos.remove(i);
                System.out.println("Vehículo retirado exitosamente");
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con la matrícula indicada");
    }

    // Cálculo de ingresos mensuales
    @Override
    public double calcularIngresos() {
        double ingresosTotales = 0;
        for (Vehiculo vehiculo : vehiculos) {
            ingresosTotales += vehiculo.getCuotaMesGaraje();
        }
        return ingresosTotales;
    }

    // Cálculo de ocupación por tipo de vehículo
    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo vehiculo) {
        int contador = 0;
        for (Vehiculo vehiculoEnGaraje : vehiculos) {
            if (vehiculoEnGaraje.getClass().equals(vehiculo.getClass())) {
                contador++;
            }
        }
        return contador;
    }

    // Conteo de motos
    public int countMotos() {
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass().equals(Moto.class)) {
                count++;
            }
        }
        return count;
    }

    // Menú principal del garaje
    public void menuGaraje() {
        int opcion;
        do {
            System.out.println("\n\nMenú Garaje:");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
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
                    consultarProporcionAutosMotos();
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

    private void listarVehiculos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarVehiculos'");
    }

    private void consultarProporcionAutosMotos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarProporcionAutosMotos'");
    }

    private void consultarIngresosMensuales() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarIngresosMensuales'");
    }

    // Leer la opción del menú
    private int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe introducir un número entero.");
            scanner.next(); // Limpiar el buffer de entrada
            return -1;
        }
    }
}
