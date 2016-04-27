
public class Euler9 {
	public static void main(String[] args){
		double c;
		for(int i = 1; i < 1000; i++){
			for(int j = 1; j < 1000; j++){
				c = Math.sqrt(i*i + j*j);
				if(i + j + c == 1000){
					System.out.println(i + " " + j + " " + c);
					System.out.println((i * j * (int) c));
				}
			}
		}
	}
}
