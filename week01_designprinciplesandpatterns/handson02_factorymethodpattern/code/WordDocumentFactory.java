package week01_designprinciplesandpatterns.handson02_factorymethodpattern.code;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

