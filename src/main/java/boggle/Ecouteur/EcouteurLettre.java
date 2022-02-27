package boggle.Ecouteur;

import boggle.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class EcouteurLettre implements EventHandler<ActionEvent> {

    int lig;
    int col;
    Boggle bog;

    public EcouteurLettre(Boggle boggle){
        this.bog = boggle;
    }

    @Override
    public void handle(ActionEvent ae) {
        Button boutton = (Button) ae.getSource();
        this.bog.ajouterLettre(GridPane.getRowIndex(boutton), GridPane.getColumnIndex(boutton));
    }
}
