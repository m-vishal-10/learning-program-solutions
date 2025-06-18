package week01_designprinciplesandpatterns.handson02_factorymethodpattern.code;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}
