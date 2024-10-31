package service;

import model.Livre;

import java.util.ArrayList;

public class GestionLivre {
    private ArrayList<Livre> livres;

    // Constructeur
    public GestionLivre() {
        this.livres = new ArrayList<>();
    }

    // Methode pour ajouter un livre
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        try {
            System.out.println("model.Livre ajoute : " + livre);
        } catch (Exception e) {
            System.out.println("Erreur lors de l'ajout du livre");
        }
    }

    // Methode pour supprimer un livre par titre
    public void supprimerLivre(String titre) {
        livres.removeIf(livre -> livre.getTitre().equalsIgnoreCase(titre));
        try {
            System.out.println("model.Livre supprime : " + titre);
        } catch (Exception e) {
            System.out.println("Erreur lors de la suppression du livre");
        }
    }

    // Methode pour afficher tous les livres
    public void listerLivres() {
        System.out.println("Livres : " + livres);
        for (Livre livre : livres) {
            try {
                System.out.println(livre);
            } catch (Exception e) {
                System.out.println("Erreur lors de l'affichage des livres");
            }
        }
    }
    // Methode pour modifier un livre
    public  void modifierLivre(String titre, String nouveauTitre, String nouvelAutor, int nouvelleAnnee) {
        boolean trouve = false;
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                livre.setTitre(nouveauTitre);
                livre.setAuteur(nouvelAutor);
                livre.setAnnee(nouvelleAnnee);
                trouve = true;
                System.out.println("model.Livre modifie : " + livre);
                break;
            }
        }
        if (!trouve) {
            System.out.println("model.Livre n'existe pas");
        }
    }


}
