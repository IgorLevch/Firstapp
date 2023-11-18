package spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {


    @Autowired
    private ProductRepository prodRep;


    public String getTitleById(Integer id){
        return prodRep.findById(id).getTitle();
    }






}
