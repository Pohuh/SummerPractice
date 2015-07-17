package servlet;

/**
 * Created by Pohuh on 15.07.2015.
 */
<<<<<<< HEAD

=======
>>>>>>> d6e8c1b6f415c4634dcb7e188a33d58bb1239aef
import model.DBWorker;
import model.Table;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/Article")
public class Article extends HttpServlet {
<<<<<<< HEAD
    String id = "99";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        id = request.getParameter("id");
=======
    String id="";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        id=request.getParameter("id");
>>>>>>> d6e8c1b6f415c4634dcb7e188a33d58bb1239aef
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
<<<<<<< HEAD
        response.setContentType("text/html;charset=UTF-8");
        Table tables = tableA(id);
        ArrayList<Table> comments = tableB(id);
        if (tables != null) {
            request.setAttribute("article", tables);
            request.setAttribute("CommentsList", comments);
=======
        response.setContentType("text/html");
        Table tables=tableA();
        if (tables != null) {
            //request.setAttribute("listResults", tables);
            request.setAttribute("getTitle", id);
            request.setAttribute("getText", tables.getText());
>>>>>>> d6e8c1b6f415c4634dcb7e188a33d58bb1239aef
            RequestDispatcher dispatcher = request.getRequestDispatcher("/app/view/Article.jsp");
            dispatcher.forward(request, response);
        }
    }
<<<<<<< HEAD

    public static Table tableA(String id) {
        DBWorker worker = new DBWorker();
        int var = Integer.decode(id);
        String queryA = "Select * from articles where id = " + var + ";";
=======
    public static Table tableA() {
        DBWorker worker = new DBWorker();
        String queryA = "Select * from articles where id=this.id";
>>>>>>> d6e8c1b6f415c4634dcb7e188a33d58bb1239aef
        Statement statement;
        Table tables = new Table();
        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);
<<<<<<< HEAD
            resultSetA.next();
            tables.setId(resultSetA.getInt(1));
            tables.setData(resultSetA.getString(2));
            tables.setTitle(resultSetA.getString(3));
            tables.setText(resultSetA.getString(4));
        } catch (SQLException e1) {
=======
                tables.setId(resultSetA.getInt(1));
                tables.setData(resultSetA.getString(2));
                tables.setTitle(resultSetA.getString(3));
                tables.setText(resultSetA.getString(4));
            } catch (SQLException e1) {
>>>>>>> d6e8c1b6f415c4634dcb7e188a33d58bb1239aef
            e1.printStackTrace();
        }
        return tables;
    }
<<<<<<< HEAD

    public static ArrayList<Table> tableB(String id) {
        DBWorker worker = new DBWorker();
        int var = Integer.decode(id);
        String queryB = "Select * from comments where id_c = " + var + ";";
        Statement statement;
        ArrayList<Table> comments = new ArrayList<Table>();
        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryB);
            while (resultSetA.next()) {
                Table comment = new Table();
                comment.setIdc(resultSetA.getInt(1));
                comment.setNum(resultSetA.getInt(2));
                comment.setComm(resultSetA.getString(3));
                comments.add(comment);
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return comments;
    }
}
=======
}
>>>>>>> d6e8c1b6f415c4634dcb7e188a33d58bb1239aef
