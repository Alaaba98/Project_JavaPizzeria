package Ben_Ali_Alaa_Eddine;

public class PizzaPoids extends Pizza {
    private double poids;


    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public PizzaPoids(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle, int qte, String type, String catégorie, double poids) {
        super(numRecette, tabCommande, nbreRecette, numCommande, tabArticle, nbrArticle, qte, type, catégorie);
        this.poids = poids;
    }

    @Override
    public double calculerPrix() {
        if(getType().equals("Margherita"))
            return 1.6;
        if(getType().equals("Neptune"))
            return 2.2;
        if(getType().equals("Marina"))
            return 2.7;
        return 2.5;
    }

    public double calculerPrix100g (int com){
        double poid=com/100;
        return calculerPrix()*poid;
    }

    @Override
    public String toString() {
        return super.toString()+", poids=" + poids;
    }
}
