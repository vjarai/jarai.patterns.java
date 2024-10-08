/*
 * PlotterAdapter.java
 */

package jarai.patterns.gof.structural.adapter.printer;


public class PdfCreatorToPrinterAdapter extends Printer {

    private final PdfCreator pdfCreator;

    public PdfCreatorToPrinterAdapter(PdfCreator pdfCreator) {
        this.pdfCreator = pdfCreator;
    }

    void druckeText(String text) {
        pdfCreator.createPdf(text);
    }
}
