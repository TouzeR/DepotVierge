package fr.iut.editeur.document;

public class Document {


    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     *
     * @param texte
     */

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String maj= texte.substring(start,end).toUpperCase();
        remplacer(start,end,maj);
    }
    public void effacer(int start,int end){
        remplacer(start,end,"");
    }

    public void clear(){
        effacer(0,texte.length());
    }

    public void inserer(int nb, String text) {
        String left=texte.substring(0,nb+1);
        String right=texte.substring(nb+1);
        texte=left+text+right;
    }
    public void description(String commande,String description){
        texte=commande+" : "+description;
    }

}
