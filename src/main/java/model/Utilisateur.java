package model;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private String mot_de_passe;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public String getNom(){
        return nom;

    }

    public Utilisateur(String nom, String prenom, String email, String mot_de_passe) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
    }

  public String tostring(){
        return "Nom :"+this.nom+"\n"+
        "prenom :"+this.prenom+"\n"+
        "email :"+this.email+"\n"+
        "mot_de_passe :"+this.mot_de_passe+"\n";
  }

}
