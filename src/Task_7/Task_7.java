package Task_7;

public class Task_7 {
    static final ProductPair[] products = new ProductPair[]{
            new ProductPair(new Product("apple", 60), 5),
            new ProductPair(new Product("banana", 70), 5)
    };

    public static void main(final String[] args){
        for (int i = 0; i < products.length; i++){
            System.out.println("Name: " + products[i].getProduct().getName() + "; Price: "
                    + products[i].getProduct().getPrice() + " grn; Count: "
                    + products[i].getCount() + " counts " + " | Price of all products : " + products[i].fullPrice());
        }
    }
}
