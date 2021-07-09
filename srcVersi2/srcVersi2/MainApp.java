package srcVersi2;

public class MainApp {
    public static void main(String[] args) {
        PersegiImpl persegiImpl = new PersegiImpl(10);
        persegiImpl.toDraw("Persegi");
        persegiImpl.toDetail("Memiliki 4 titik sudut yang membentuk sudut siku-siku 90 derajat");
        persegiImpl.toDetail("Memiliki 4 rusuk yang sama panjang");
        persegiImpl.toCalculate();

        System.out.println();

        LingkaranImpl lingkaranImpl = new LingkaranImpl(10);
        lingkaranImpl.toDraw("Lingkaran");
        lingkaranImpl.toDetail("Memiliki jumlah sudut 180 derajat");
        lingkaranImpl.toDetail("Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran");
        lingkaranImpl.toDetail("Diameternya konstan");
        lingkaranImpl.toCalculate();

        System.out.println();

        SegitigaImpl segitigaImpl = new SegitigaImpl(3, 4);
        segitigaImpl.toDraw("Segitiga Siku-Siku");
        segitigaImpl.toDetail("Memiliki sisi tegak lurus dengan alas");
        segitigaImpl.toDetail("Memiliki 2 sudut lancip dan 1 sudut siku-siku");
        segitigaImpl.toDetail("Memiliki 3 sudut yang jumlah besarnya 180 derajat");
        segitigaImpl.toCalculate();

    }
}
