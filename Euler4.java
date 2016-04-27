import java.util.ArrayList;
import java.util.Collections;

public class Euler4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int prod = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				
				prod = i * j;
				if (palindrome(prod)) {
					list.add(prod);
				}

			}
		}
		
		Collections.sort(list);
		System.out.println(list.remove(list.size()-1));
		
		
	}

	public static boolean palindrome(int x) {
		String num = "" + x;
		String numR = "";
		for (int i = 0; i < num.length(); i++) {
			numR = numR + num.charAt(num.length() - 1 - i);
		}
		if (num.equals(numR)) {
			return true;
		}
		return false;
	}
}
