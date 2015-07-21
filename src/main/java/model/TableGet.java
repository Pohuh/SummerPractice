package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ооо on 16.07.2015.
 */
public class TableGet {


    public static ArrayList<Table> tableA() {
        DBWorker worker = new DBWorker();

        String queryA = "Select * from articles";
        Statement statement;
        ArrayList<Table> tables = new ArrayList<Table>();

        //Table tableArticles = null;
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

                //не забыть заменить на нужное >>
                //System.out.println(tableArticles.getId()); //пример вывода всех id
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

    public static Table tableA(int n) {
        DBWorker worker = new DBWorker();

        String queryA = "Select * from articles WHERE id=" + n;
        Statement statement;
        Table tableArticles = new Table();

        //Table tableArticles = null;
        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);

            while (resultSetA.next()) {
                //Table tableArticles = new Table();
                tableArticles.setId(resultSetA.getInt(1));
                tableArticles.setData(resultSetA.getString(2));
                tableArticles.setTitle(resultSetA.getString(3));
                tableArticles.setText(resultSetA.getString(4));

                //не забыть заменить на нужное >>
                //System.out.println(tableArticles.getId()); //пример вывода всех id
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableArticles;
    }

    public static ArrayList<Table> tableC(int n) {
        DBWorker worker = new DBWorker();

        String queryC = "Select * from comments WHERE id_c =" + n;
        Statement statement;
        ArrayList<Table> tables = new ArrayList<Table>();

        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetC = statement.executeQuery(queryC);

            while (resultSetC.next()) {
                Table tableComments = new Table();
                tableComments.setIdc(1);
                tableComments.setNum(resultSetC.getInt(2));
                tableComments.setComm(resultSetC.getString(3));
                tables.add(tableComments);
                //не забыть заменить на нужное >>
               // System.out.println(tableComments.getComm()); //пример вывода всех комментов
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

    public static void main(String[] args) {

      //  ArrayList<Table> table = tableC(4);
       // TableDao tableDao = new TableDaoImpl();
       // tableDao.addC(table, 4, "comment from idea");
       // tableDao.addA(table, "TITLE", "TEXT");
       // tableDao.delete(table, 7);

       // System.out.println(table.get(0).getComm());
        //tableA();
       // System.out.println("-------------------");
       // tableC(4);
    }
}
