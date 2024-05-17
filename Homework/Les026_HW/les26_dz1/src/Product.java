public class Product {
    private String title;
    private int rating;
    private double price;
    private int quantity;

    public Product(String title, int rating, double price, int quantity) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return title
                + " rating:" + rating + "(5) "
                + "price:" + price + " $," +
                " quantity:" + quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
