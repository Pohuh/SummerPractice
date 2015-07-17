package servlet;

import model.DBWorker;
import model.Table;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ооо on 14.07.2015.
 */
@WebServlet("/Blog")
public class ServletControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ArrayList<Table> tables= tableA();
        if (tables != null) {
        request.setAttribute("listResults", tables);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
        }
    }

    public static ArrayList<Table> tableA() {
        DBWorker worker = new DBWorker();
        String queryA = "Select * from articles";
        Statement statement;
        ArrayList<Table> tables = new ArrayList<Table>();
        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);
            while (resultSetA.next()) {
                Table tableArticles = new Table();
                tableArticles.setId(resultSetA.getInt(1));
                tableArticles.setData(resultSetA.getString(2));
                tableArticles.setTitle(resultSetA.getString(3));
                tableArticles.setText(resultSetA.getString(4));
                tables.add(tableArticles);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }
}
