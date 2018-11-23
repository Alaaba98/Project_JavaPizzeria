package Ben_Ali_Alaa_Eddine;
import java.io.IOException;

public class Menu {


    public String menuPrincipal(){
        return "\f\t \t \tBiencenue à notre Pizzeria ! ^_^" +
                "\n1-Ajouter une Commmande" +
                "\n2-Afficher Commandes" +
                "\n3-Total Ventes" +
                "\n4-Montant moyen Commandes" +
                "\n5-Catégorie pizza la plus vendue (Standard, au poids ou au métre" +
                "\n6-Pourcentage Vente Canettes" +
                "\n7-Quittez";
    }


    public String sousMenu(){
        return "\f\n1. Ajouter Pizza" +
                "\n2. Ajouter Boisson" +
                "\n3. Confirmer Commande" +
                "\n4. Menu principal";
    }


    public String pizzaMenu(){
        return "\f\n1. Pizza au Mètre" +
                "\n2. Pizza au Poids" +
                "\n3. Pizza Standard";
    }


    public String pizzaCategrie(){
        return "\f1.Margherita\t|\t 2.Neptune\t|\t3.Marina\t|\t4.Autre: Reine, Chef,CowBoy ...";
    }





    public String prixPizzaMetre(){
        return "\t30 Dt\t\t|\t\t37.5 Dt\t|\t\t46 Dt\t|\t\t40 Dt";
    }



    public String prixPizzaPoids(){
        return "\t1.6 Dt\t\t|\t\t2.2 Dt\t|\t\t2.7 Dt\t|\t\t2.5 Dt";
    }





    public String pizzaStandMenu(){
        return "\f\n1. Junior" +
                "\n2. Junior";
    }

    public String prixPizzaJunior(){
        return "\t6 Dt\t\t|\t\t8 Dt\t|\t\t10.5 Dt\t|\t\t9 Dt";
    }

    public String prixPizzaBigOne(){
        return "\t13 Dt\t\t|\t\t18.5 Dt\t|\t\t21 Dt\t|\t\t19.5 Dt";
    }
}
