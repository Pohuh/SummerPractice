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
 * Created by Pohuh on 15.07.2015.
 */
@WebServlet("/Comments")
public class Comments extends HttpServlet {
    String comment = "99";
    String id = "99";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        comment = request.getParameter("comment");
        id = request.getParameter("id");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request, response);
        request.setAttribute("id", id);
        AddComm(id, comment);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Article");
        dispatcher.forward(request, response);
    }

    public static void AddComm(String id, String comment) {
        DBWorker worker = new DBWorker();
        String queryA = "INSERT INTO comments (id_c, comm) VALUES (" + id + ", '" + comment + "');";
        Statement statement;
        if (comment != "") {
            try {
                statement = worker.getConnection().createStatement();
                statement.addBatch(queryA);
                statement.executeBatch();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}