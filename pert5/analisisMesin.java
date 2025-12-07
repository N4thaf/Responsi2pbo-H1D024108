class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] kumpulanMesin = new defaultMesin[5];
        kumpulanMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        kumpulanMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5);
        kumpulanMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        kumpulanMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        kumpulanMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin mesin : kumpulanMesin) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa: " + mesin.nilaiPerforma());
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin mesin : kumpulanMesin) {
            mesin.suaraMesin();
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin tertinggi = kumpulanMesin[0];
        for (defaultMesin mesin : kumpulanMesin) {
            if(mesin.nilaiPerforma() > tertinggi.nilaiPerforma()) {
                tertinggi = mesin;
            }
        }
        System.out.printf("%s -> %.1f\n", tertinggi.getNamaMesin(), tertinggi.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for(int i = 0; i < kumpulanMesin.length - 1; ++i) {

            int minPerformaIdx = i;
            for(int j = i + 1; j < kumpulanMesin.length; ++j) {
                if(kumpulanMesin[j].nilaiPerforma() > kumpulanMesin[minPerformaIdx].nilaiPerforma()) {
                    minPerformaIdx = j;
                }
            }

            defaultMesin temp = kumpulanMesin[minPerformaIdx];
            kumpulanMesin[minPerformaIdx] = kumpulanMesin[i];
            kumpulanMesin[i] = temp;
        }

        for (int i = 0; i < 3; ++i) {
            System.out.printf("%d. %s -> %.1f\n", i+1, kumpulanMesin[i].getNamaMesin(), kumpulanMesin[i].nilaiPerforma());
        }
    }
}
