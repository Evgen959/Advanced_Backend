public class Book implements Comparable<Book>{
    private String author;
    private String titl;
    private int year;
    private double price;

    public Book(String author, String titl, int year, double price) {
        this.author = author;
        this.titl = titl;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", titl='" + titl + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getTitl() {
        return titl;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book o) {   //параметр сортировки
        int res =  author.compareTo(o.author);
        if (res==0){
            return this.year-o.year;
        }
        return res;
    }
}
