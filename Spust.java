package rok2.sprint9.Hodiny;

public class Spust {
    public static void main(String[] args) {
        Hodiny[] hodiny = new Hodiny[3];
        hodiny[0] = new AnalogoveHodiny();
        hodiny[1] = new DigitalneHodiny();
        hodiny[2] = new AnglickeHodiny();

        NastavCas cas = new NastavCas();
        for (int i = 0; i < 3; i++) {
            cas.nastavAZobrazHodiny(hodiny[i]);
        }
    }
}
