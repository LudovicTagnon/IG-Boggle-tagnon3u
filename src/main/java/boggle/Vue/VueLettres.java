package boggle.Vue;

import boggle.Boggle;
import boggle.Ecouteur.EcouteurEffacer;
import boggle.Ecouteur.EcouteurLettre;
import boggle.Observateur;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class VueLettres extends GridPane implements Observateur {

    protected ArrayList<Button> Lettres;
    protected Boggle bog;

    public VueLettres(Boggle boggle){
        this.bog = boggle;

        this.Lettres = new ArrayList<>(this.bog.getTaille());



        for(int j=0; j < bog.getTaille() ; j++){
            for(int i=0; i < bog.getTaille(); i++){
                this.Lettres.add(new Button(this.bog.getLettre(j,i) + ""));
                this.Lettres.get(this.Lettres.size() - 1).setOnAction(new EcouteurLettre(this.bog));
                this.Lettres.get(this.Lettres.size() - 1).setMinHeight(50);
                this.Lettres.get(this.Lettres.size() - 1).setMinWidth(50);
                this.add(this.Lettres.get(this.Lettres.size() - 1),i,j);
            }
        }

        this.setAlignment(Pos.CENTER);

        this.bog.ajouterObservateur(this);

    }

    @Override
    public void reagir(){
    }

}
