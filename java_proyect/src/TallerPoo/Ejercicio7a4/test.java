package TallerPoo.Ejercicio7a4;

public class test {
    public static void main(String[] args) {
        Semaforo messi = new Semaforo("amarillo");
        for (int i = 0; i < 5; i++) {
            messi.cambio();
        }

    }

}
