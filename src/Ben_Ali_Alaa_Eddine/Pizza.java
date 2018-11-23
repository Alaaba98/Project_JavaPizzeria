package Ben_Ali_Alaa_Eddine;

public class Pizza extends Article{
    private String type;
    private String catégorie;

    public String getCatégorie() {
        return catégorie;
    }

    public String getType() {
        return type;
    }

    public Pizza(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle, int qte, String type, String catégorie) {
        super(numRecette, tabCommande, nbreRecette, numCommande, tabArticle, nbrArticle, qte);
        this.type = type;
        this.catégorie = catégorie;
    }

    @Override
    public java.lang.String toString() {
        return "Pizza='" + type + "', catégorie='"+catégorie+"'";
    }

    @Override
    public double calculerPrix() {
        return 0;
    }
}
