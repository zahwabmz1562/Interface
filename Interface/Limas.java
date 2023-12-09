/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author User
 */
public class Limas extends SegiEmpat implements Bangun3Dimensi {
	protected double t;

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
	
	
	
	@Override
	public double luasPermukaan(){
		return super.luas() + 4 * 0.5 * s *t;
	}

	@Override
	public double volume() {
		return 0.333333 * super.luas() * t;
	}
	
}
