package week_1_hw.asalSayi;

public class Main {

	public static void main(String[] args) {
		int number=19;
		if (number<1) {
			System.out.println("geçersiz sayı");
		}
		else if (number==1) {
			System.out.println("Sayı asal değildir");
		}
		else if (number==2) {
			System.out.println("Sayı asaldır");
		}
		else {
			for (int i=2;i<=(number/2);i++) {
				if(number%i==0) {
					System.out.println("Sayı asal değildir");
					break;
				}
				else {
					if(i==(number/2)) {
						System.out.println(number+" sayısı asaldır");
					}
				}
				
				
				
			}
			
		}
		
		
		

	}

}
