package TallerPoo.Ejerciciob4;

public class tets {
    public static void main(String[] args) {

        Fruta frutaOriginal = new Fruta("Manzana", (short) 50);
        System.out.println("Fruta original: " + frutaOriginal);

        // Crear una copia de la fruta usando el constructor de copia
        Fruta frutaCopia = new Fruta(frutaOriginal);
        System.out.println("Copia de la fruta: " + frutaCopia);

        // Modificar la copia y verificar que la original no se ve afectada
        frutaCopia.setNombre("Pera");
        frutaCopia.setPrecio((short) 60);
        System.out.println("Fruta original después de modificar la copia: " + frutaOriginal);
        System.out.println("Copia de la fruta después de modificarla: " + frutaCopia);

        // Crear otra copia usando el método copiar()
        Fruta otraCopia = frutaOriginal.copia();
        System.out.println("Otra copia de la fruta: " + otraCopia);

        // Verificar si las copias son iguales
        System.out.println("¿La copia es igual a la original? " + frutaOriginal.equals(frutaCopia));
        System.out.println("¿Otra copia es igual a la original? " + frutaOriginal.equals(otraCopia));
    }

}
