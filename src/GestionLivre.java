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
        System.out.println("Livre ajoute : " + livre);
    }

    // Methode pour supprimer un livre par titre
    public void supprimerLivre(String titre) {
        livres.removeIf(livre -> livre.getTitre().equalsIgnoreCase(titre));
        System.out.println("Livre supprime : " + titre);
    }

    // Methode pour afficher tous les livres
    public void listerLivres() {
        System.out.println("Livres : " + livres);
        for (Livre livre : livres) {
            System.out.println(livre);
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
                System.out.println("Livre modifie : " + livre);
                break;
            }
        }
        if (!trouve) {
            System.out.println("Livre n'existe pas");
        }
    }


}
