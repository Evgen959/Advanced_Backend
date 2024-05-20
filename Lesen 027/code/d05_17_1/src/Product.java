public class Product {
    private String title;
    private double price;
    private  double rating;
    private int quantity;

    public Product(String title, double price, double rating, int quantity) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        String str = String.format("%-30s [%10.2f] рейтинг: %.1f количество: %d",title,price,rating,quantity );
        return  str;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }
}
