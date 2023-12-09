package Abstract;

public class Persegi extends Poligon {
    private double s;

    Persegi(double s) {
        this.s = s;
    }

    public void setS(double s) {
        this.s = s;
    }
    public double getS() {
        return s;
    }

    double luas() {
        double luasPersegi = s * s;
        return luasPersegi;
    }

    public double keliling() {
        double kelilingPersegi = 4*s;
        return kelilingPersegi;
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
