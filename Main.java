class Karakter {
    String nama;
    int health;
    String[] inventaris;

    Karakter(String nama, int health, String[] inventaris) {
        this.nama = nama;
        this.health = health;
        this.inventaris = inventaris;
    }

    void tampilkanInfo() {
        System.out.println("Nama karakter : " + nama);
        System.out.println("Health        : " + health);
        System.out.println("Inventaris    :");

        for (String item : inventaris) {
            System.out.println("- " + item);
        }

        System.out.println();
    }
}

class Kuda {
    String nama;
    int stamina;

    String[] perlengkapan;

    Kuda(String nama, int stamina, String[] perlengkapan) {
        this.nama = nama;
        this.stamina = stamina;
        this.perlengkapan = perlengkapan;
    }

    void tampilkanInfo() {
        System.out.println("Nama kuda     : " + nama);
        System.out.println("Stamina       : " + stamina);
        System.out.println("Perlengkapan  :");

        for (String item : perlengkapan) {
            System.out.println("- " + item);
        }

        System.out.println();
    }
}

class Senjata {

    String nama;
    int damage;

    String[] jenisSerangan;

    Senjata(String nama, int damage, String[] jenisSerangan) {
        this.nama = nama;
        this.damage = damage;
        this.jenisSerangan = jenisSerangan;
    }

    void tampilkanInfo() {
        System.out.println("Nama senjata  : " + nama);
        System.out.println("Damage        : " + damage);
        System.out.println("Jenis Serangan  :");

        for (String serangan : jenisSerangan) {
            System.out.println("- " + serangan);
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        String judulGame = "Fallen Primordials";
        String versiGame = "First Code lol";
        String namaDunia = "Nordic Myth's";
        String deskripsiGame = "Petualangan Yaraeld dan Arya D.";
        String Announcement = "Berikan Rating dan Ulasan untuk Mengembangkan Game INI!";
        String Notes = "Btw Serius Mau Coba Bikin Game";

        Karakter yaraeld = new Karakter(
            "Yaraeld D",
            100,
            new String[]{"Makanan", "Obat", "Peta"}
        );

        Karakter arya = new Karakter(
            "Arya D",
            95,
            new String[]{"Air minum", "Uang", "Teropong"}
        );

        Kuda kudaYaraeld = new Kuda(
            "Cerberus",
            900,
            new String[]{"Flaming Chains", "Alpha's Crown"}
        );

        Kuda kudaArya = new Kuda(
            "Synmara",
            859,
            new String[]{"Iced Heart", "Glacier Breath"}
        );

        Senjata sword = new Senjata(
            "Pedang Yaraeld",
            1233,
            new String[]{"Void Gate Unleasher", "Glacier Wrath's", "Judgment Cut End (Ultimate)"}
        );
        
         Senjata bow = new Senjata(
             "Bow Arya D",
             500,
              new String[]{"Rapid Bow Attack", "Return To Your Sender (Ultimate)"}
        );

        System.out.println("================================");
        System.out.println("Judul Awal   " + judulGame);
        System.out.println("Note #1      " + versiGame);
        System.out.println("================================");
        System.out.println("Dunia     : " + namaDunia);
        System.out.println("Deskripsi : " + deskripsiGame);
        System.out.println("Pesan Saya Sendiri: "+ Announcement);
        System.out.println("Note #2 :   " + Notes);
        System.out.println();

        System.out.println("=== DATA KARAKTER ===");
        yaraeld.tampilkanInfo();
        arya.tampilkanInfo();

        System.out.println("=== DATA KUDA ===");
        kudaYaraeld.tampilkanInfo();
        kudaArya.tampilkanInfo();

        System.out.println("=== DATA SENJATA ===");
        sword.tampilkanInfo();
        bow.tampilkanInfo();
    }
}