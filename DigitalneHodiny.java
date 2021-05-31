package rok2.sprint9.Hodiny;

public class DigitalneHodiny extends  Hodiny {

    private String prevedCisloNaRetazec(int cislo){
        if (String.valueOf(cislo).length()<2) return "0"+cislo;
        return String.valueOf(cislo);
    }

    @Override
    public void zobrazHodiny() {
        System.out.print(prevedCisloNaRetazec(hodiny)+":");
        System.out.print(prevedCisloNaRetazec(minuty)+":");
        System.out.println(prevedCisloNaRetazec(sekundy));
    }
}
