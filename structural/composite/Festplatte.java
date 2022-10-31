/*
 * Created on 21.03.2004
 *
 */
package structural.composite;


public class Festplatte extends Bauteil {

    private final String laufwerk;

    /**
     *
     */
    public Festplatte(String laufwerk, double preis) {
        super(preis);
        this.laufwerk = laufwerk;
    }

    void anzeigen() {
        System.out.print("Festplatte " + laufwerk);
        super.anzeigen();
    }

}