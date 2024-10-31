public class Livre {

    // Declaration des proprietes
    private  String titre;
    private  String auteur;
    private  int annee;

    // Constructeur
    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthode pour afficher les informations du livre
    public String toString() {
        return "Titre : " + titre + ", Auteur : " + auteur + ", Année : " + annee;
    }
}
