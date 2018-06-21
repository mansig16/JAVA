package practise;

import java.util.Random;
import java.util.Scanner;

public class ques9 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int x;
		int my;
		int count=0;
		do{
	    x=1+r.nextInt(100);
		System.out.println("i have choosen a number between 1 and 100.try to guess it");
		
		System.out.println("your guess ");
		my=ui.nextInt();
		count++;
		if(x!=my && count<7)
		{
			System.out.println("this is incorrect.guess again ");
			if(x<my){
				System.out.println(" the number u guessed is too high");
			}
			else if(x>my)
			{
				System.out.println("the number u guessed is two low");
			}
		}
		
		else if(x==my){
			System.out.println("your guess is correct.your game stops!");
			break;
		}
		else if(count==7)
		{
			System.out.println("your count is equal to 7.your game stops.");
			break;
		}
		
		}while(x!=my);
		
	}

}

