import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;

    // Constructeur
    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom));
    }
}
