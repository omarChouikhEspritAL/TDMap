public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(10345678, 1, "nom1", "prenom1");
        Employe e2 = new Employe();
        Employe e3 = new Employe(12345678, 3, "nom3", "prenom3");
        Employe e4 = new Employe(1288572, 4, "nom4", "prenom4");

        SocieteHashMap hashMap = new SocieteHashMap();
        SocieteTreeMap treeMap = new SocieteTreeMap();

        Departement d1 = new Departement(1,"Departement 1");
        Departement d2 = new Departement(2,"Departement 2");
        Departement d3 = new Departement();

        hashMap.ajouterEmployeDepartement(e1, d1);
        hashMap.ajouterEmployeDepartement(e2, d1);
        hashMap.ajouterEmployeDepartement(e3, d2);
        hashMap.ajouterEmployeDepartement(e4, d3);

        System.out.println("HashMap - Employés:");
        hashMap.afficherLesEmployes();
        System.out.println("HashMap - Départements:");
        hashMap.afficherLesDepartements();
        System.out.println("HashMap - Employés et leurs départements:");
        hashMap.afficherLesEmployesLeursDepartements();
        System.out.println("Recherche de l'employé " + e3);
        hashMap.afficherDepartement(e3);
        hashMap.afficherDepartement(e3);
        System.out.println("Suppression de l'employé " + e2);
        hashMap.supprimerEmploye(e2);
        System.out.println("Après suppression HashMap - Employés et leurs départements:");
        hashMap.afficherLesEmployesLeursDepartements();


        treeMap.ajouterEmployeDepartement(e1, d1);
        treeMap.ajouterEmployeDepartement(e2, d1);
        treeMap.ajouterEmployeDepartement(e3, d2);
        treeMap.ajouterEmployeDepartement(e4, d3);

        System.out.println("TreeMap - Employés:");
        treeMap.afficherLesEmployes();
        System.out.println("TreeMap - Départements:");
        treeMap.afficherLesDepartements();
        System.out.println("TreeMap - Employés et leurs départements:");
        treeMap.afficherLesEmployesLeursDepartements();
        System.out.println("Suppression de l'employé " + e2);
        treeMap.supprimerEmploye(e2);
        System.out.println("Après suppression TreeMap - Employés et leurs départements:");
        treeMap.afficherLesEmployesLeursDepartements();

    }
}
