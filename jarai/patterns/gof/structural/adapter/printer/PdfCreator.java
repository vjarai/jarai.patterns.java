package jarai.patterns.gof.structural.adapter.printer;

public class PdfCreator {


    public PdfCreator() {
    }

    void createPdf(String text) {
        System.out.println("Erstelle PDF: " + text);
    }

}
