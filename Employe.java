public class Employe {
    private int cin;
    private int matricule;
    private String nom;
    private String prenom;
    public Employe(){}

    public Employe(int cin, int matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +"cin=" + cin +", matricule=" + matricule +
                ", nom='" + nom + ", prenom=" + prenom + "}\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        if (((Employe) obj).cin==this.cin && ((Employe) obj).matricule==this.matricule) return true;
        return false;
    }
    @Override
    public int hashCode() {
        return cin+matricule;
    }
}
