package srcVersi2;

public interface BangunDatar {
    default void toDraw(String namaBangun){
        System.out.println("Membuat gambar : " + namaBangun);
    };

    default void toDetail(String karakter){
        System.out.println("Karakteristik : " + karakter);
    };
    
    double toCalculate();
}
