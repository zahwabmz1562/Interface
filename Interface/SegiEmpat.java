/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author User
 */
public class SegiEmpat implements BangunDatar{
	
	@Override
	public double luas(){
		return s * s;
	}

	@Override
	public double keliling() {
		return 4 * s;
	}
}
