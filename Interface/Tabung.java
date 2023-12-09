package Interface;

public class Tabung extends Lingkaran implements Bangun3Dimensi{
    protected double t;
    
 
	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
    

    @Override
    public double luasPermukaan(){
        return super.keliling() * t + 2 * super.luas();
    }

    @Override
    public double volume() {
        return super.luas() * t;
    }
}
