package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        boolean check=description();
        if (!check) {
            this.document.clear();
            super.executer();
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "efface la totalité du texte du document";
    }

}
