package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import listas.Lista;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;

public class Controller {

    @FXML
    TableView<Lista> tablaListas;

    @FXML
    TableColumn colNombre;

    @FXML
    TableColumn colFecha;

    @FXML
    TableColumn colPendientes;

    @FXML
    TableColumn colEstimado;

    ObservableList<Lista> lista = FXCollections.observableArrayList();

    public void agregarLista(ActionEvent event){

        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("nuevaLista.fxml"));
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
    public void editar(ActionEvent event){

    }

    public void eliminarLista (ActionEvent event){

    }
}
