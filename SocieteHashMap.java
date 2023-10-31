import java.util.HashMap;

public class SocieteHashMap implements InterfaceSociete{
    HashMap<Employe,Departement>hashMap = new HashMap();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hashMap.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        hashMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(hashMap.entrySet());
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(hashMap.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(hashMap.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
        if (rechercherEmploye(e)){
            System.out.println(hashMap.get(e));
        }else {
            System.out.println("employe does not exist !!");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return hashMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return hashMap.containsValue(d);
    }
}
