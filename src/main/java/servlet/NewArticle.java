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
@WebServlet("/NewArticle")
public class NewArticle extends HttpServlet {
    String title = "";
    String text = "";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        title = request.getParameter("title");
        text = request.getParameter("text");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request, response);
        AddArc(title, text);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Blog");
        dispatcher.forward(request, response);
    }
    public static void AddArc(String title, String text) {
        DBWorker worker = new DBWorker();
        String queryA = "INSERT INTO articles (title, text) VALUES ('" + title + "' , '" + text + "');";
        Statement statement;
        if ((title != "")&(text != "")) {
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
