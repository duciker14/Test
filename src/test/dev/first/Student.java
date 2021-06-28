package test.dev.first;

public class Student extends Person {
	private String id;
	private double diemTrungBinh;
	
	public Student(String name, int age, String idStudent, double diemTrungBinh) {
		super(name, age);
		this.id = idStudent;
		this.diemTrungBinh = diemTrungBinh;
	}
	

	public double getDiemTrungBinh() {
		return this.diemTrungBinh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten: %s, Tuoi: %d, MSSV: %s, DTB: %f", name,age,id,diemTrungBinh);
	}
	
}
