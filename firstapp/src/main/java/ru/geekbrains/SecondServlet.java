package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// вывод продуктов простой


@WebServlet(name="SecondServlet", urlPatterns = "/se_servlet")
public class SecondServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < 10 ; i++) {

           resp.getWriter().printf("<h1>id продукта №: "+ i + "</h1>");
            resp.getWriter().printf("<h1>Вес продукта: "+ i+10 + "</h1>");

        }
        resp.getWriter().printf("</body></html>");



    }
}
