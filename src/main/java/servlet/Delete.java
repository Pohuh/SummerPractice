package servlet;

import model.DBWorker;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Pohuh on 17.07.2015.
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
    String id = "99";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        id = request.getParameter("id");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request, response);
        DelArc(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Blog");
        dispatcher.forward(request, response);
    }

    public static void DelArc(String id) {
        DBWorker worker = new DBWorker();
        String queryA = "DELETE FROM articles WHERE id = " + id + ";";
        Statement statement;
        try {
            statement = worker.getConnection().createStatement();
            statement.addBatch(queryA);
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
