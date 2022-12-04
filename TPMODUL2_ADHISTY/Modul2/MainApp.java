package Modul2;

public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat1 = new Perangkat("senka", 122, 2.2);
        Laptop lp = new Laptop("sas", 12, 23);
        Handphone hp = new Handphone("stauh", 2132, 11);
        perangkat1.informasi();
        System.out.println("");
        lp.Lapinformasi("sas", 1232, 2232, true);
        lp.BukaGame("satuh");
        lp.email("zajak@gmail.com");
        lp.emailing("Danko@gmail.com", "darko@gmail.com");
        System.out.println("");
        hp.Hpinformasi("akhmal", 1232, 2.2, false);
        hp.telfon(1223);
        hp.kirimSms(13232);
        hp.kirimnSms(12323, 22232);

    }
}
