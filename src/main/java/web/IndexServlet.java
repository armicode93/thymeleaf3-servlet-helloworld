package web;


import config.util.TemplateEngineUtil;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class IndexServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("******* SERVLET INIT *******");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("******* SERVLET *******");

        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
        WebContext context = new WebContext(request, response, request.getServletContext());
        context.setVariable("recipient", "World");
        engine.process("home.html", context, response.getWriter());
    }

}
