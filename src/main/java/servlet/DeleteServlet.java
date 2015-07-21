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
 * Created by ооо on 21.07.2015.
 */
@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
    int id;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        id = Integer.decode(request.getParameter("id"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request, response);
        TableDao tableDao = new TableDaoImpl();
        tableDao.delete(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Blog");
        dispatcher.forward(request, response);
    }
}
