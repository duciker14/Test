package test.dev.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * Bai kiem tra cuoi mon
 * @author Duc Nguyen Quang
 *
 */

public class MainApp {
	// Ham nhap mang
	static List<Person> input(int a, int b){
		List<Person> personList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a; i++) {
			System.out.printf("Nhap vao Student thu %d: ",i+1);
			System.out.println("Nhap ten:");
			String name = sc.next();
			System.out.println("Nhap tuoi:");
			int age = sc.nextInt();
			System.out.println("Nhap vao ma so sinh vien:");
			String idStudent = sc.next();
			System.out.println("Nhap vao diem trung binh:");
			double diemTrungBinh = sc.nextDouble();
			Person std = new Student(name, age, idStudent, diemTrungBinh);
			personList.add(std);
		}
		for (int i = 0; i < b; i++) {
			System.out.printf("Nhap vao Teacher thu %d: ",i+1);
			System.out.println("Nhap ten: ");
			String name = sc.next();
			System.out.println("Nhap tuoi: ");
			int age = sc.nextInt();
			System.out.println("Nhap vao MSGV:");
			String idGV = sc.next();
			System.out.println("Nhap vao he so luong: ");
			double heSoLuong = sc.nextDouble();
			Person teacher = new Teacher(name, age, idGV, heSoLuong);
			personList.add(teacher);
		}
		return personList;
	}
	//In mang
	static void print(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person.toString());
		}
	}
	
	static void findMax(List<Person> personList) {
		Iterator<Person> it = personList.iterator();
		Student std = null;
		Teacher tc = null;
		while (it.hasNext()) {
			Person person = it.next();
			if (person instanceof Student == true) {
				Student student = (Student) person;
				if (std == null) {
					std = student;
				}else if (std.getDiemTrungBinh() < student.getDiemTrungBinh()) {
					std = student;
				}
			}
			if (person instanceof Teacher == true) {
				Teacher teacher = (Teacher) person;
				if (tc == null) {
					tc = teacher;
				}else if (tc.getHeSoLuong() < teacher.getHeSoLuong()) {
					tc = teacher;
				}
			}
		}
		System.out.println("Student co diem trung binh cao nhat la: ");
		System.out.println(std.toString());
		System.out.println("Teacher co diem trung binh cao nhat la:");
		System.out.println(tc.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so Student: ");
		int totalStudent = sc.nextInt();
		System.out.println("Nhap vao so Teacher: ");
		int totalTeacher = sc.nextInt();
		
		personList = input(totalStudent, totalTeacher);
		print(personList);
		findMax(personList);
	}

}
