
public class Euler5 {

	public static void main(String[] args) {
		boolean found;

		for (int i = 20; i < 1000000000; i++) {

			if (found(i)) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("end");
	}

	public static boolean found(int x){
		for (int i = 1; i < 21; i++) {
			if (x % i != 0) {
				return false;
			}
		}
		
		return true;
	}

}
