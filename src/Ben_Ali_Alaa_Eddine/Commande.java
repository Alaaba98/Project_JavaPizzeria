package Ben_Ali_Alaa_Eddine;

public class Commande extends Recette{
    private int numCommande;
    private Article [] tabArticle;
    private int nbrArticle;

    public Commande(int numRecette, Commande[] tabCommande, int nbreRecette, int numCommande, Article[] tabArticle, int nbrArticle) {
        super(numRecette, tabCommande, nbreRecette);
        this.numCommande = numCommande;
        this.tabArticle = tabArticle;
        this.nbrArticle = nbrArticle;
    }

    public void ajouter(Article article){
        if(tabArticle.length>nbrArticle){
            tabArticle[nbrArticle++]=article;
        }
    }

    public void ajouter(Article article,int qte){
        if(tabArticle.length>nbrArticle){
            tabArticle[nbrArticle]=article;
            tabArticle[nbrArticle++].setQte(qte);
        }
    }

    public double prixCommande(){
        int totalprix=0;
        for (int i=0;i<tabArticle.length;i++){
            totalprix+=tabArticle[i].calculerPrix()*tabArticle[i].getQte();
        }
        return totalprix;
    }

    public double calculerOffre1 (){
        return prixCommande()-(prixCommande()*0.03);
    }

    public double calculerOffre2 (){
        return prixCommande()-6;
    }

    public double calculerOffre3 (){
        int moinsChère=0;
        for (int i=1;i<tabArticle.length;i++){
            if(tabArticle[i] instanceof Pizza && tabArticle[i].calculerPrix()>tabArticle[i-1].calculerPrix())
                moinsChère=i;
        }

        return prixCommande()-(tabArticle[moinsChère].calculerPrix());
    }

    public double calculerReduction() {
        double prixReduction = 0, pizzatotal = prixCommande();
        int deuxPizza = 0, pizzaMetre = 0;
        double offre1=0,offre2=0,offre3=0;
        for (int i = 0; i < tabArticle.length; i++) {
            if (tabArticle[i] instanceof Pizza) {
                if (((PizzaStandard)tabArticle[i]).getType().equals("BigOne") && ((Pizza)tabArticle[i]).getCatégorie().equals("Marina")) {
                    deuxPizza++;
                    pizzatotal++;
                }
                if (tabArticle[i] instanceof Pizza && ((PizzaMetre)tabArticle[i]).getType().equals("PizzaMetre"))
                    pizzaMetre++;

            }
        }

        if (prixCommande()>40)
            offre1=calculerOffre1();

        if(deuxPizza>1)
            offre2=calculerOffre2();

        if (pizzaMetre>0 && pizzatotal>0)
            offre3=calculerOffre3();


        if (offre1!=0)
            if (offre2!=0 && offre2<offre1)
                prixReduction=offre1;
        else if (offre2!=0)
            prixReduction=offre2;

        if (offre3!=0 && offre3<prixReduction)
            prixReduction=offre3;


        return prixReduction;
    }


    public double prixFinalCommande(){
        return prixCommande()-(prixCommande()-calculerReduction());
    }

    public double calculerPrix(int qtecom){
        if (this instanceof PizzaStandard ) {
            return ((PizzaStandard)this).calculerPrix100g(qtecom);
        }
        if (this instanceof PizzaPoids ) {
            return ((PizzaPoids)this).calculerPrix100g(qtecom);
        }
        return ((PizzaMetre)this).calculerPrixMetre(qtecom);
    }
}
