package MODUL2_ZULFA;

public class Sampan extends TransportasiAir {
    int layar;

    Sampan(int JumlahKursi, int biaya, int layar) {
        super(JumlahKursi, biaya);
    }

    void Sinformasi(int JumlahKursi, int biaya, String mesin) {
        System.out.println("Transportasi air jenis Sampan dengan kursi berjumlah " + JumlahKursi
                + " ditetapkan dengan biaya sebesar RP." + biaya);

    }

    void Sberlayar(int kecepatan, String mesin) {
        System.out.println("Transportasi air jenis Sampan sedang berlayar menggunakan " + mesin
                + " dengan kecepatan yang tidak stabil");
        System.out.println("Transportasi air jenis Sampan sedang berlayar menggunakan " + mesin
                + " dengan kecepatan yang stabil di kisaran " + kecepatan + " Knots");

    }

    void Sberlabuh() {
        System.out.println("Transportasi air jenis kapal sedang berlabuh dipantai tanpa jangkar ");

    }

    void Sberlabuh(int jangkar) {
        System.out.println("Transportasi air jenis kapal sedang berlabuh dipantai menggunakan " + jangkar + " Jangkar");
    }

}
