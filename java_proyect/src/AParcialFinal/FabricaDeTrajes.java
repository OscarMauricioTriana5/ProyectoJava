package AParcialFinal;

import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.text.html.Option;

import java.util.Scanner;

public class FabricaDeTrajes implements IfabricaDeTrajes {

    private ArrayList<Componentes> componentesEnAlmacen;
    private TreeSet<Traje> trajesEnAlmacen;
    private boolean sonRebajas = false;

    public FabricaDeTrajes() {
        this.componentesEnAlmacen = new ArrayList<>();
        this.trajesEnAlmacen = new TreeSet<>((traje1, traje2) -> traje1.getNombre().compareTo(traje2.getNombre()));
        this.sonRebajas = false;
    }

    public void escribirMenu() {
        System.out.println("Menu Fabrica De Trajes ");
        System.out.println("1.- Añadir componente a Almacen");
        System.out.println("2.- Listar componentes de Almacen");
        System.out.println("3.- Crear traje y añadir a Almacen");
        System.out.println("4.- Listar trajes de Almacen");
        System.out.println("7.- Activar/Desactivar las rebajas ");
        System.out.println("8.- Crear envio");
        System.out.println("9.- Crea componentes de Prueba ");
        System.out.println("0.- salir ");

    }

    @Override
    public void añadirComponentesAAlmacen(Componentes componentes) {
        componentesEnAlmacen.add(componentes);
    }

    @Override
    public void añadirTrajeAAlmacen(String nombre, ArrayList<Componentes> piezas) {
        Traje traje = new Traje(nombre, piezas);
        trajesEnAlmacen.add(traje);
    }

    @Override
    public void listarComponentes() {
        for (Componentes componentes : componentesEnAlmacen) {
            System.out.println(componentes);
        }
    }

    @Override
    public void activarDesactivarRebajas() {
        sonRebajas = !sonRebajas;
        System.out.println("rebajas " + (sonRebajas ? "activadas" : "desactivadas"));
    }

    @Override
    public void consultarEnvio() {
    }

    @Override
    public void crearEnvio() {
        System.out.println("Envio creado");
    }

    @Override
    public void listarTrajes() {
        for (Traje traje : trajesEnAlmacen) {
            System.out.println(traje);
        }

    }

    public void Prueba() {

        añadirComponentesAAlmacen(new Falda(1, "Falda Azul", "s", "Azul", false, 450, true));
        añadirComponentesAAlmacen(new Pantalon(23, "vaqueros", "M", "Gris", false, 280, true));
        añadirComponentesAAlmacen(new Blusa(4, "Blusa sencilla", "s", "Blanca", false, 150, false));
        añadirComponentesAAlmacen(new Chaqueta(33, "Americana", "L", "Negro", false, 230, 6));
    }

    public static void main(String[] args) {
        FabricaDeTrajes Messi = new FabricaDeTrajes();
        Scanner Leo = new Scanner(System.in);
        int option;

        do {
            Messi.escribirMenu();
            option = Leo.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Introduce los datos del componente");
                    System.out.println("ID: ");
                    int id = Leo.nextInt();
                    Leo.nextLine();
                    System.out.println("Nombre");
                    String nombre = Leo.nextLine();
                    System.out.println("Talla");
                    String talla = Leo.nextLine();
                    System.out.println("Color");
                    String color = Leo.nextLine();
                    System.out.println("Es comunitario F/V");
                    boolean esComunitario = Leo.nextBoolean();
                    System.out.println("Precio");
                    double precio = Leo.nextDouble();
                    Leo.nextLine();
                    Componentes barcelona = new Componentes(id, nombre, talla, color, esComunitario, precio);
                    Messi.añadirComponentesAAlmacen(barcelona);
                    break;

                case 2:
                    Messi.listarComponentes();
                    break;

                case 3:
                    System.out.println("Introduce el nombre del traje ");
                    Leo.nextLine();
                    String nomtraje = Leo.nextLine();
                    ArrayList<Componentes> componentesTraje = new ArrayList<>();
                    System.out.println("Inserte los ids de los componentes, recuerda separarlos con un epsacio :");
                    String ids = Leo.nextLine();
                    for (String idsStr : ids.split(" ")) {
                        int compId = Integer.parseInt(idsStr);
                        for (Componentes comp : Messi.componentesEnAlmacen) {
                            if (comp.getId() == compId) {
                                componentesTraje.add(comp);
                                break;
                            }

                        }
                    }
                    Messi.añadirTrajeAAlmacen(nomtraje, componentesTraje);
                    System.out.println("Traje añadido correctamente ");
                    break;

                case 4:
                    Messi.listarTrajes();
                    break;

                case 7:
                    Messi.activarDesactivarRebajas();
                    break;

                case 8:
                    Messi.crearEnvio();
                    break;

                case 9:
                    Messi.Prueba();
                    break;

                case 0:
                    System.out.println("Estas saliendo del Menu ..........");
                    break;

                default:
                    System.out.println("opcion no valida, no sabes leeer");

                    break;

            }

        } while (option != 0);

        Leo.close();

    }

}
