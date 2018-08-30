package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import listas.Lista;

public class ControlNuevaLista {

    @FXML
    public TextField nombre;
    @FXML
    public TextField descripcion;

    public Lista crearLista(ActionEvent event){
        if(nombre.getText() != null ) {
            Lista lista = new Lista(nombre.getText(), descripcion.getText());
            return lista;
        }else{
            System.out.println("Debe elejir un nombre para la lista.");
        }
            return null;
    }

    public void regresar(ActionEvent event){

    }
}
