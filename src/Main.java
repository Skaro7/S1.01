public class Main {
    public static void main(String[] args) {

        Instruments wind = new WindInstrument("Trompeta", 270);
        Instruments stringInstrument = new StringInstrument("Contrabaix", 1800);
        Instruments percussion = new PercussionInstrument("Bombo", 100);

        wind.play();
        stringInstrument.play();
        percussion.play();
    }



}
