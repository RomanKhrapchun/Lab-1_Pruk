package Task_7;

public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price){
        this.price = price;
    }

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() { return String.format(" Product = {" +  "name='" + name + '\'' + ", price=" + price + '}');}
}
