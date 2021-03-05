public class Konto {

    private Kunde inhaber;
    private  double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kontoStand, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kontoStand = kontoStand;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    protected void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }
    public void einzahlen(double betrag) throws BetragNichtKorrektException {
        if (betrag > 0) {
            this.kontoStand = kontoStand + betrag;
        } else {
            throw new BetragNichtKorrektException();
        }
    }
    public void auszahlen (double betrag) throws KreditLimitUeberschreibenException {
        if (kontoStand + kreditLimit >= betrag) {
            kontoStand = kontoStand - betrag;
        } else {
            throw new KreditLimitUeberschreibenException();
        }
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber=" + inhaber +
                ", kontoStand=" + kontoStand +
                ", kreditLimit=" + kreditLimit +
                ", zinsGuthaben=" + zinsGuthaben +
                '}';
    }
}
