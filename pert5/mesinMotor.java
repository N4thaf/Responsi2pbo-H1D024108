class mesinMotor extends defaultMesin {
    private String tipeMotor;
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipeMotor;
    }

    @Override
    void tampilInfo() {
        System.out.printf("Mesin Motor %s | Tipe: %s | Tenaga: %d HP\n", namaMesin, tipeMotor, tenagaHP);
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
