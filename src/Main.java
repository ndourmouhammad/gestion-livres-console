import model.Livre;
import service.GestionLivre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestionLivre gestionLivre = new GestionLivre();
        Scanner scanner = new Scanner(System.in);

        int choix;

        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    gestionLivre.listerLivres();
                    break;

                case 2:
                    System.out.print("Entrer le titre du livre ");
                    String titre = scanner.nextLine();

                    System.out.print("Entrer l'auteur du livre ");
                    String auteur = scanner.nextLine();

                    System.out.print("Entrer l'annee de publication du livre ");
                    int annee = scanner.nextInt();
                    scanner.nextLine();

                    Livre nouveauLivre = new Livre(titre, auteur, annee);
                    gestionLivre.ajouterLivre(nouveauLivre);
                    System.out.println("model.Livre ajoute avec succes.");
                    break;

                case 3:
                    System.out.print("Entrer le titre du livre a modifier ");
                    String titreModifier = scanner.nextLine();
                    System.out.print("Entrer le nouveau titre ");
                    String nouveauTitre = scanner.nextLine();
                    System.out.print("Entrer le nouvel auteur ");
                    String nouvelAuteur = scanner.nextLine();
                    System.out.print("Entrer le nouvelle annee ");
                    int nouvelleAnnee = scanner.nextInt();
                    scanner.nextLine();
                    gestionLivre.modifierLivre(titreModifier, nouveauTitre, nouvelAuteur, nouvelleAnnee);
                    System.out.println("model.Livre modifie avec succes.");
                    break;

                case 4:
                    System.out.print("Entrer le titre du livre a supprimer ");
                    String titreASupp = scanner.nextLine();
                    gestionLivre.supprimerLivre(titreASupp);
                    System.out.println("model.Livre supprime avec succes.");
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Vous n'avez pas le choix !");
                    break;
            }

        } while (choix != 5);
        scanner.close();
    }
    public static void afficherMenu() {
        System.out.println("\n=== Menu de Gestion des Livres ===");
        System.out.println("1 - Lister les livres");
        System.out.println("2 - Ajouter un livre");
        System.out.println("3 - Modifier un livre");
        System.out.println("4 - Supprimer un livre");
        System.out.println("5 - Quitter");
        System.out.print("Votre choix : ");
    }
}