package test.dev.second;

public class Rectangle extends Shape {
	double canhA;
	double canhB;
	

	public Rectangle(String ten, double canhA, double canhB) {
		super(ten);
		this.canhA = canhA;
		this.canhB = canhB;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (canhA + canhB);
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return canhA * canhB;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten hinh chu nhat: %s, Do dai 2 canh: %f %f", ten,canhA,canhB);
	}

}
