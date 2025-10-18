
public class RetreiveArrayValueUsingForAndEnhancedLoop {

	public static void main(String[] args) {
	String names[]= {"John","David","Smith","Wick","Harry"};	
	System.out.println("Using for loop:");
	for(int i=1;i<3;i++) {
		System.out.println(names[i]);
	}
	System.out.println("Using enhanced for loop:");
	for(String name:names) {
		System.out.println(name);
	}
	}

}
