import java.util.Scanner;

public class ques3 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the three numbers");
		double num1=ui.nextDouble();
		double num2=ui.nextDouble();
		double num3=ui.nextDouble();
		cal ob1=new cal(num1,num2,num3);
		ob1.result();
		System.out.println("result is "+ob1.e);
	}

}

class cal{
	double a,b,c,d,e;
	cal(double a1,double b1,double c1){
		a=a1;
		b=b1;
		c=c1;
	}
	void result()
	{
		d=a+b+c;
		e=d/2;
	}
}
