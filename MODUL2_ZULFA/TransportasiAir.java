package MODUL2_ZULFA;

public class TransportasiAir {
    int JumlahKursi;
    int biaya;

    TransportasiAir(int JumlahKursi, int biaya) {
        this.JumlahKursi = JumlahKursi;
        this.biaya = biaya;
    }

    void informasi() {
        System.out.println("Transportasi air jenis yang tidak diketahui dengan kursi berjumlah " + JumlahKursi
                + " ditetapkan dengan biaya sebesar RP." + biaya);
    }

    void berlayar() {
        System.out.println("Transportasi air jenis yang tidak diketahui sedang berlayar");

    }

    void berlabuh() {
        System.out.println("Transportasi air jenis yang tidak diketahui sedang berlabuh di pantai");
    }

}
