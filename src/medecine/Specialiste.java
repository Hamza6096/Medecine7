package medecine;

public class Specialiste extends Medecin{

    public Specialiste() {
    }

    public Specialiste(String prenom) {
        this.prenom = prenom;
        System.out.println(prenom + " est un specialiste");
    }

    @Override
    public void recevoir(Patient patient) {
        this.patient = patient;
        this.consultations.add(new ConsultationLibre(patient));
        System.out.println(this.prenom + " reçoit " + patient.prenom + " en consultation.");
    }

    public void demanderPaiement(int tarif) {
        this.tarif = tarif; // Pour Patient.payer()
        ((ConsultationLibre) this.consultations.get(this.consultations.size() - 1)).tarif = tarif;
        super.demanderPaiement();
    }
}
