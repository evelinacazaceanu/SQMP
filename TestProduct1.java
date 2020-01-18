import static org.junit.Assert.*;

import org.junit.Test;

public class TestProduct1 {

		@Test
		public void testContructor() {
			String description = "TV";
			double price = 1200;
			double discount = 5;
			Product object = new Product(description, price, discount);
			assertEquals(description, object.getDescription());
			assertEquals(price, object.getPrice(), 0.01);
			assertEquals(discount, object.getDiscount(), 0.01);
		}

	
	    @Test
	    public void TestSetDescription() {
	        String description = "Laptop";
	        Product object = new Product();
	        object.setDescription(description);
	        assertEquals(description, object.getDescription());
	    }
	    
}
