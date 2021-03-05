public class KreditLimitUeberschreibenException extends Exception{

    public KreditLimitUeberschreibenException() {

    }

    @Override
    public String toString() {
        return "Das Kreditlimit wurde überschritten";
    }
}
