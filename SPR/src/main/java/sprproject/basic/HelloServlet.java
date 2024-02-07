package sprproject.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") //name = 서블릿 이름, urlPattern = url 매핑
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + req);
        System.out.println("response = " + res);

        String username = req.getParameter("username");
        System.out.println("username = " + username); //get방식으로 변수 받음

        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");
        res.getWriter().write("hello" + username); //html body에 값 들어감
    }
}
