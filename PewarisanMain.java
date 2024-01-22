package pewarisan;

public class PewarisanMain {
    public static void main(String[] args) {
        BANGUNDATAR BangunDatar = new BANGUNDATAR();

        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;

        BangunDatar.luas();
        BangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();
    }
}
