package test.dev.first;

public class Teacher extends Person {
	private String idGV;
	private double heSoLuong;
	
	public Teacher(String name, int age, String idGV, double heSoLuong) {
		super(name, age);
		this.idGV = idGV;
		this.heSoLuong = heSoLuong;
	}
	
	public double getHeSoLuong() {
		return this.heSoLuong;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten GV: %s, Tuoi GV: %d, Ma Gv: %s, He So Luong: %f ", name, age, idGV, heSoLuong);
	}
	
}
