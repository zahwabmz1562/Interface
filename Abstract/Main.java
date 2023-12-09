package Abstract;

public class Main {
    public static void main(String[] args) {
        Poligon p = new Lingkaran(13);
        p.setNamaPoligon("\t\t\t\tLingkaran");
        p.deskripsi();
        Poligon p1 = new Persegi(4);
        System.out.println();
        p1.setNamaPoligon("\t\t\t\tPersegi");
        p1.deskripsi();
        Poligon p2 = new Segitiga(6, 8);
        System.out.println();
        p2.setNamaPoligon("\t\t\t\tSegitiga");
        p2.deskripsi();

        //membuat kelas persegi dan segitiga
        //output deskripsi bebas
    }
}
