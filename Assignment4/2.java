package overloading;

import java.util.Scanner;

public class ques1 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2,num3;
		System.out.println("input the first number:");
		num1=ui.nextFloat();
		System.out.println("input the second number:");
		num2=ui.nextFloat();
		System.out.println("input the third number:");
		num3=ui.nextFloat();
		avg o1=new avg();
		o1.add(num1,num2,num3);
	}

}

class avg{
	float a,b,c,d;
	void add(float a1,float b1,float c1){
		a=a1;
		b=b1;
		c=c1;
		d=(a+b+c)/3;
		System.out.println("the average value is "+d);
		
	}
} 