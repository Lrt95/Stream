public class Collection {
  public enum couleur {
    MARRON("marron"),
    BLEU("bleu"),
    VERT("vert"),
    VERRON("verron"),
    INCONNU("non déterminé"),
    ROUGE("rouge mais j'avais piscine...");

    private String name = "";

    couleur(String n){name = n;}
    public String toString() {return name;}
  }

  public static class personne {

    public Double taille = 0.0d, poids = 0.0d;
    public String nom = "", prenom = "";
    public couleur yeux = couleur.INCONNU;
    public personne() {	}
    public personne(double taille, double poids, String nom, String prenom, couleur yeux) {
      super();
      this.taille = taille;
      this.poids = poids;
      this.nom = nom;
      this.prenom = prenom;
      this.yeux = yeux;
    }

    public String toString() {
      String s = "Je m'appelle " + nom + " " + prenom;
      s += ", je pèse " + poids + " Kg";
      s += ", et je mesure " + taille + " cm.";
      return s;
    }
    public Double getTaille() {return taille;}
    public void setTaille(Double taille) {this.taille = taille;}
    public Double getPoids() {return poids;}
    public void setPoids(Double poids) {this.poids = poids;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public couleur getYeux() {return yeux;}
    public void setYeux(couleur yeux) {this.yeux = yeux;}
  }


}
