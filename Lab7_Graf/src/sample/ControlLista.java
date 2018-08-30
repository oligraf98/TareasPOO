package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import listas.Articulo;
import listas.Lista;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;

public class ControlLista {
    @FXML
    TableView<Articulo>  tablaArticulo;

    @FXML
    TableColumn colArticulo;

    @FXML
    TableColumn colCantidad;

    @FXML
    TableColumn colUnitario;
    @FXML
    TableColumn colEstado;

    @FXML
    TableColumn colTotal;


    public void regresar2 (ActionEvent event){

    }

    public void agregarArticulo (ActionEvent event){
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("articulo.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Crear nueva lista");
            stage.setScene(new Scene(root, 450, 450));




            // Muestra la ventana
            stage.show();
            // Hide this current window (if this is what you want)


            // ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void pendiente (ActionEvent event){

    }
    public void completado (ActionEvent event){

    }
}

