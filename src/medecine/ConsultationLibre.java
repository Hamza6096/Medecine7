package medecine;

public class ConsultationLibre extends Consultation{

    int tarif;

    public ConsultationLibre() {
    }

    public ConsultationLibre(Patient patient) {
        super(patient);
    }


    @Override
    public String toString() {
        return super.toString() + "\t\tTarif: " + this.tarif+ System.lineSeparator();
    }
}
