package overloading;

import java.util.Scanner;

public class ques5 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr;
		System.out.println("enter the year");
		yr=ui.nextInt();
		leap o1=new leap();
		o1.check(yr);
	}

}

class leap{
	int y;
	void check(int x){
		y=x;
		if(y%4==0){
			if(y%100==0){
				if(y%400==0){
					System.out.println("true");
					
					
				}
				else
				{
					System.out.println("false");
				}
			}
			else
			{
				System.out.println("true");
			}
		}
		else
		{
			System.out.println("false");
		}
		
	}
}
