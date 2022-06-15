package medecine;

public class Generaliste extends Medecin{
    public Generaliste() {
    }

    public Generaliste(String prenom, int tarif) {
        this.prenom = prenom;
        this.tarif = tarif;
//        Greg est un generaliste (tarif: 30�)
        System.out.println(prenom + " est un generaliste (tarif: " + tarif + ")");
    }
    public void envoyerPatient(Specialiste specialiste) {
        System.out.println(this.prenom + " envoyer patient " + specialiste.prenom);
    }

    public void recevoir(Patient patient) {

        this.patient = patient;
        this.consultations.add(new Consultation(patient));
        //Greg reçoit Gilles en consultation
        System.out.println(this.prenom + " recoit " + patient.prenom + " en consultation.");

    }

    public void prescrire(Medicament... medicaments) {
        this.consultations.get(this.consultations.size() - 1).medicaments = medicaments;
        System.out.println(this.prenom + " prescrit " + Medicament.lister(medicaments, false) + " a " + this.patient.prenom);
    }

    public void demanderPaiement() {
        System.out.println(this.prenom + " demande " + this.tarif + "€ a " + this.patient.prenom);
    }
}
