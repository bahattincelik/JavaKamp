package videoExamples;

public class Example05_FindNumber {

	public static void main(String[] args) {
		int numbers[]= {1,2,5,7,9,10};
		int find = 4;
		boolean isThere=false;
		 
		for (int i = 0; i < numbers.length; i++) {
			if (find==numbers[i]) {
				isThere=true;
				break;
			}
		}
		if (isThere) {
			System.out.println("Sayi Vardir");
		} else {
			System.out.println("Sayi Yoktur");
		}

	}

}
