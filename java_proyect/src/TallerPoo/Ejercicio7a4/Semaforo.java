package TallerPoo.Ejercicio7a4;

public class Semaforo {

    private String color;

    public Semaforo(String color) {
        this.color = color;

    }

    public void cambio() {
        if (color.equals("rojo")) {
            color = "amarillo";
        } else if (color.equals("amarillo")) {
            color = "verde";
        } else if (color.equals("verde")) {
            color = "rojo";
        }
        System.out.println("El color es: " + color);
    }

    public String getColor() {
        return color;
    }

}
