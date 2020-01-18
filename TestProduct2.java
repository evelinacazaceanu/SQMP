import static org.junit.Assert.*;

import org.junit.Test;

public class TestProduct2 {

	 @Test
	    public void TestSetPrice() {
	        double price = 1500;
	        Product object = new Product();
	        object.setPrice(price);
	        assertEquals(price, object.getPrice(), 0.01);
	    }
	 
	    @Test
	    public void TestSetDiscount() {
	        double discount = 10;
	        Product object = new Product();
	        object.setDiscount(discount);
	        assertEquals(discount, object.getDiscount(), 0.01);
	    }
	 
}
