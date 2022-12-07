package MODUL2_ZULFA;

public class Kapal extends TransportasiAir {
    String mesin;

    Kapal(int JumlahKursi, int biaya, String mesin) {
        super(JumlahKursi, biaya);
    }

    void Kinformasi(int JumlahKursi, int biaya, String mesin) {
        System.out.println("Transportasi air jenis kapal dengan kursi berjumlah " + JumlahKursi
                + " ditetapkan dengan biaya sebesar RP." + biaya);
    }

    void Kberlayar(int kecepatan, String mesin) {
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan " + mesin
                + "dengan kecepatan yang tidak stabil");
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan " + mesin
                + "dengan kecepatan yang stabil di kisaran " + kecepatan + " Knots");

    }

    void Kberlabuh(int jangkar) {
        System.out.println("Transportasi air jenis kapal sedang berlabuh dipantai tanpa jangkar ");
        System.out.println("Transportasi air jenis kapal sedang berlabuh dipantai menggunakan " + jangkar + " Jangkar");
    }
}
