package week_1_hw.sayiBulma;

public class Main {

	public static void main(String[] args) {
		int []sayilar = new int [] {1,2,5,7,9};
		int aranan=6;
		boolean varMi=false;
		for (int sayi:sayilar) {
			if (sayi==aranan) {
				varMi=true;
				System.out.println(aranan+" sayısı  sayılar dizisinde var");
				break;
			}
			
		}
		if(varMi==false) {
			System.out.println("Sayı dizide yok");
		}
	}

}
