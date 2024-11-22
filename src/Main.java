public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Mehdi", "Ali", "Informatique", 3);
        Employe e2 = new Employe(2, "Salma", "Ben Ahmed", "Finance", 2);
        Employe e3 = new Employe(3, "Omar", "Jlassi", "Informatique", 5);

        // Ajouter des employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Afficher les employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Rechercher un employé par nom
        System.out.println("\nRechercher 'Salma' : " + societe.rechercherEmploye("Salma"));

        // Trier par ID
        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Trier par Nom Département et Grade
        System.out.println("\nTri par Nom Département et Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Supprimer un employé
        societe.supprimerEmploye(e2);
        System.out.println("\nListe des employés après suppression :");
        societe.displayEmploye();
    }
}
