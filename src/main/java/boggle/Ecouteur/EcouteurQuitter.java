package boggle.Ecouteur;

import boggle.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurQuitter implements EventHandler<ActionEvent> {

    Boggle bog;
    public EcouteurQuitter(Boggle boggle){
        this.bog = boggle;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
