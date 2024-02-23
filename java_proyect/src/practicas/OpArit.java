package practicas;

public class OpArit {
    public static void main(String[] args) {
        int a, b, suma, resta, res; // declaracion de variables
        double div;
        a = 9;
        b = 4;
        suma = a + b;
        System.out.println("Suma:" + suma);
        resta = a - b;
        System.out.println("Resta: " + resta);
        div = (double) a / (double) b;
        System.out.println("Div: " + div);
        res = a % b;
        System.out.println("Res: " + res);
    }
}
