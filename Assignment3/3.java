import java.util.Scanner;

public class ques4 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your first name,last name,grade,login name,id and gpa ");
		String fname=ui.next();
		String lname=ui.next();
		String grade=ui.next();
		int id=ui.nextInt();
		String login=ui.next();
		double gpa=ui.nextDouble();
		System.out.println("first name "+fname);
		System.out.println("last name "+lname);
		System.out.println("grade "+grade);
		System.out.println("id "+id);
		System.out.println("login name "+login);
		System.out.println("gpa "+gpa);
	}

}
