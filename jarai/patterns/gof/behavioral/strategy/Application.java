package jarai.patterns.gof.behavioral.strategy;

public class Application {


    public static void main(String[] args) {

        var firma1 = new Firma("Mal mal was");
        var firma2 = new Firma("M�bel maker");

        firma1.Einstellen(new Maler("Paul"));
        firma1.Einstellen(new Maler("Jens"));

        firma2.Einstellen(new Schreiner("Gerd"));
        firma2.Einstellen(new Schreiner("Gregor"));

        firma1.Produzieren();
        firma2.Produzieren();
    }
}
