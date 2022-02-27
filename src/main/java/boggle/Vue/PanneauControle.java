package boggle.Vue;

import boggle.Boggle;
import boggle.Ecouteur.EcouteurEffacer;
import boggle.Ecouteur.EcouteurValider;
import boggle.Observateur;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PanneauControle extends VBox implements Observateur {

    protected Button valider, effacer, quitter;

    protected Boggle bog;

    public PanneauControle(Boggle boggle){
        super();
        this.bog = boggle;

        this.valider = new Button("valider");
        this.effacer = new Button("effacer");
        this.quitter = new Button("quitter");

        this.quitter.setOnAction(event -> Platform.exit());
        this.valider.setOnAction(new EcouteurValider(boggle));

        this.effacer.setOnAction(new EcouteurEffacer(boggle));

        this.getChildren().addAll(this.valider, this.effacer, this.quitter);

        this.bog.ajouterObservateur(this);
    }

    @Override
    public void reagir(){

    }
}
