import java.util.Scanner;

public class ques2 {
	static Scanner ui=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		System.out.println("enetr the digits");
		for(int i=0;i<arr.length-1;i++){
			arr[i]=ui.nextInt();
		}
		System.out.println("enter the number u wnt to enter and the place where");
		int num=ui.nextInt();
		int pos=ui.nextInt();
		for(int j=arr.length-2;j>=pos-1;j--){
			
			arr[j+1]=arr[j];
		}
		arr[pos-1]=num;
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}

}
