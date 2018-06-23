import java.util.Scanner;

public class ques1 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int i,a;
		System.out.println("enter the numbers");
		for(i=0;i<10;i++){
			
			arr[i]=ui.nextInt();
			
		}
		System.out.println("enter the number u wnt to remove");
		a=ui.nextInt();
		for(i=0;i<arr.length;i++){
			if(arr[i]==a){
				for(int j=i;j<arr.length-1;j++){
					
				arr[j]=arr[j+1];
				arr[j+1]=0;
				}
			}
			
			System.out.println(arr[i]);
		
		}
		
	}

}
