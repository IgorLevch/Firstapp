package spring2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
            new Product(1,"Milk",20),
              new Product(2,"Bread",15),
              new Product(3,"Potato",60),
              new Product(4,"Hamburger", 40),
              new Product(5,"Cheese",90)
        ));

    }

    public Product findById(Integer id){

        return products.stream().filter(p->p.getId().equals(id)).findFirst().orElseThrow(()->new RuntimeException());
    }




        }
