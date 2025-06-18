package Engineering_concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

