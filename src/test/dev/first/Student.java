package test.dev.first;

public class Student extends Person {
	private String idStudent;
	private float diemTrungBinh;
	
	public Student(String name, int age, String idStudent, float diemTrungBinh) {
		super(name, age);
		this.idStudent = idStudent;
		this.diemTrungBinh = diemTrungBinh;
	}
	

	public float getDiemTrungBinh() {
		return this.diemTrungBinh;
	}


	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten: %s, Tuoi: %d, MSSV: %s, DTB: %f", name,age,idStudent,diemTrungBinh);
	}


	@Override
	String getClassName() {
		// TODO Auto-generated method stub
		return Student.class.getName();
	}

}
