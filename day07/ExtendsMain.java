package kr.ac.kopo.day07;

class One {
	One() {
		System.out.println(1);
	}
}

class Two extends One {
	Two() {
		System.out.println(2);
	}
}

class Three extends Two {
	Three() {
		System.out.println(3);
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
//		new One();
//		new Two();
		new Three();
	}
}
