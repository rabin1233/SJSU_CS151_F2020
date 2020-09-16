
public class productTest {
    public static void main(String[] args) {
        Product obj = new Product("Remy Martin", "alcohol", 49, 55);
        System.out.println("Name of the product is: "+ obj.getpName());
        System.out.println("Description of the product is: " +obj.getpDescription());
        System.out.println("Price of the product is: $" +obj.getpPrice());
        System.out.println("Maximum quantity allowed to be ordered: " +obj.getMaxOrder());
    }
}
