package practise;

public class buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=100;i++) 
		{
			// loop to print i is started
			if(i%3==0 && i%5==0)
				// condition is checked
			{
				System.out.println("fizz buzz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else
			{
				System.out.println(i);
			}
		}	

	}

}