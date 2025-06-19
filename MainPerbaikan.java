interface Scanner {
    public void scaneImage();
}

interface Copier {
    public void copyImage();
}

class Printer implements Copier, Scanner {
    public void scaneImage() {
        System.out.println("Scanning image...");
    }

    public void copyImage() {
        System.out.println("Copy image...");
    }

    public void printImage() {
        System.out.println("Print image...");
    }
}

public class MainPerbaikan {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();

        myPrinter.scaneImage();
        myPrinter.copyImage();
        myPrinter.printImage();
    }
}