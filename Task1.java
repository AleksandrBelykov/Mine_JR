
public class Task1 {
   	    int number;
		String culture;
		int age;
		
		public Task1 () {
		}
		
		public Task1 (int number) {
			this.number = number;
			
		}
		
		public Task1 (int number, String culture) {
			this.number = number;
			this.culture = culture;
		}

		public Task1 (int number, String culture, int age) {
			this.number = number;
			this.culture = culture;
			this.age = age;
		}
		
		public static void main(String[] args) {
	    	
			Task1 artifact1 = new Task1 (212121);
	    	System.out.println("�������� 1: ���������� �����: " + artifact1.number);
	    	
	    	Task1 artifact2 = new Task1 (212121, "������");
	    	System.out.println("�������� 2: ���������� �����: " + artifact2.number + "; ��������: " + artifact2.culture);
	    	
	    	Task1 artifact3 = new Task1 (212121, "������", 12);
	    	System.out.println("�������� 2: ���������� �����: " + artifact3.number + "; ��������: " + artifact3.culture + "; ���: " + artifact3.age);
	    	
	    }
	
}
