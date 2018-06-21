package practise;

import java.util.Random;
import java.util.Scanner;

public class blackjack {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Baby Blackjack!");
		System.out.println("pick two numbers from 1 to 10 for urself");
		a=ui.nextInt();
		b=ui.nextInt();
		input ob1=new input(a,b);
		
		System.out.println("you drew "+a+" and "+b);
		ob1.player();
		System.out.println("your total is "+ob1.c);
		Random r=new Random();
		System.out.println("pick two numbers from 1 to 10 for dealer");
		int x=1+r.nextInt(10);
		int y=1+r.nextInt(10);
		input ob2=new input(x,y);
		System.out.println("dealer has "+x+"and "+y);
		ob2.player();
		System.out.println("dealers total is "+ob2.c);
		
		if(ob1.c>ob2.c){
			System.out.println("YOU WIN");
		}
		else if(ob1.c==ob2.c){
			System.out.println("DRAW");
		}
		else
		{
			System.out.println("YOU LOST");
		}
	}

}

class input{
	int a,b,c;
	input(int e,int f)
	{
		c=0;
		a=e;
		b=f;
	}
	void player(){
		c=a+b;
	}
	
}
