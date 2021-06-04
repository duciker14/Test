package test.dev.first;

public class Teacher extends Person {
	private String idGV;
	private float heSoLuong;
	
	public Teacher(String name, int age, String idGV, float heSoLuong) {
		super(name, age);
		this.idGV = idGV;
		this.heSoLuong = heSoLuong;
	}
	

	public float getHeSoLuong() {
		return this.heSoLuong;
	}


	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten GV: %s, Tuoi GV: %d, Ma Gv: %s, He So Luong: %f ", name, age, idGV, heSoLuong );
	}


	@Override
	String getClassName() {
		// TODO Auto-generated method stub
		return Teacher.class.getName();
	}

}
