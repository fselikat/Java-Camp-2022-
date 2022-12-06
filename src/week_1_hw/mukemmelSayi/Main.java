package week_1_hw.mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=27;
		if (sayi==1) {
			System.out.println("Sayı mükemmel değil");
			
		}
		else if (sayi>1) {
			int toplam =0;
			for (int i = 1;i<=(sayi/2);i++) {
				if (sayi%i==0) {
					toplam+=i;
				}
			}
			if (toplam == sayi) {
				System.out.println("Sayı mükemmel sayıdır");
			}
			else {
				System.out.println("Sayımükemmel sayı değildir");
			}
		}
		else {
			System.out.println("Geçersiz sayı, pozitif sayı girin");
		}

	}

}
