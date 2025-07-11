public interface Scanner {
    void scanImage();
}

public interface Copier {
    void copyImage();
}

public class Printer implements Scanner, Copier {
    public void scanImage() {
        System.out.println("Scanning image...");
    }

    public void copyImage() {
        System.out.println("Copying image...");
    }
}