public class Departement {
    private int id;
    private String nom;
    public Departement(){}
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +"id=" + id +", nom='" + nom +"}\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        if (((Departement) obj).id==this.id && ((Departement) obj).nom == this.nom) return true;
        return false;
    }
}
