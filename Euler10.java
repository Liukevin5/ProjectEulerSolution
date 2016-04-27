import java.math.BigInteger;
public class Euler10 {
	public static void main(String[] args){
		BigInteger sum = new BigInteger("2");
		
		for(int i = 3; i < 2000000; i+=2){
			if(primeCheck(i)){
				sum = sum.add(BigInteger.valueOf(i));
				System.out.println(i);
		
			}
			
		}
		System.out.println();
		System.out.println(sum);
	}
	
	
	public static boolean primeCheck(long x){
		
		if(x % 2 == 0){
			return false;
		}
		for(int i = 3; i < x; i+=2){
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}
}
