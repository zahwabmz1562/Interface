/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author User
 */
public class Kubus extends SegiEmpat implements Bangun3Dimensi{
	
	
	@Override
	public double luasPermukaan(){
		return 6 * s;
	}

	@Override
	public double volume() {
		return super.luas()*s;
	}
	
}
