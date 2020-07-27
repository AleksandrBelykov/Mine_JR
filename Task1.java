
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
	    	System.out.println("артефакт 1: порядковый номер: " + artifact1.number);
	    	
	    	Task1 artifact2 = new Task1 (212121, "Ацтеки");
	    	System.out.println("артефакт 2: порядковый номер: " + artifact2.number + "; культура: " + artifact2.culture);
	    	
	    	Task1 artifact3 = new Task1 (212121, "Ацтеки", 12);
	    	System.out.println("артефакт 2: порядковый номер: " + artifact3.number + "; культура: " + artifact3.culture + "; век: " + artifact3.age);
	    	
	    }
	
}
