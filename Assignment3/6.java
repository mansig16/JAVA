import java.util.Scanner;

public class bmi {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the height in meters");
		double height=ui.nextDouble();
		System.out.println("enter the weight in kgs");
		int weight=ui.nextInt();
		
		cal1 ob1=new cal1(height,weight);
		ob1.result();
		System.out.println("bmi is "+ob1.d);
	}

}

class cal1{
	double a,b,c,d;
	cal1(double a1,int b1){
		a=a1;
		b=b1;
	}
	void result()
	{
		c=a*a;
		d=b/c;
	}
}
