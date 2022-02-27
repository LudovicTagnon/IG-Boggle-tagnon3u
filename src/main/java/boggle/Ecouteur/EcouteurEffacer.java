package boggle.Ecouteur;

import boggle.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurEffacer implements EventHandler<ActionEvent> {

    protected Boggle bog;

    public EcouteurEffacer(Boggle boggle){
        this.bog = boggle;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.bog.effacer();
    }
}
