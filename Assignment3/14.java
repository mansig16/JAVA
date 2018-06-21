package practise;

import java.util.Random;
import java.util.Scanner;

public class ques7 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int x;
		int my;
		do{
	    x=1+r.nextInt(10);
		System.out.println("i have choosen a number between 1 and 10.try to guess it");
		
		System.out.println("your guess ");
		my=ui.nextInt();
		if(x==my){
			System.out.println("thats right! you are a good guesser");
			
		}
		else
		{
			System.out.println("this is incorrect.guess again ");
		}
		}while(x!=my);
		
	}

}
