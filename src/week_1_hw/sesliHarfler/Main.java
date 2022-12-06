package week_1_hw.sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='A';
		char [] kalinSesler= {'a','ı','o','u','A','I','O','U'};
		char [] inceSesler = {'e','i','ö','ü','E','İ','Ö','Ü'};
		for(char a:kalinSesler) {
			if(harf == a) {
				System.out.println("Harf kalın seslidir.");
				break;
			}
		}
		for(char a:inceSesler) {
			if(harf == a) {
				System.out.println("Harf ince seslidir.");
				break;
			}
		}
	}

}
