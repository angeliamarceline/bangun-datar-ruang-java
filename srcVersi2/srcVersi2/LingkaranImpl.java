package srcVersi2;

public class LingkaranImpl implements BangunDatar{
    double radius;
    double phi = 3.14159265358979323846;

    public LingkaranImpl() {
    }

    public LingkaranImpl(double radius) {
        this.radius = radius;
    }

    @Override
    public double toCalculate() {
        double luas = phi * radius * radius;
        System.out.println("Luas Lingkaran = " + luas);

        double keliling = 2 * phi * radius;
        System.out.println("Keliling Lingkaran = " + keliling); 
        return 0;
    }

}
