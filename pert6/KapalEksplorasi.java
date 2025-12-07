public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsiEnergi = jarak * 2;
        if (getLevelEnergi() < konsumsiEnergi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - konsumsiEnergi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) {
            energiBaru = 100;
        }
        setLevelEnergi(energiBaru);
        System.out.println("Energi kapal eksplorasi diisi sebanyak " + jumlah + "%. Total energi: " + getLevelEnergi() + "%");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
