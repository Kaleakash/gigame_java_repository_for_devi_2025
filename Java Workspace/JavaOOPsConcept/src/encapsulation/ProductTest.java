package encapsulation;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod = new Product();
		prod.setId(1);
		prod.setName("Laptop");
		prod.setPrice(75000.00);
		
		Product prod2 = new Product(2, "Smartphone", 50000.00);
		
		System.out.println("Product ID: " + prod.getId());
		System.out.println("Product Name: " + prod.getName());
		System.out.println("Product Price: " + prod.getPrice());
		
		System.out.println("Product2 ID: " + prod2.getId());
		System.out.println("Product2 Name: " + prod2.getName());
		System.out.println("Product2 Price: " + prod2.getPrice());
	}

}
