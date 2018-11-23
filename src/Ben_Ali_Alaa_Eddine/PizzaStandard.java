package Ben_Ali_Alaa_Eddine;

public abstract class PizzaStandard extends Pizza{
    private String nomPizza;
    private double poids;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public PizzaStandard(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle, int qte, String type, String catégorie, String nomPizza, double poids) {
        super(numRecette, tabCommande, nbreRecette, numCommande, tabArticle, nbrArticle, qte, type, catégorie);
        this.nomPizza = nomPizza;
        this.poids = poids;
    }

    @Override
    public double calculerPrix() {
        if (nomPizza.equals("Junior")) {
            if (getType().equals("Margherita"))
                return 1.6;
            else if (getType().equals("Neptune"))
                return 2.2;
            else if (getType().equals("Marina"))
                return 2.7;

            return 2.5;
        }
        else{
            if (getType().equals("Margherita"))
                return 13;
            else if (getType().equals("Neptune"))
                return 18.5;
            else if (getType().equals("Marina"))
                return 21;

            return 19.5;
        }
    }

    public double calculerPrix100g (int qtecom){
        double poid=qtecom/100;
        return calculerPrix()*poid;
    }

    @Override
    public String toString() {
        return super.toString()+", poids=" + poids;
    }
}
