package rok2.sprint9.Hodiny;

public abstract class Hodiny {
    protected int hodiny, minuty, sekundy;

    public void setHodiny(int hodiny) {
        this.hodiny = hodiny;
    }

    public void setMinuty(int minuty) {
        this.minuty = minuty;
    }

    public void setSekundy(int sekundy) {
        this.sekundy = sekundy;
    }

    public abstract void zobrazHodiny();
}
