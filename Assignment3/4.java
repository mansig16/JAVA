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
		five ob1=new five(age);
		ob1.yr();
		System.out.println("your age after five years is "+ob1.after);
		ob1.yrb();
		System.out.println("your age before five years is "+ob1.bf);
		
	}

}

class five{
	int after;
	int af;
	int bf;
	five(int a){
		af=a;
	}
	void yr()
	{
		after=af+5;
	}
	void yrb(){
		bf=af-5;
	}
	
}
