package week01_designprinciplesandpatterns.handson02_factorymethodpattern.code;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

