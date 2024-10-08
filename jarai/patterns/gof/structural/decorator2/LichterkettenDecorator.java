package jarai.patterns.gof.structural.decorator2;

public class LichterkettenDecorator extends WeihnachtsbaumDecorator {
    private boolean isBurning;

    public LichterkettenDecorator(Weihnachtsbaum weihnachtsbaum) {

        super(weihnachtsbaum);
    }

    public void einschalten() {
        isBurning = true;
    }

    public void show() {
        dekorierterBaum.show();
        System.out.print(", mit " + (isBurning ? "eingeschalteter" : "ausgeschalteter") + " Lichterkette");
    }
}


