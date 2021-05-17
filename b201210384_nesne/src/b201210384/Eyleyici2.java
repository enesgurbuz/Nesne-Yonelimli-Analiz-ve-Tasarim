package b201210384;

public class Eyleyici2 implements IEyleyici {

    @Override
    public int sogutucuAc(int sicaklik, String tur) throws InterruptedException {
        LogEkran.getInstance().log("Soğutucu Açılıyor... ");
        LogEkran.getInstance().log("Sıcaklık Düşürülüyor...");
        Thread.sleep(1000);
        sicaklik = sicaklik - 15;
        LogEkran.getInstance().log("Sıcaklık, " + (sicaklik + 15) + " " + tur + "'den " + sicaklik + " " + tur + "'e düşürüldü...");
        return sicaklik;
    }

    @Override
    public void sogutucuKapat() throws InterruptedException {
        LogEkran.getInstance().log("Soğutucu Kapatılıyor...");
        Thread.sleep(1000);
        LogEkran.getInstance().log("Soğutucu Kapatıldı...");
    }
}
