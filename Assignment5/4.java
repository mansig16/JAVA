import java.util.Scanner;

public class ques5 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		System.out.println("enter the aray");
		for(int i=0;i<arr.length;i++){
			arr[i]=ui.nextInt();
		}
		System.out.println("after reversing");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		
	}

}
