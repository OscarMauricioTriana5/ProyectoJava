package TallerPoo.Ejercicio7a15;

public class test {
    public static void main(String[] args) {
        // Crear array de 5 Vestidos
        Vestido[] vestidos = new Vestido[5];
        vestidos[0] = new Vestido("Vestido1", 38, "Marca1", 50, true, 10);
        vestidos[1] = new Vestido("Vestido2", 40, "Marca2", 60, false, 8);
        vestidos[2] = new Vestido("Vestido3", 36, "Marca1", true, 15);
        vestidos[3] = new Vestido("Vestido4", 42, "Marca3", 70, false, 20);
        vestidos[4] = new Vestido("Vestido5", 38, "Marca2", 80, true, 12);

        double precioTotal = 0;
        double precioMasCaro = Double.MIN_VALUE;
        String nombreMasCaro = "";
        for (Vestido vestido : vestidos) {
            precioTotal += vestido.getPrecio();
            if (vestido.getPrecio() > precioMasCaro) {
                precioMasCaro = vestido.getPrecio();
                nombreMasCaro = vestido.getNombre();
            }
        }
        double mediaPrecios = precioTotal / vestidos.length;

        System.out.println("Precio total de los cinco vestidos: " + precioTotal);
        System.out.println("Media de los precios: " + mediaPrecios);
        System.out.println("Nombre del vestido más caro: " + nombreMasCaro);
    }

}
