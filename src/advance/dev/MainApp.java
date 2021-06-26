package advance.dev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
	public static void checkAge(int age) {
		 if (age <= 0) throw new InputMismatchException("tuoi khong duoc nho hon 0.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Age:");
		int age = sc.nextInt();
		checkAge(age);
	}

}


