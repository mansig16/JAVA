package practise;

import java.util.Random;

public class fortune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int ran=1+r.nextInt(6);
		String a="you will find happiness with love";
		String b="you will get new car";
		String c="you will meet someone special";
		String d="you will get money";
		String e="you will find happiness";
		String f="you will get a holiday package to switzerland";
		System.out.println("pick a fortune cookie ");
		if(ran==1){
			System.out.println("fortune cookie says= "+a);
		}
		else if(ran==2){
			System.out.println("fortune cookie says= "+b);
		}
		else if(ran==3)
		{
			System.out.println("fortune cookie says= "+c);
		}
		else if(ran==4)
		{
			System.out.println("fortune cookie says= "+d);
		}
		else if(ran==5){
			System.out.println("fortune cookie says= "+e);
		}
		else
		{
			System.out.println("fortune cookie says= "+f);
		}
	}

}
