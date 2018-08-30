package listas;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.util.ArrayList;

public class Lista {
    private SimpleStringProperty nombre;
    private SimpleStringProperty descripcion;
    private SimpleStringProperty fecha;
    private SimpleListProperty<Articulo> lista;

    public Lista(String nombre, String descripcion){
        this.nombre.set(nombre);
        this.descripcion.set(descripcion);

    }

    public String getDescripcion() {
        return descripcion.get();
    }

    public SimpleStringProperty descripcionProperty() {
        return descripcion;
    }

    public String getFecha() {
        return fecha.get();
    }

    public SimpleStringProperty fechaProperty() {
        return fecha;
    }

    public ObservableList<Articulo> getLista() {
        return lista.get();
    }

    public SimpleListProperty<Articulo> listaProperty() {
        return lista;
    }
    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }
}
