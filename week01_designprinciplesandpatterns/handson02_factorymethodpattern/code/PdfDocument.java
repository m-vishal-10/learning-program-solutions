package week01_designprinciplesandpatterns.handson02_factorymethodpattern.code;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}

