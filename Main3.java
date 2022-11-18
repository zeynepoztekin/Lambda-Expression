import java.util.ArrayList;

interface MyInterface3{
	void operation(ArrayList<String> alist);
}

public class Main3{
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("lorem");
		list1.add("ipsum");
		list2.add("addo");
		list2.add("adeo");

		/*
		* Toplam harf sayisini bulan kodunuzu buraya yazin.
		* MyInterface3 adi m1 olmali.
		*/
		MyInterface3 m1 = (list) -> {
			int count = 0;
			for (String s : list) {
				count += s.length();
			}
			System.out.println(count);
		};
		m1.operation(list1); //10
		m1.operation(list2); //8
		
		System.out.println("********");
		
		/*
		* Alfabetik sira kontrolu yapan kodunuzu buraya yazin.
		* MyInterface3 adi m2 olmali.
		*/
		MyInterface3 m2 = (list) -> {
			boolean sorted = true;
			for(int i = 0; i < list.size(); i++) {
				for(int j = i+1; j < list.size(); j++) {
					if (list.get(i).compareTo(list.get(j)) > 0) {
						sorted = false;
						break;
					}
				}
			}
			System.out.println(sorted);
		};

		m2.operation(list1); //false
		m2.operation(list2); //true
	}
}
