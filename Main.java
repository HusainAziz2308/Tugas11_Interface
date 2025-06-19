// Kelas Lensa
class Lensa {
    private String tipe;

    public Lensa(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void fokus() {
        System.out.println("Lensa sedang fokus...");
    }
}

// Kelas Telepon
class Telepon {
    protected String nomorTelepon;

    public Telepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void panggil() {
        System.out.println("Memanggil dari nomor telepon: " + nomorTelepon);
    }

    public void terimaPanggilan() {
        System.out.println("Menerima panggilan di nomor telepon: " + nomorTelepon);
    }
}

// Antarmuka Kamera
interface Kamera {
    void ambilGambar();
}

// Antarmuka PembacaKartu
interface PembacaKartu {
    void bacaKartu();
}

// Kelas SmartPhone
class SmartPhone extends Telepon implements Kamera, PembacaKartu {
    private Lensa lensa;

    public SmartPhone(String nomorTelepon, Lensa lensa) {
        super(nomorTelepon);
        this.lensa = lensa;
    }

    public Lensa getLensa() {
        return lensa;
    }

    public void setLensa(Lensa lensa) {
        this.lensa = lensa;
    }

    public void ambilGambar() {
        System.out.println("SmartPhone sedang mengambil gambar menggunakan lensa " + lensa.getTipe() + ".");
    }

    public void bacaKartu() {
        System.out.println("SmartPhone sedang membaca kartu.");
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        Lensa lensaSmartPhone = new Lensa("Sudut Lebar");

        SmartPhone smartPhoneKu = new SmartPhone("08123456789", lensaSmartPhone);

        smartPhoneKu.panggil();
        smartPhoneKu.terimaPanggilan();

        smartPhoneKu.ambilGambar();

        smartPhoneKu.bacaKartu();

        System.out.println("Tipe lensa SmartPhone: " + smartPhoneKu.getLensa().getTipe());

        Telepon teleponLama = new Telepon("02198765432");
        teleponLama.panggil();
        teleponLama.terimaPanggilan();
    }
}