package servlet;

import model.dao.TableDao;
import model.dao.impl.TableDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Pohuh on 17.07.2015.
 */

@WebServlet("/Comments")
public class CommentsServlet extends HttpServlet {
    String comment;
    int id;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        comment = request.getParameter("comment");
        id = Integer.decode(request.getParameter("id"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request, response);
        request.setAttribute("id", id);
        if (comment != ""){
            TableDao tableDao = new TableDaoImpl();
            tableDao.addC(id, comment);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Post");
        dispatcher.forward(request, response);

    }
}
