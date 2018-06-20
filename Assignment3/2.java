 import java.util.Scanner;

public class ques2 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your name");
		String name=ui.nextLine();
		System.out.println(" your name is "+name);
		System.out.println("enter your age");
		int age=ui.nextInt();
		System.out.println("your age is "+age);
		System.out.println("how much you wrote till now");
		String how=ui.next();
		System.out.println("you wrote "+how);
		
		
	}

}
