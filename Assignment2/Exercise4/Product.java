
public final class Product {
    private final String pName;
    private final String pDescription;
    private final double pPrice;
    private final double maxOrder;

    public String getpName() {
        return pName;
    }

    public String getpDescription() {
        return pDescription;
    }

    public double getpPrice() {
        return pPrice;
    }

    public double getMaxOrder() {
        return maxOrder;
    }

    public Product(String pName, String pDescription, double pPrice, double maxOrder) {
        this.pName = pName;
        this.pDescription = pDescription;
        this.pPrice = pPrice;
        this.maxOrder = maxOrder;
    }

    @Override
    public String toString() {
        return "Product{" + "pName='" + pName + '\'' + ", pDescription='" + pDescription + '\'' + ", pPrice=" + pPrice + ", maxOrder=" + maxOrder + '}';
    }

}
