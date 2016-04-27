import java.math.BigInteger;
public class Euler8 {
	
	public static void main(String[] args) {
		BigInteger num;
		BigInteger max = new BigInteger("0");
		String bigNum = "73167176531330624919225119674426574742355349194934969835203"
				+ "12774506326239578318016984801869478851843858615607891129494954595017379583"
				+ "3195285320880551112540698747158523863050715693290963295227443043557668966489"
				+ "504452445231617318564030987111217223831136222989342338030813533627661428280644448"
				+ "66452387493035890729629049156044077239071381051585930796086670172427121883998797908792"
				+ "274921901699720888093776657273330010533678812202354218097512545405947522435258490771167"
				+ "05560136048395864467063244157221553975369781797784617406495514929086256932197846862248283"
				+ "97224137565705605749026140797296865241453510047482166370484403199890008895243450658541227"
				+ "58866688116427171479924442928230863465674813919123162824586178664583591245665294765456828"
				+ "48912883142607690042242190226710556263211111093705442175069416589604080719840385096245544"
				+ "43629812309878799272442849091888458015616609791913387549920052406368991256071760605886116"
				+ "46710940507754100225698315520005593572972571636269561882670428252483600823257530420752963"
				+ "450";
		BigInteger x1;
		BigInteger x2;
		BigInteger x3;
		BigInteger x4;
		BigInteger x5;
		BigInteger x6;
		BigInteger x7;
		BigInteger x8;
		BigInteger x9;
		BigInteger x10;
		BigInteger x11;
		BigInteger x12;
		BigInteger x13;
		String conv;
		for(int i = 0; i < bigNum.length()-13; i++){
			conv = "" + bigNum.charAt(i);
			x1 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+1);
			x2 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+2);
			x3 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+3);
			x4 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+4);
			x5 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+5);
			x6 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+6);
			x7 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+7);
			x8 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+8);
			x9 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+9);
			x10 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+10);
			x11 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+11);
			x12 = new BigInteger(conv);
			conv = "" + bigNum.charAt(i+12);
			x13 = new BigInteger(conv);
			
			num = new BigInteger("1");
			num = x1.multiply(x2).multiply(x3).multiply(x4).multiply(x5)
					.multiply(x6).multiply(x7).multiply(x8).multiply(x9)
					.multiply(x10).multiply(x11).multiply(x12).multiply(x13);
			max = max.max(num);
		}
		
		System.out.println(max);

	}
}
