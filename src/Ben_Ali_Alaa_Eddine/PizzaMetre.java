package Ben_Ali_Alaa_Eddine;

public class PizzaMetre extends Pizza {
    private double taille;

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public PizzaMetre(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle, int qte, String type, String catégorie, double taille) {
        super(numRecette, tabCommande, nbreRecette, numCommande, tabArticle, nbrArticle, qte, type, catégorie);
        this.taille = taille;
    }

    @Override
    public double calculerPrix() {
        if(getType().equals("Margherita"))
            return 30;
        if(getType().equals("Neptune"))
            return 30;
        if(getType().equals("Marina"))
            return 30;
        return 40;
    }

    public double calculerPrixMetre (int com){
        double taille=com/100;
        return calculerPrix()*taille;
    }

    @Override
    public String toString() {
        return super.toString()+"PizzaMetre du taille=" + taille;
    }
}
