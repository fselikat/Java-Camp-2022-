package week_1_hw.arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Fatma";
		String student2 = "Afra";
		String student3 = "Selim";
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		String [] students= new String [3];
		students[0]="Selika";
		students[1]="Emine";
		students[2]="Mehmet";
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		for (String student:students) {
			System.out.println(student);
		}
		
	}

}
