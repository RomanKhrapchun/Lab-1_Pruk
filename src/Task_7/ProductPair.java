package Task_7;

public class ProductPair {
    private Product product;
    private int count;

    public ProductPair(final Product product, final int count) {
        this.product = product;
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public void setCount(final int count){
        this.count = count;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    @Override
    public String toString() { return String.format(" Product = {" + "product=" + product + ", count=" + count + '}'); }

    public int fullPrice() {
        return this.product.getPrice() * count;
    }
}
