package poo2;

public class Alumno {
    // atributos
    String nombre;
    String apellido;
    int id;
    // Constructores

    public Alumno(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Alumno() {// vacio
    }

    // metodos get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // metodo personalizados
    public void motrarNombre() {
        System.out.println("hola soy un alumno y puedo decir mi nombre ");
    }

    public void motrarAprobado(double calificacion) {
        if (calificacion >= 6) {
            System.out.println("aprobe ");
        } else {
            System.out.println("no aprobe");
        }
    }
    // herencia: ppermite reutilizar clases de la clase madre
}
