package overloading;

import java.util.Scanner;

public class pass {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.a password must have atleast 8 characters.");
		System.out.println("2.a password consists of only letters and digits.");
		System.out.println("3.a password must contain atleast 2 digits");
		System.out.println("input your password(you agree to all terms and conditions)");
		String b=ui.nextLine();
		word o1=new word();
		o1.check(b);
	}	

}

class word{
	String l;
	void check(String m){
		l=m;
		int s,i,count=0;
		char ch;
		s=l.length();
		
		if(s<8){
			System.out.println("password is invalid");
		}
		else{
			for(i=0;i<s;i++){
				ch=l.charAt(i);
				if(Character.isLetter(ch)){
					
				}
				else if(Character.isDigit(ch))
				{
					count++;
					
					
				}
				else
				{
					System.out.println("password is invalid");
					return;
				}
			}
			if(count>=2){
				
			System.out.println("password is valid "+l);
			}
			
		}
		
	}
}
