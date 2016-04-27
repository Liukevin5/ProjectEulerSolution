
public class Euler2 {
	public static void main(String[] args) {
		long x = 1;
		long y = 2;
		long z = 0;
		long sum = 2;
		for (int i = 0; i < 45; i++) {
			z = x + y;
			x = y;
			y = z;

			if(z % 2 == 0 && z < 4000000){
				sum += z;
			}
		}
		
		System.out.println(sum);
	}
}
