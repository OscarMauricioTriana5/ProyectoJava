package TallerPoo.Ejerciciob4;

/*Crear clase Fruta. Atributos String nombre, short precio. Hacer un constructor copia (que valga para crear
una Fruta recibiendo como parámetro otra Fruta) y un método Fruta copiar(), que devuelve un
duplicado del Fruta actual. Ambas son duplicados, no copias, esto es, las copias han de ser "profundas"
(deep copy). Probar todos los métodos
 */

public class Fruta {
    private String nombre;
    private short precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getPrecio() {
        return precio;
    }

    public void setPrecio(short precio) {
        this.precio = precio;
    }

    public Fruta(String nombre, short precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Fruta(Fruta otraFruta) {
        this.nombre = otraFruta.nombre;
        this.precio = otraFruta.precio;

    }

    public Fruta copia() {
        return new Fruta(this);
    }

    @Override
    public String toString() {
        return "Fruta [nombre=" + nombre + ", precio=" + precio + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Fruta fruta = (Fruta) obj;
        return precio == fruta.precio && nombre.equals(fruta.nombre);
    }
}