package test.dev.second;

public class Triangle extends Shape {
	double canhA,canhB,canhC;
	
	public Triangle(String ten, double canhA, double canhB, double canhC) {
		super(ten);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return canhA + canhB + canhC;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi() / 2;
		return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Tam giac ten: %s, Do dai ba canh lan luot: %f %f %f", ten,canhA,canhB,canhC);
	}

}
