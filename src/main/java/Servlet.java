import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name="ServletTest",urlPatterns = "/test")

public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result=req.getParameter("Type");
        List<String> x =new ArrayList<>();
        if(result.equals("A"))
            x.add("A");
        else if(result.equals("B"))
            x.add("B");
        else
            x.add("C");

        req.setAttribute("brands", x);
        RequestDispatcher view = req.getRequestDispatcher("result.html");
        view.forward(req, resp);
    }
}
