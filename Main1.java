interface MyInterface1{
	void operation(int i, int j);
}

public class Main1{
	public static void main(String[] args) {
		/*
		* En kucuk ortak carpan kodunuzu buraya yazin.
		* MyInterface1 adi m1 olmali.
		*/
		MyInterface1 m1 = (x, y) -> {
			int gcd = 1;
			for(int i = 1; i <= x && i <= y; ++i) {
				if(x % i == 0 && y % i == 0)
					gcd = i;
			}

			System.out.println((x * y) / gcd);
		};
		m1.operation(5, 2); //10
		m1.operation(5, 5); //5
		m1.operation(5, 1); //5
		
		System.out.println("********");
		
		/*
		* En buyuk ortak bolen kodunuzu buraya yazin.
		* MyInterface1 adi m2 olmali.
		*/
		MyInterface1 m2 = (x, y) -> {
			int gcd = 1;
			for(int i = 1; i <= x && i <= y; ++i) {
				if(x % i == 0 && y % i == 0)
					gcd = i;
			}
			System.out.println(gcd);
		};
		m2.operation(5, 2); //1
		m2.operation(5, 5); //5
		m2.operation(5, 1); //1
	}
}
