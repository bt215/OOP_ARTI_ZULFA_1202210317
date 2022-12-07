package MODUL2_ZULFA;

public class MainFile {
    public static void main(String[] args) {
        TransportasiAir TA = new TransportasiAir(20, 111);
        Sampan SA = new Sampan(22, 132, 2);
        Kapal KA = new Kapal(32, 1230, "Senka");
        TA.informasi();
        TA.berlayar();
        TA.berlabuh();
        System.out.println(" ");
        SA.Sinformasi(123, 1323, "satuh");
        SA.Sberlayar(132, "NOO");
        SA.Sberlabuh();
        SA.Sberlabuh(2);
        System.out.println(" ");
        KA.Kinformasi(0, 0, null);
        KA.Kberlayar(0, null);
        KA.Kberlayar(1231, "Aksana");
        KA.Kberlabuh(2);
    }
}
