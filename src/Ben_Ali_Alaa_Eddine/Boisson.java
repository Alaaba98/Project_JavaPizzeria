package Ben_Ali_Alaa_Eddine;

public class Boisson extends Article {
    private String nature;
    private String format;

    public Boisson(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle, int qte, String nature) {
        super(numRecette, tabCommande, nbreRecette, numCommande, tabArticle, nbrArticle, qte);
        this.nature = nature;
    }

    @Override
    public double calculerPrix() {
        if(nature.equals("Eau")) {
            if (format.equals("0.5l"))
                return 1;
                return 2.5;
        }
        if (format.equals("0.5l"))
            return 1.5;
        if (format.equals("1.5l"))
            return 3.5;
        return 2.8;
    }

    @Override
    public String toString() {
        return "Boisson{" +"nature boisson='" + nature + "', format='" + format +"'}";
    }
}
