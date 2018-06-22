package overloading;

import java.util.Scanner;

public class ques2 {
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
		comp o1=new comp();
		o1.small(num1,num2,num3);
	}

}

class comp{
	float a,b,c;
	void small(float a1,float b1,float c1){
		a=a1;
		b=b1;
		c=c1;
		if(a<b){
			if(a<c){
				System.out.println("the smallest number is "+a);
			}
			else{
				System.out.println("the smallest number is "+c);
			}
			}
			else
			{
				if(b<c){
					System.out.println("the smallest number is "+b);
					
				}
				else{
					System.out.println("the smallest number is "+c);
				}
			}
		}
	}

