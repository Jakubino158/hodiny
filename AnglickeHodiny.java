package rok2.sprint9.Hodiny;

public class AnglickeHodiny extends Hodiny{

    private String prevedCisloNaRetazec(int cislo){
        if (String.valueOf(cislo).length()<2) return "0"+cislo;
        return String.valueOf(cislo);
    }

    private String prevedHodinyNaRetazec(){
        return prevedCisloNaRetazec(hodiny%12)+":"+prevedCisloNaRetazec(minuty)+":"+prevedCisloNaRetazec(sekundy)+" "+
                (hodiny / 12 > 0 ? "PM" : "AM");
    }

    @Override
    public void zobrazHodiny() {
        System.out.println(prevedHodinyNaRetazec());
    }
}
