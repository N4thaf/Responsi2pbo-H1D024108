class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik;

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.printf("Mesin Traktor %s | Tarik: %f ton | Tenaga: %d\n", namaMesin, kapasitasTarik, tenagaHP);
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}
