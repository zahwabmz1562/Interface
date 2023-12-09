/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author User
 */
public class Main {
	
	public static void main(String[] args) {
	Tabung t = new Tabung();
	Lingkaran l = new Lingkaran();
	Kubus k = new Kubus();
	Limas l1 = new Limas();
	SegiEmpat s = new SegiEmpat();
	t.setT(3);
	t.setR(8);
	l.setR(10);
	l1.setT(12);
		System.out.println("Luas Lingkaran : " + l.luas());
		System.out.println("Kelilig Lingkaran : " +l.keliling());
		System.out.println("Luas Permukaan Tabung : " +t.luasPermukaan());
		System.out.println("Volume Tabung : " +t.volume());		
		System.out.println("Luas SegiEmpat : " +s.luas());
		System.out.println("Keliling SegiEmpat : " +s.keliling());
		System.out.println("Luas Permukaan Kubus : " +k.luasPermukaan());
		System.out.println("Volume Kubus : " +k.volume());
		System.out.println("Luas Permukaan Limas : " +l1.luasPermukaan());
		System.out.println("Volume Limas : " +l1.volume());
	}
}
