import java.util.Comparator;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{
    TreeMap<Employe,Departement> treeMap = new TreeMap<>(new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return Integer.compare(o1.getMatricule(),o2.getMatricule());
        }
    });
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        treeMap.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        treeMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(treeMap.entrySet());
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(treeMap.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(treeMap.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
        if(rechercherEmploye(e)){
            System.out.println(treeMap.get(e));
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return treeMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return treeMap.containsValue(d);
    }
}
