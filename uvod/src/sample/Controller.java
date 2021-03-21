package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField f1,f2;
    public void Submit(ActionEvent actionEvent) {

        System.out.println("Korisnik "+ f1.getText() + " " +f2.getText() + " prijavljen/a.");

    }
}
