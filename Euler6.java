
public class Euler6 {
	public static void main(String[] args){
		int sumOfSqr = 0;
		int difference = 0;
		
		for(int i = 1; i < 101; i++){
			sumOfSqr += i*i;
		}
		difference =  (5050 * 5050) - sumOfSqr ; 
		System.out.println(difference);
	}
}
