public class programm {

    public static void main(String[] args) {
        Adresse adresseKunde = new Adresse("Zwischen Dorpen", "41", "28259", "Bremen");
        Adresse adresseMit = new Adresse("Delfter Straße", "10", "28259", "Bremen");
        Mitarbeiter mitarbeiter = new Mitarbeiter("Frag","Nicht",adresseMit);
        Kunde kunde = new Kunde(mitarbeiter,"Sarangan","EL SICARIO",adresseKunde);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        System.out.println("[Hallo]");
        System.out.println(kunde.toString());
        //System.out.println(adresseKunde);
        System.out.println(mitarbeiter.toString());
        //  System.out.println(adresseMit);

    }
}
