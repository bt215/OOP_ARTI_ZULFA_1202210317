package Modul2;

public class Handphone extends Perangkat {
    int telfon = 123242;
    int telfon2 = 124242;
    boolean fingerprint = true;

    Handphone(String drive, int ram, double processor) {
        super(drive, ram, processor);
    }

    void Hpinformasi(String drive, int ram, double processor, boolean fingerprint) {
        System.out.println("Handphone ini memiliki drive tipe " + this.drive + " dengan ram sebesar "
                + this.ram + " dan processor secepat " + this.processor + " ghz."
                + "Selain itu apakah laptop ini memiliki fingerprint? " + fingerprint);
    }

    void telfon(int telfon) {
        System.out.println("Handphone berhasil menyambungkan telfon ke NO " + telfon);
    }

    void kirimSms(int telfon) {
        System.out.println("Handphone berhasil mengirim sms ke NO " + telfon);
    }

    void kirimnSms(int telfon, int telfon2) {
        System.out.println("Handphone berhasil mengirim sms ke NO " + telfon + " dan ke NO " + telfon2);
    }

}
