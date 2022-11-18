import java.util.stream.IntStream;

interface MyInterface2{
	void operation(int i);
}

public class Main2{
	public static void main(String[] args) {
		/*
		* Asal sayi kodunuzu buraya yazin.
		* MyInterface2 adi m1 olmali.
		*/
		MyInterface2 m1 = (x) -> {
//			boolean flag = true;
//			for (int i = 2; i <= x / 2 || x == 0 || x == 1; ++i) {
//				if (x % i == 0 || x == 1) {
//					flag = false;
//					break;
//				}
//			}
//			System.out.println(flag);
			System.out.println(x > 1 && IntStream.range(2, x - 1).noneMatch(index -> x % index == 0));
		};
		m1.operation(5); //true
		m1.operation(1); //false
		m1.operation(2); //true
	}
}

