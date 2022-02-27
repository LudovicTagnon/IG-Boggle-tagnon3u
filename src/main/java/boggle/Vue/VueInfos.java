package boggle.Vue;

import boggle.Boggle;
import boggle.Observateur;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueInfos extends TilePane implements Observateur {


    protected Label Score, Mot;
    protected Boggle bog;

    public VueInfos(Boggle boggle){

        this.bog = boggle;
        this.Mot = new Label("");
        this.Score = new Label("0");
        this.bog.ajouterObservateur(this);
        this.getChildren().addAll(this.Mot, this.Score);
        this.setAlignment(Pos.CENTER);
    }

    @Override
    public void reagir() {
        this.Mot.setText("Mot: " + this.bog.getMotChoisi());
        this.Score.setText("Score: " + this.bog.getScore());
    }
}
