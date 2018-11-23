package Ben_Ali_Alaa_Eddine;
import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Menu menu=new Menu();
        int choixMenu=0;
        Scanner sc = new Scanner(System.in);


        while (choixMenu!=7) {
            //Affichage du Menu Principal
            System.out.println(menu.menuPrincipal());
            choixMenu = sc.nextInt();


            switch (choixMenu){
                case 1: {
                    int choixCommande=0;
                    while (choixCommande!=4) {
                        //Affichage le Sous Menu
                        System.out.println(menu.sousMenu());
                    choixCommande = sc.nextInt();
                        switch (choixCommande) {
                            case 1: {
                                // Affichage le Pizza Menu si le client à choisi Menu Pizza
                                System.out.println(menu.pizzaMenu());
                                int choixPizza =sc.nextInt();
                                String choixCate="";
                                int poids=0,taile=0,qteCom=0;
                                switch (choixPizza){
                                    case 1:{
                                        //Affichage le catégorie et son prix pizza Metre
                                        System.out.println(menu.pizzaCategrie());
                                        System.out.println(menu.prixPizzaMetre());
                                        System.out.println("Donner la catégorie de votre choix: ");
                                        choixCate=sc.nextLine();
                                        System.out.print("Donner la taille (en cm): ");
                                        taile=sc.nextInt();
                                        System.out.print("Donner la quantité commander: ");
                                        qteCom=sc.nextInt();
                                        break;
                                    }
                                    case 2:{
                                        //Affichage le catégorie et son prix
                                        System.out.println(menu.pizzaCategrie());
                                        System.out.println(menu.prixPizzaPoids());
                                        System.out.print("Donner la catégorie de votre choix: ");
                                        choixCate=sc.nextLine();
                                        System.out.print("Donner le poids (en g): ");
                                        taile=sc.nextInt();
                                        System.out.print("Donner la quantité commander: ");
                                        qteCom=sc.nextInt();
                                        break;
                                    }
                                    case 3: {
                                        choixCommande=0;
                                        // Affichage le Pizza Standard Menu si le cl1ient à choisi Menu Pizza Standard
                                        while(choixCommande<1 && choixCommande>2) {
                                            System.out.println(menu.pizzaStandMenu());
                                            choixCommande = sc.nextInt();
                                        }
                                        System.out.println(menu.pizzaCategrie());
                                        System.out.println(menu.prixPizzaPoids());
                                        System.out.print("Donner la catégorie de votre choix: ");
                                        choixCate=sc.nextLine();
                                        System.out.print("Donner la 1quantité commander: ");
                                        qteCom=sc.nextInt();
                                        break;
                                    }
                                    default:
                                        System.out.println("Aucune choix choisie,SVP choisie correctement");
                                }

                            }
                            case 2: {
                                //System.out.println();
                            }
                            case 3: {

                            }
                            case 4:{
                                System.out.println("Vous-avez retourner au Menu Principal");
                            }
                            default:
                                System.out.println("Aucune choix choisie,SVP choisie correctement");
                        }
                    }
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7: System.out.println("Au revoir !! :)");
                default:
                    System.out.println("Aucune choix choisie,SVP choisie correctement");
            }

        }

    }
}
