
public class Product {
	protected String description;
    protected double price;
    public double discount;


    public Product(String description, double price, double discount) {
        super();
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    public Product() {

    }

    void setPrice(double value) {
        this.price = value;
    }

    void setDescription(String value) {
        this.description=value;
    }

    void setDiscount(double value) {
        this.discount = value;
    }

    String getDescription(){
        return this.description;
    }

    double getPrice(){
        return this.price;
    }

    double getDiscount(){
        return this.discount;
    }
}
