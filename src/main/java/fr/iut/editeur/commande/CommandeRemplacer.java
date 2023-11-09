package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        boolean check=description();
        if (!check) {
            if (parameters.length < 3) {
                System.err.println("Format attendu : remplacer;depart;fin;chaine");
                return;
            }
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);
            String texte = "";
            if (parameters.length == 4) {
                texte = parameters[3];
            }
            this.document.remplacer(debut, fin, texte);
            super.executer();
        }

    }

    @Override
    public String getDescriptionCommande() {
        return "remplace une chaine de caractères";
    }
}
