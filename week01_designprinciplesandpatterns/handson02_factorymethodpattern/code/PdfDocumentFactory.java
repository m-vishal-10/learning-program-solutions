package week01_designprinciplesandpatterns.handson02_factorymethodpattern.code;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

