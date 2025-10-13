
public class ConditionalStatementExamples {

	public static void main(String[] args) {
		int age=17;
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
		System.out.println("End of the program");
		int total = 65;
		if(total>=90) {
			System.out.println("Grade A");
		}else if(total>=80) {
			System.out.println("Grade B");
		}else if(total>=70) {
			System.out.println("Grade C");
		}else {	
			System.out.println("Grade D");
		}
	}

}
