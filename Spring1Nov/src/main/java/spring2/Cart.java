package spring2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class Cart {

    @Autowired
    private ProductService pS;

    private FileOutputStream fileOut;


    public Cart(ProductService pS, FileOutputStream fileOut) {
        this.pS = pS;
        this.fileOut = fileOut;
    }

    public void createOrder(Integer productID){
        System.out.println("Order is done: ");
        System.out.println(pS.getTitleById(productID));

        try {
            fileOut.write(pS.getTitleById(productID).getBytes(StandardCharsets.UTF_8));
            fileOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
