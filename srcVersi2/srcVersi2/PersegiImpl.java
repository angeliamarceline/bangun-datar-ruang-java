package srcVersi2;

public class PersegiImpl implements BangunDatar{
    double sisi;

    public PersegiImpl() {
    }

    public PersegiImpl(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double toCalculate() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);

        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi = " + keliling); 
        return 0;
    }
    
}
