package herencia;

public class jefe extends Persona {
    int id_jefe;
    String departamento_jefe;

    public jefe() {
    }

    public jefe(int id, String cedula, String nombre, String apellido, String domicilio, String telefono, int id_jefe,
            String departamento_jefe) {
        super(id, cedula, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }

}
