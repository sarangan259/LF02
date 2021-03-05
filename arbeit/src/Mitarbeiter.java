public class Mitarbeiter extends Person {

    public Mitarbeiter(String vorname, String nachname, Adresse adresse) {
        super(adresse, nachname, vorname);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
