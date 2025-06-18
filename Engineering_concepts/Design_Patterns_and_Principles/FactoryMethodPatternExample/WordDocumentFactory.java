package Engineering_concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

