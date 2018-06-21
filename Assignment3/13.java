import java.util.Random;

public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HERE COMES THE DICE!");
		Random r=new Random();
		int x=1+r.nextInt(6);
		System.out.println("roll #1 "+x);
		int y=1+r.nextInt(6);
		System.out.println("roll #2 "+y);
		int ans;
		ans=x+y;
		System.out.println("the total is "+ans);
		
	}

}
