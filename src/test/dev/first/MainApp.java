package test.dev.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	// Input List
	static List<Person> input(int stuNumber, int teaNumber){
		List<Person> personList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		System.out.println("=========Student===========");
		for (int i = 0; i < stuNumber; i++) {
			System.out.println("Student: Nhap vao lan luot ten,tuoi,MSSV,DiemTB:");
			String name = sc.next();
			int age = sc.nextInt();
			String idStudent = sc.next();
			float diemTrungBinh = sc.nextFloat();
			Person stuPer = new Student(name, age, idStudent, diemTrungBinh);
			personList.add(stuPer);
		}
		System.out.println("==========Teacher========");
		for (int i = 0; i < teaNumber; i++) {
			System.out.println("Teacher: Nhap vao lan luot ten,tuoi,MSGV,He so luong");
			String name = sc.next();
			int age = sc.nextInt();
			String idGV = sc.next();
			float heSoLuong = sc.nextFloat();
			Person teaPer = new Teacher(name, age, idGV, heSoLuong);
			personList.add(teaPer);	
		}
		return personList;
	}
	//Print
	static void print(List<Person> personList) {
		for (Person person : personList) {
			String str = person.toString();
			System.out.println(str);
		}
	}
	// FindMax
	static void find(List<Person> personList) {
		Iterator<Person> it = personList.iterator();
		float maxStu = 0;
		float maxTea = 0;
		String preStu = personList.get(0).name;
		String preTea = personList.get(0).name;
		while (it.hasNext()) {
			Person person = it.next();
			if (person instanceof Student == true){
				Student stu;
				stu = (Student) person;
				if (stu.getDiemTrungBinh() > maxStu) {
					maxStu = stu.getDiemTrungBinh();
					preStu = stu.name;
				}
			}else {
				Teacher tea;
				tea = (Teacher) person;
				if (tea.getHeSoLuong() > maxTea) {
					maxTea = tea.getHeSoLuong();
					preTea = tea.name;
				}
			}
		}
		String strStu = String.format("SV Diem cao nhat: %s -- %f",preStu,maxStu);
		String strTea = String.format("GV co HSL cao nhat: %s -- %f", preTea,maxTea);
		System.out.println(strStu);
		System.out.println(strTea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> perList;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so GV: ");
		int numberStu = sc.nextInt();
		System.out.println("Nhap vao so SV: ");
		int numberTea = sc.nextInt();
		perList = input(numberStu, numberTea);
		print(perList);
		find(perList);
	}
}
	
