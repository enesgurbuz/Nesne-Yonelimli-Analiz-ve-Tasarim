package b201210384;

public class Eyleyici1 implements IEyleyici {

    @Override
    public int sogutucuAc(int sicaklik, String tur) throws InterruptedException {
        LogEkran.getInstance().log("Soğutucu Açılıyor... ");
        LogEkran.getInstance().log("Sıcaklık Düşürülüyor...");
        Thread.sleep(500);
        sicaklik = sicaklik - 10;
        LogEkran.getInstance().log("Sıcaklık, " + (sicaklik + 10) + " " + tur + "'den " + sicaklik + " " + tur + "'e düşürüldü...");
        return sicaklik;
    }

    @Override
    public void sogutucuKapat() throws InterruptedException {
        LogEkran.getInstance().log("Soğutucu Kapatılıyor...");
        Thread.sleep(500);
        LogEkran.getInstance().log("Soğutucu Kapatıldı...");
    }

}
