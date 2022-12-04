package Modul2;

public class Perangkat {
    String drive;
    int ram;
    double processor;

    Perangkat(String drive, int ram, double processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    void informasi() {
        System.out.println("Perangkat tidak diketahui memiliki drive tipe " + this.drive + " dengan ram sebesar "
                + this.ram + " dan processor secepat " + this.processor + " ghz");
    }
}
