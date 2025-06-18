package week01_designprinciplesandpatterns.handson02_factorymethodpattern.code;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}

