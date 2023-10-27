package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// вывод продуктов через Листенера

@WebServlet(name="ThirdServlet", urlPatterns = "/th_servlet")
public class ThirdServlet extends HttpServlet {

    private ProductRepository pr;


    @Override
    public  void init(){
        this.pr = (ProductRepository) getServletContext().getAttribute("pr");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<h1>"+ pr.findAll() + "</h1>");
        resp.getWriter().printf("</body></html>");
    }

    }


