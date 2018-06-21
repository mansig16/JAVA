
import java.util.Random;

public class du {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HERE COMES THE DICE!");
		Random r=new Random();
		int x,y;
		
		do{
		 x=1+r.nextInt(6);
		System.out.println("roll #1 "+x);
		 y=1+r.nextInt(6);
		System.out.println("roll #2 "+y);
		if(x==y){
			break;
		}
		}while(x!=y);
	}

}
