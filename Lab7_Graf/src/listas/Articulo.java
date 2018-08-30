package listas;

public class Articulo {
    private int cantidad;
    private int precio;
    private String nombre;
    private Boolean completado;
    public Articulo (String nombre, int cantidad, int precio){
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.completado = false;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
