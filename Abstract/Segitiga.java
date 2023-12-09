package Abstract;

public class Segitiga extends Poligon {
    private double alas;
    private double tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }

    double luas() {
        double luasSegitiga = (alas * tinggi) / 2;
        return luasSegitiga;
    }

    public double keliling() {
        double sisiMiring = (alas * alas) + (tinggi * tinggi);
        double kelilingSegitiga = alas + Math.sqrt(sisiMiring) * 2;
        return kelilingSegitiga;
    }

    public void setNamaPoligon(String namaPoligon) { 
        super.namaPoligon = namaPoligon;
    }

    public void deskripsi() {       
        System.out.println(namaPoligon);
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " +keliling());
    }
}
