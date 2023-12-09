package Interface;

public class Lingkaran implements BangunDatar{
    protected double r;

   
    
    public void setR(double r) {
	this.r = r;
    }

    public double getR() {
        return r;
    }

    public double luas() {
        return PHI * r * r;
    }


    public double keliling() {
        return 2 * PHI * r;
    }
}
