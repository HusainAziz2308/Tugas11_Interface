# Tugas 10 - Interface
## Identitas
- Nama	: Husain Aziz Al Rosyid
- NIM	: 4124031
- Kelas	: A

## Tujuan Praktikum
1.	Memahami konsep Interface dalam Java.
2.	Mampu membuat program sederhana yang menerapkan Interface.

## Dasar Teori
**Interface** di Java adalah seperti kontrak yang harus dipatuhi oleh setiap class yang menggunakannya. Ini adalah cara untuk memastikan bahwa semua class memiliki metode yang sama, tetapi bagaimana mereka menjalankan metode tersebut bisa berbeda-beda.

**Pengertian Interface:** Interface hanya berisi deklarasi metode tanpa implementasi, atau dengan kata lain, hanya nama metode dan parameternya saja yang didefinisikan. Class yang mengimplementasikan interface bertanggung jawab untuk memberikan **"isi"** metode tersebut.

Misalnya, jika ada interface Mouse dengan metode `klikKanan()` dan `klikKiri()`, setiap class yang menggunakan interface tersebut wajib membuat metode tersebut, sesuai kebutuhan mereka sendiri. Contohnya seperti berikut:
```
public interface Mouse {
    void klikKanan();
    void klikKiri();
}

public class Laptop implements Mouse {
    public void klikKanan() {
        System.out.println("Laptop: Klik kanan mouse.");
    }

    public void klikKiri() {
        System.out.println("Laptop: Klik kiri mouse.");
    }
}
```

### Fungsi Interface
1.	Membantu menjaga konsistensi struktur kode dalam program yang kompleks.
2.	Memberikan fleksibilitas lebih karena satu class bisa menggunakan lebih dari satu interface.

Misalnya, jika ingin membuat class `Printer` yang bisa melakukan fungsi scanning dan copying, bisa membuat dua interface seperti ini:
```
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
```

### Perbedaan Interface dan Abstract Class
Ketika mempelajari interface, salah satu hal yang menarik adalah membandingkannya dengan abstract class. Berikut adalah beberapa perbedaannya:
1.	Abstract class bisa memiliki metode yang sudah diimplementasikan, tetapi interface tidak bisa.
2.	Satu class hanya bisa mewarisi satu abstract class, tetapi bisa mengimplementasikan banyak interface.

### Fungsi Interface
Interface membuat pengkodean lebih terstruktur dan mempermudah kerja tim. Sebagai contoh, jika satu tim bertugas membuat interface dan yang lain mengimplementasikan, maka kerja akan lebih cepat karena strukturnya sudah ditentukan.

## Implementasi Program
### C. LATIHAN
[Main.java](Main.java)

Output:
```
Memanggil dari nomor telepon: 08123456789
Menerima panggilan di nomor telepon: 08123456789
SmartPhone sedang mengambil gambar menggunakan lensa Sudut Lebar.
SmartPhone sedang membaca kartu.
Tipe lensa SmartPhone: Sudut Lebar
Memanggil dari nomor telepon: 02198765432
Menerima panggilan di nomor telepon: 02198765432
```

### D. TUGAS
[MainPerbaikan.java](MainPerbaikan.java)

**Kesalahan:**
Ada satu kesalahan fatal dalam kode yang Anda berikan, yaitu pada antarmuka Scanner:
1.	Metode dengan Badan (Body) dalam Antarmuka: Antarmuka (interface) di Java, sebelum Java 8, hanya boleh berisi deklarasi metode abstrak (yaitu, metode tanpa badan/implementasi) dan konstanta (public static final).
Output yang seharusnya:

Output:
```
Scanning image...
Copy image...
Print image...
```
## Analisis
### Kesimpulan Latihan
Latihan ini membantu saya memahami bagaimana interface digunakan untuk mendefinisikan metode yang harus ada pada setiap class yang menggunakannya.
### Kesimpulan Tugas
Kesalahan utama pada tugas adalah adanya implementasi metode di dalam interface, yang melanggar aturan dasar Java. Setelah diperbaiki, program menjadi lebih sesuai dengan konsep interface.
### Manfaat Interface
1.	Menjaga konsistensi struktur metode.
2.	Mempermudah pengelolaan kode yang kompleks.
3.	Mendukung kerja tim dalam proyek besar
