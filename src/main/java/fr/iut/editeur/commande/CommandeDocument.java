package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import java.util.Objects;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;



    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }

    public boolean description(){
        if (Objects.equals(parameters[1], "description")){
            System.out.println(this.getDescriptionCommande());
            return true;
        }
        return false;
    }


}
