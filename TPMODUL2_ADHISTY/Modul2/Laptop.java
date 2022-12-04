package Modul2;

public class Laptop extends Perangkat {
    String nama_game;
    boolean webcam;
    String email;
    String email2;

    Laptop(String drive, int ram, double processor) {
        super(drive, ram, processor);
    }

    void Lapinformasi(String drive, int ram, double processor, boolean webcam) {
        System.out.println("Laptop ini memiliki drive tipe " + this.drive + " dengan ram sebesar "
                + this.ram + " dan processor secepat " + this.processor + " ghz."
                + "Selain itu apakah laptop ini memiliki webcam? " + webcam);
    }

    void BukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    void email(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    void emailing(String email, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email + " dan ke " + email2);
    }
}
