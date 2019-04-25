package generics;

public class DiscountedProduct implements HasPrice {

    private HasPrice originalProduct;


    public DiscountedProduct(HasPrice originalProduct) {
        this.originalProduct = originalProduct;
    }

    @Override
    public double getPrice() {
        return originalProduct.getPrice() * 0.9;
    }

    @Override
    public void setPrice(double price) {

    }
}
