public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr={1,10,2,3,4,5,6,7,8,9};
	int i,sum=0;
	float avg;
	for(i=0;i<arr.length;i++){
		sum=sum+arr[i];
	}
	avg=sum/arr.length;
	System.out.println(avg);
	
	}

}
