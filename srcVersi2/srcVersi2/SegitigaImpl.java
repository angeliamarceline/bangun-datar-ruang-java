package srcVersi2;

public class SegitigaImpl implements BangunDatar{
    double alas;
    double tinggi;
    
    public SegitigaImpl() {
    }
    
    public SegitigaImpl(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double toCalculate() {
        double luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga = " + luas);

        double phytagoras = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );

        double keliling = alas + tinggi + phytagoras;
        System.out.println("Keliling Segitiga = " + keliling); 
        return 0;
    }
    
}
