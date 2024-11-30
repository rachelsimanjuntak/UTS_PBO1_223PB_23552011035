// Kelas abstrak Aset

abstract class Aset {

    // Metode abstrak
    public abstract void periksaStatus();

    public abstract void updateHarga(double hargaBaru);
}

// Kelas Properti yang mewarisi dari Aset
class Properti extends Aset {

    private String alamat;
    private double luas;
    private double harga;
    private String statusSewa;

    // Constructor
    public Properti(String alamat, double luas, double harga) {
        this.alamat = alamat;
        this.luas = luas;
        this.harga = harga;
        this.statusSewa = "Kosong";
    }

    // Getter dan Setter
    public String getAlamat() {
        return alamat;
    }

    public double getLuas() {
        return luas;
    }

    public double getHarga() {
        return harga;
    }

    public String getStatusSewa() {
        return statusSewa;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStatusSewa(String statusSewa) {
        this.statusSewa = statusSewa;
    }

    // Implementasi metode abstrak
    @Override
    public void periksaStatus() {
        System.out.println("Status sewa: " + statusSewa);
    }

    @Override
    public void updateHarga(double hargaBaru) {
        setHarga(hargaBaru);
        System.out.println("Harga diperbarui menjadi: " + harga);
    }

    // Metode untuk menghitung pajak (akan di override di subclass)
    public double hitungPajak() {
        return 0; // Default pajak, bisa di override
    }
}

// Kelas Rumah yang mewarisi dari Properti
class Rumah extends Properti {

    public Rumah(String alamat, double luas, double harga) {
        super(alamat, luas, harga);
    }

    @Override
    public double hitungPajak() {
        return getHarga() * 0.01; // Misalnya, tarif pajak 1%
    }
}

// Kelas Apartemen yang mewarisi dari Properti
class Apartemen extends Properti {

    public Apartemen(String alamat, double luas, double harga) {
        super(alamat, luas, harga);
    }

    @Override
    public double hitungPajak() {
        return getHarga() * 0.015; // Misalnya, tarif pajak 1.5%
    }
}

// Kelas utama untuk menguji sistem
public class SistemManajemenProperti {

    public static void main(String[] args) {
        // Registrasi properti
        Properti rumah1 = new Rumah("Jalan Merdeka No. 1", 120, 500000000);
        Properti apartemen1 = new Apartemen("Jalan Kebangsaan No. 2", 80, 300000000);

        // Hitung pajak
        System.out.println("Pajak Rumah: " + rumah1.hitungPajak());
        System.out.println("Pajak Apartemen: " + apartemen1.hitungPajak());

        // Manajemen sewa
        rumah1.setStatusSewa("Disewa");
        apartemen1.setStatusSewa("Kosong");

        // Laporan aset
        rumah1.periksaStatus();
        apartemen1.periksaStatus();
    }
}
