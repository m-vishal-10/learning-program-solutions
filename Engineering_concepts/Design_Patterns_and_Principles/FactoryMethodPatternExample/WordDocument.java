package Engineering_concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}

