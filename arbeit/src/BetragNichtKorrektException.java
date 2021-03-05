public class BetragNichtKorrektException extends Exception {

    public BetragNichtKorrektException() {

    }

    @Override
    public String toString() {
        return "Der eingegebene Betrag ist nicht korrekt";
    }
}
