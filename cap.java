
public class cap {
	static boolean cap(char[] array) {
		
		for (char let : array) {
			if (let < 'A' || let > 'Z') {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cap(new char[]{'A','B','C'})); 
		System.out.println(cap(new char[]{'A','B','C','9'})); 
		System.out.println(cap(new char[]{'A','B','C','D','x'}));
	}

}
