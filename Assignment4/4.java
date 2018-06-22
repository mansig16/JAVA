package overloading;

import java.util.Scanner;

public class ques7 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		String a=ui.nextLine();
		int str=a.length();
		len o1=new len(a);
		o1.vowel(str);
		}

}

class len{
	int l;
	String b;
	len(String c){
		b=c;
	}
	void vowel(int n){
		l=n;
		int count=0,i;
		char ch;
		
		for(i=0;i<l;i++){
			ch=b.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			count++;	
			}
		}
		System.out.println("no of vowels are "+count);
	}
}
