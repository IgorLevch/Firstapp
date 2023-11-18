package spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring2");
        Cart cart = context.getBean(Cart.class);
        cart.createOrder(1);

        context.close();



    }
}
