public class Kunde extends Person {
    private Mitarbeiter mitarbeiter;

    public Kunde(Mitarbeiter mitarbeiter, String vorname, String nachname, Adresse adresse) {
        super(adresse, vorname, nachname);
        this.mitarbeiter = mitarbeiter;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "mitarbeiter=" + mitarbeiter +
                '}';
    }
}
