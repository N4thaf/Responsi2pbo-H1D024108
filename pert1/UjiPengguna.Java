class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna(25, 60.0, 170.0);

        p.tampilInfo();

        System.out.println();
        System.out.println("--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");


    }
}
