package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        boolean check=description();
        if (!check) {
            if (parameters.length < 2) {
                System.err.println("Format attendu : Inserer;depart;fin;chaine");
                return;
            }
            int debut = Integer.parseInt(parameters[1]);
            String fin = parameters[2];
            this.document.inserer(debut, fin);
            super.executer();
        }

    }

    @Override
    public String getDescriptionCommande() {
        return "insére un texte ";
    }
}
