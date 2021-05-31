package rok2.sprint9.Hodiny;

import java.util.Calendar;

public class NastavCas {
    Calendar aktualnyCas = Calendar.getInstance();
    int hodina = aktualnyCas.get(Calendar.HOUR_OF_DAY);
    int minuta = aktualnyCas.get(Calendar.MINUTE);
    int sekunda = aktualnyCas.get(Calendar.SECOND);

    public void nastavAZobrazHodiny(Hodiny hodiny){
        hodiny.setHodiny(hodina);
        hodiny.setMinuty(minuta);
        hodiny.setSekundy(sekunda);
        hodiny.zobrazHodiny();

    }

}
