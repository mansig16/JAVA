package overloading;

import java.util.Scanner;

public class ques3 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		String a=ui.nextLine();
		int strlength=a.length();
		
		middle o1=new middle(a);
		o1.one(strlength);

	}

}

class middle{
	int l;
	String r;
	middle(String f){
		r=f;
	}
	void one(int m){
		l=m;
		if(l%2==0){
			
			System.out.println("the middle characters of the string are "+r.charAt(l/2-1));
			System.out.println(r.charAt(l/2));
			
		}
		else
		{
			System.out.println("the middle character is "+r.charAt(l/2));
		}
	}
}
