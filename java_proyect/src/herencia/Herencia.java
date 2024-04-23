package herencia;

public class Herencia {
    public static void main(String[] args) {
        // polimorfismo
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new jefe();

        Persona per = new Persona();
        Consultor consul = new Consultor();

        per = consul;

    }
}
