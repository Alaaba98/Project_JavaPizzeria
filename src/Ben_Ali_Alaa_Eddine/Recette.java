package Ben_Ali_Alaa_Eddine;

public class Recette {
    private int numRecette;
    private Commande [] tabCommande;
    private int nbreRecette;

    public Recette(int numRecette, Commande[] tabCommande, int nbreRecette) {
        this.numRecette = ++numRecette;
        this.tabCommande =new Commande[nbreRecette];
        this.nbreRecette = nbreRecette;
    }

    public void ajouterCommande(){

    }
}
