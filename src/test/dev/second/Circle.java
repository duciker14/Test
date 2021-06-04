package test.dev.second;

public class Circle extends Shape {
	double banKinh;
	
	public Circle(String ten, double banKinh) {
		super(ten);
		this.banKinh = banKinh;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * banKinh;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten hinh tron: %s, Ban Kinh: %f",ten,banKinh);
	}

}
