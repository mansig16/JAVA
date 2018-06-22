package overloading;

public class pent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,t;
		System.out.println("first fifty pentagonal numbers are");
		for(i=1;i<=50;i++){
			t=(i*(3*i-1))/2;
			
			System.out.print(t+"\t");
			if(i%10==0){
				System.out.print("\n");
			}
		}
	}

}
