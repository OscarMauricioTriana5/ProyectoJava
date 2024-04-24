package TallerPoo.Ejercicio7a15;
/*7.a.15.Ejercicio Vestido para rebajas.
Crear la Clase Vestido: tiene estos atributos (todos privados)
- String nombre
- int talla
- String marca
- double precio
- boolean temporadaRebajas (indica si estamos en rebajas o no)
- int unidadesEnAlmacen (numero de unidades de ese vestido que hay en el almacén) */

public class Vestido {

    private String nombre;
    private int talla;
    private String marca;
    private double precio = 0;
    private boolean temporadaRebajas = true;
    private int unidadesEnAlmacen;

    /*
     * Métodos a escribir:
     * - constructor con todos los atributos
     * - constructor con todos los atributos menos precio, que por defecto es 0
     * - constructor vacío
     * - getters y setters, de todo menos setter de temporadaRebajas y de
     * unidadesEnAlmacen
     */

    public Vestido() {
    }

    public Vestido(String nombre, int talla, String marca, double precio, boolean temporadaRebajas,
            int unidadesEnAlmacen) {
        this.nombre = nombre;
        this.talla = talla;
        this.marca = marca;
        this.precio = precio;
        this.temporadaRebajas = temporadaRebajas;
        this.unidadesEnAlmacen = unidadesEnAlmacen;
    }

    public Vestido(String nombre, int talla, String marca, boolean temporadaRebajas, int unidadesEnAlmacen) {
        this.nombre = nombre;
        this.talla = talla;
        this.marca = marca;
        this.temporadaRebajas = temporadaRebajas;
        this.unidadesEnAlmacen = unidadesEnAlmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTalla() {
        return talla;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isTemporadaRebajas() {
        return temporadaRebajas;
    }

    public int getUnidadesEnAlmacen() {
        return unidadesEnAlmacen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void cambiarTemporada() {
        temporadaRebajas = !temporadaRebajas;
        if (temporadaRebajas) {
            precio *= 0.6; // Precio baja al 40% en rebajas
        } else {
            precio /= 0.6; // Precio vuelve al original al acabar las rebajas
        }
    }

    public double precioEnRebajas() {
        return temporadaRebajas ? precio : precio * 0.6;
    }

    public boolean retirarUnidades(int unidades) {
        if (unidadesEnAlmacen >= unidades) {
            unidadesEnAlmacen -= unidades;
            return true;
        }
        return false;
    }

    public double importeEnAlmacen() {
        return unidadesEnAlmacen * precioEnRebajas();
    }

    public double importeEnAlmacen(boolean estandoEnRebajas) {
        return unidadesEnAlmacen * (estandoEnRebajas ? precio : precio * 0.6);
    }

    public void aumentarPrecio(int porcentaje) {
        precio *= (1 + (porcentaje / 100.0));
    }

    @Override
    public String toString() {
        return "Vestido{" +
                "nombre='" + nombre + '\'' +
                ", talla=" + talla +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", temporadaRebajas=" + temporadaRebajas +
                ", unidadesEnAlmacen=" + unidadesEnAlmacen +
                '}';
    }
}
