public class last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1={"ram","shayam"};
		String[] s2={"shayam","mohan"};
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals(s2[j]))
				{
					System.out.println(s1[i]);
				}
			}
		}
		
	}

}
