package Ben_Ali_Alaa_Eddine;

public abstract class Article extends Commande  {
    private int qte;

    public Article(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle, int qte) {
        super(numRecette, tabCommande, nbreRecette, numCommande, tabArticle, nbrArticle);
        this.qte = qte;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public abstract String toString();

    public abstract double calculerPrix();
}
