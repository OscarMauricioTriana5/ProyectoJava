package poo;

public class Coche {

    // atributos
    String marca;
    String color;
    String matricula;
    int cilindraje;

    // metodos de la clase
    // usamos el public "modificador de acceso" void "se utiliza ARA INDICAR UN
    // prOCEDIMIENTO "

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCilindraje() {
        return this.cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void dimeSiEsMetalizado() {
        if (color.equals("negro")) {
            System.out.println("El coche tiene pintura metalizada ");

        } else {
            System.out.println("El coche no tiene pintura metalizada ");
        }

    }

    public void dimeLaMarca() {
        if (marca.equals("mercedes")) {
            System.out.println("es Mercedes");
        } else {
            System.out.println("es udi");
        }
    }

    public void dimeElCilidraje() {
        if (cilindraje >= 250)
            System.out.println("es de alto colindraje");
        else {
            System.out.println("es de bajo cilindraje");
        }
    }
    // constructores son importantes para contruir un objeto
    // funciones para crear objetos y se llaman siemre igual de la clase y no
    // retornan ningun valor
    // hay dos, consstructores vacios y constructores con todos los parametros
}
