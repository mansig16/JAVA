import java.util.Scanner;

public class ques4 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string 1");
		String s1=ui.next();
		System.out.println("enter the string 2");
		String s2=ui.next();
		String s3=s1.concat(s2);
		System.out.print(s3);

	}

}
