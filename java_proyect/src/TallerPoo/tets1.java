package TallerPoo;

public class tets1 {
    public static void main(String[] args) {
        Triangulo equilatero = new Triangulo(20, 5);
        System.out.println("la base del triangulo es:  " + equilatero.getBase());
        System.out.println("La altura del equilatero es:  " + equilatero.getAltura());
        System.out.println("La area del trinagulo es: " + equilatero.mostrarArea());

        Triangulo equilatero1 = new Triangulo(50, 20);
        System.out.println("la base del triangulo es:  " + equilatero1.getBase());
        System.out.println("La altura del equilatero es:  " + equilatero1.getAltura());
        System.out.println("La area del trinagulo es: " + equilatero1.mostrarArea());

    }

}
