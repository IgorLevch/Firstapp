package ru.geekbrains;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class BootstrapListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {



        ServletContext cs = sce.getServletContext();
         //ServletContext - это такая штука в Сервлет API, через которую
        // осуществляются все межкомпонентные взаимодействия

        ProductRepository pr = new ProductRepository();
        cs.setAttribute("pr", pr );
        // теперь миожно пойти в любой класс-сервлет, открыть там метод инит и вызвать в нем getServletContext():
        //  getServletContext().getAttribute("pr");
         pr.insert(new Product("product1"));
        pr.insert(new Product("product2"));
        pr.insert(new Product("product3"));
        pr.insert(new Product("product4"));
        pr.insert(new Product("product5"));
        pr.insert(new Product("product6"));

    }
}
