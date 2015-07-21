package servlet;

import model.Table;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import static model.TableGet.*;

/**
 * Created by ооо on 20.07.2015.
 */
@WebServlet("/Post")
public class PostServlet extends HttpServlet {
    int id_c;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        id_c = Integer.decode(id);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
        response.setContentType("text/html;charset=UTF-8");
        Table tables = tableA(id_c);
        ArrayList<Table> comments = tableC(id_c);
        if (tables != null) {
            request.setAttribute("post", tables);
            request.setAttribute("CommentsList", comments);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/app/view/post.jsp");
            dispatcher.forward(request, response);
        }
    }
}
