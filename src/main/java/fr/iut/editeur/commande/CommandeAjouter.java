package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {


    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        boolean check=description();
        if (!check) {
            if (parameters.length < 2) {
                System.err.println("Format attendu : ajouter;texte");
                return;
            }
            String texte = parameters[1];
            this.document.ajouter(texte);
            super.executer();
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "ajouter un texte dans le document";
    }

}
