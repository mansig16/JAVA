package practise;

import java.util.Scanner;

public class ques10 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("are you ready for the quiz");
		System.out.println("here it comes");
		int count=0;
		ques ob1=new ques();
		ob1.ques1();
		System.out.println("enter your ans");
		int x=ui.nextInt();
		if(x==3){
			System.out.println("thats right!");
			count++;
		}
		else{
			System.out.println("srry, wrong ans");
		}
		ob1.ques2();
		System.out.println("enter your ans");
		int y=ui.nextInt();
		if(y==2){
			System.out.println("thats right!");
			count++;
		}
		else{
			System.out.println("srry, wrong ans");
		}
		
		ob1.ques3();
		System.out.println("enter your ans");
		int z=ui.nextInt();
		if(z==2){
			System.out.println("thats right!");
			count++;
		}
		else{
			System.out.println("srry, wrong ans");
		}
		
		System.out.println("overall you got "+count+"out of 3 correct");
		System.out.println("Thanks for playing!!");
		
}
}

class ques{
	void ques1(){
		String a="Q1.what is the capital of Alaska?";
		System.out.println(a);
		System.out.println("1.melbourne");
		System.out.println("2.anchorage");
		System.out.println("3.juneau");
		
	}
	void ques2(){
		String b="Q2.Can you store the value \"cat\" in a variable of type int?";
		System.out.println(b);
		System.out.println("1.yes");
		System.out.println("2.no");
	}
	void ques3(){
		String c="Q3.What is the result of 9+6/3?";
		System.out.println(c);
		System.out.println("1.5");
		System.out.println("2.11");
		System.out.println("3.15/3");
	}
}
