
public class found {
	
	static boolean found(boolean[] array) {
		
		for (boolean value : array) {
			if(!value) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(found(new boolean[]{true,true,true}));
		System.out.println(found(new boolean[]{true,false,true}));
		System.out.println(found(new boolean[]{true,true,true,true}));
	}

}
