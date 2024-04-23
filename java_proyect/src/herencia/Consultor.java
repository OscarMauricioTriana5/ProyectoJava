package herencia;

public class Consultor extends Persona {
    String nombre_consultor;
    int numero_consultor;

    public Consultor() {
    }

    public Consultor(int id, String cedula, String nombre, String apellido, String domicilio, String telefono,
            String nombre_consultor, int numero_consultor) {
        super(id, cedula, nombre, apellido, domicilio, telefono);
        this.nombre_consultor = nombre_consultor;
        this.numero_consultor = numero_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNumero_consultor() {
        return numero_consultor;
    }

    public void setNumero_consultor(int numero_consultor) {
        this.numero_consultor = numero_consultor;
    }

}
