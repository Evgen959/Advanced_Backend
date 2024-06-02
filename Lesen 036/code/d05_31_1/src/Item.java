import java.util.ArrayList;
import java.util.List;

public class Item {
    private final String title;
    private double price;
    private  int quantity;
    private final int weight;
    private final String size;
    private final String color;
    private final String dateExpire;
    private final String brand;
    private final List<String> compound;

    public static class Builder{
        private String title;
        private double price;
        private  int quantity;
        private int weight;
        private String size;
        private String color;
        private String dateExpire;
        private String brand;
        private List<String> compound;

        public Builder(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public Builder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }
        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }
        public Builder size(String size){
            this.size = size;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder dateExpire(String dateExpire){
            this.dateExpire = dateExpire;
            return this;
        }
        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }
        public Builder compound(List<String> compound){
            this.compound = compound;
            return this;
        }
        public Builder oneComponent(String component){
            if (compound==null){
                compound = new ArrayList<>();
            }
            compound.add(component);
            return this;
        }

        public Item build(){
            return new Item(this);
        }
    }

    public Item(Builder builder) {
        this.title = builder.title;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.weight = builder.weight;
        this.size = builder.size;
        this.color = builder.color;
        this.dateExpire = builder.dateExpire;
        this.brand = builder.brand;
        this.compound = builder.compound;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", dateExpire='" + dateExpire + '\'' +
                ", brand='" + brand + '\'' +
                ", compound=" + compound +
                '}';
    }
}
