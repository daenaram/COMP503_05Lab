
public class sum {


	static int sum(int[] array) {
		int num = 0;
		for(int i=0; i<array.length ; i++) {
			 num = num + array[i];
			 
		}
		if (num <= 0) {
			 return 0;
		 }
		 else {
			 return num;
		 }
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[]{}));

	}

}
