public class Sparkonto extends Konto {

    public Sparkonto(Kunde inhaber, double kontostand, double kreditlimit, double zinssatz) {
        super(inhaber, kontostand, 0, zinssatz);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
