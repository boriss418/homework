package eu.senla;

public class Main {
	
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static char g;
	static boolean h;
	
	static Byte aByte;
	static Short bShort;
	static Integer cInteger;
	static Long dLong;
	static Float eFloat;
	static Double fDouble;
	static Character gCharacter;
	static Boolean hBoolean;
	
	public static void main(String[] args) {
		
		byte a1 = 33;
		short b1 = 26;
		int c1 = 456;
		long d1 = 567;
		float e1=74;
		double f1 = 753;
		char g1 = 75;
		boolean h1 = true;
		
		Byte a2=94;
		Short b2 = 45;
		Integer c2= 83;
		Long d2= 93L;
		Float e2 = 843F;
		Double f2 = 832D;
		Character g2 = 54;
		Boolean h2 = false;
		
		Number number = new Number();
		number.setA((byte) 12);
		byte a = number.getA();
		System.out.println(a);
		
		number.setB((short) 2);
		short b = number.getB();
		System.out.println(b);
		
		number.setC((int)33);
		int c = number.getC();
		
		number.setD((long)55);
		long d = number.getD();
		
		number.setE((float)124);
		float e = number.getE();
		
		number.setF((double)12);
		double f = number.getF();
		
		number.setG((char)77);
		char g = number.getG();
		
		number.setH((boolean)false);
		boolean h = number.getH();
		
		
		byte x = (byte) a2;
		System.out.println(x);
		
		byte x1 = (byte) b1;
		System.out.println(x1);
		
		byte x2 = (byte) d1; // (long d1 = 567), result: x2 = 55
		System.out.println(x2);
		
		byte x3 = (byte) f1; // double f1 = 753; result: x2 = -15
		System.out.println(x3);
		 
		byte x4 = (byte) g1; 
		System.out.println(x4);
		
		//Long x5 = (Long) a2;// cannot cast from Byte to Long
		//System.out.println(x5);
		
		Long x5 = (Long) d1;
		System.out.println(x5);
		
		//Long x6 = (Long) f2;// cannot cast from Double to Long
		//System.out.println(x6);
		
		boolean x7 = (boolean) h2;
		System.out.println(x7);
		
		Boolean x8 = (Boolean) h1;
		System.out.println(x8);
		
		char x9 = (char) g2;//Character g2 = 54; result: x9 = 6
		System.out.println(x9);
		
		String q = "s";
		//char x10 = (char) q;// cannot cast from String to char
		//Character x10 = (Character) q;// cannot cast from String to Character
		
		Character r = 'w';
		char r1 = 'r';
		//String q1 = (String) r1;//cannot cast from char  to String
		
		
	}
	

}
