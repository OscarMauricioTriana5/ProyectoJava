package poo2;

public class test {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno("oscar", "triana", 5);
        System.out.println("la id del alumno 2 es:  " + alu2.getId());
        System.out.println("El nombre del alumno 2 es:  " + alu2.getNombre());
        System.out.println("El apellido  del alumno 2 es:  " + alu2.getApellido());

        alu1.setId(8);
        alu1.setApellido("caseres");
        alu1.setNombre("rodri");

        System.out.println("el id del alumno 1 es " + alu1.id);
        System.out.println("El nombre del alumno 1 es:  " + alu1.getNombre());
        System.out.println("El apellido  del alumno 1 es:  " + alu1.getApellido());
        // podemos cambiar los objetos con el set
        alu2.setId(34);
        System.out.println("la id del alumno 2 es:  " + alu2.getId());
        System.out.println("El nombre del alumno 2 es:  " + alu2.getNombre());
        System.out.println("El apellido  del alumno 2 es:  " + alu2.getApellido());

    }

}
