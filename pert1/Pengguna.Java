class Pengguna {
    int umur;
    double berat;
    double tinggi;
    final double faktorAktivitas = 1.2;
    
    double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        double bmi = berat / (tinggiMeter * tinggiMeter);
        return bmi;
    }
    
    void tampilKategori() {
        double bmi = hitungBMI();
        
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
    
    double hitungKalori() {
        double kalori = berat * faktorAktivitas * 10;
        return kalori;
    }
    
    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("BMI: %.2f%n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari%n", hitungKalori());
        System.out.println("====================================");
    }
}