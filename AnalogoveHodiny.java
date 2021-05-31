package rok2.sprint9.Hodiny;

public class AnalogoveHodiny extends Hodiny{

    public void zobrazHodiny() {

        int dvanastkoveHodiny = this.hodiny % 12;

        String cas;
        if (dvanastkoveHodiny == 0) {
            cas = AnalogoveHodiny.HODINY_0;
        } else if (dvanastkoveHodiny == 1) {
            cas = AnalogoveHodiny.HODINY_1;
        } else if (dvanastkoveHodiny == 2) {
            cas = AnalogoveHodiny.HODINY_2;
        } else if (dvanastkoveHodiny == 3) {
            cas = AnalogoveHodiny.HODINY_3;
        } else if (dvanastkoveHodiny == 4) {
            cas = AnalogoveHodiny.HODINY_4;
        } else if (dvanastkoveHodiny == 5) {
            cas = AnalogoveHodiny.HODINY_5;
        } else if (dvanastkoveHodiny == 6) {
            cas = AnalogoveHodiny.HODINY_6;
        } else if (dvanastkoveHodiny == 7) {
            cas = AnalogoveHodiny.HODINY_7;
        } else if (dvanastkoveHodiny == 8) {
            cas = AnalogoveHodiny.HODINY_8;
        } else if (dvanastkoveHodiny == 9) {
            cas = AnalogoveHodiny.HODINY_9;
        } else if (dvanastkoveHodiny == 10) {
            cas = AnalogoveHodiny.HODINY_10;
        } else {
            cas = AnalogoveHodiny.HODINY_11;
        }

        System.out.println(cas);
    }

    private static final String HODINY_0 =
            "+-------------+\n" +
                    "|      |      |\n" +
                    "|      |      |\n" +
                    "|      +      |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_1 =
            "+-------------+\n" +
                    "|        /    |\n" +
                    "|       /     |\n" +
                    "|      +      |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_2 =
            "+-------------+\n" +
                    "|           _ |\n" +
                    "|        _--  |\n" +
                    "|      +-     |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_3 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "|      +----- |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_4 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "|      +-_    |\n" +
                    "|         --_ |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_5 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "|      +      |\n" +
                    "|       \\     |\n" +
                    "|        \\    |\n" +
                    "+-------------+\n";

    private static final String HODINY_6 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "|      +      |\n" +
                    "|      |      |\n" +
                    "|      |      |\n" +
                    "+-------------+\n";

    private static final String HODINY_7 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "|      +      |\n" +
                    "|     /       |\n" +
                    "|    /        |\n" +
                    "+-------------+\n";

    private static final String HODINY_8 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "|    _-+      |\n" +
                    "| _--         |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_9 =
            "+-------------+\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "| -----+      |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_10 =
            "+-------------+\n" +
                    "| _           |\n" +
                    "|  --_        |\n" +
                    "|     -+      |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

    private static final String HODINY_11 =
            "+-------------+\n" +
                    "|    \\        |\n" +
                    "|     \\       |\n" +
                    "|      +      |\n" +
                    "|             |\n" +
                    "|             |\n" +
                    "+-------------+\n";

}
