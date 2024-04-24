package TallerPoo;

public class tets1 {
    public static void main(String[] args) {
        Triangulo equilatero = new Triangulo(20, 5);
        System.out.println("equilatero: " + equilatero);
        System.out.println("La area del trinagulo es: " + equilatero.mostrarArea());

        Triangulo equilatero1 = new Triangulo(50, 20);
        System.out.println("equilatero1: " + equilatero1);
        System.out.println("La area del trinagulo es: " + equilatero1.mostrarArea());

    }

}
