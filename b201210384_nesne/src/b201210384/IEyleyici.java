package b201210384;

public interface IEyleyici {
    IObserver kritikSogutma = new KritikSogutma();

    int sogutucuAc(int sicaklik, String tur) throws InterruptedException;

    void sogutucuKapat() throws InterruptedException;

}
