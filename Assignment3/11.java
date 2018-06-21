package practise;

import java.util.Random;
import java.util.Scanner;

public class ques6 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int x;
		int my;
		
	    x=1+r.nextInt(10);
		System.out.println("i m thinking of a number between 1 and 10");
		
		System.out.println("your guess ");
		my=ui.nextInt();
		if(x==my){
			System.out.println("thats right! my secret number was "+my);
			
		}
		else
		{
			System.out.println("sorry,but i was really thinking of "+x);
		}
		
		
	}

}
