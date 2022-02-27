package boggle.Ecouteur;

import boggle.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurValider implements EventHandler<ActionEvent> {
    Boggle bog;
    public EcouteurValider(Boggle boggle){
        this.bog = boggle;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        this.bog.valider();
    }
}
