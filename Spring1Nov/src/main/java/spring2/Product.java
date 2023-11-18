package spring2;

public class Product {

    Integer id;
    String title;
    Integer price;

    public Product(Integer id, String title, Integer price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
