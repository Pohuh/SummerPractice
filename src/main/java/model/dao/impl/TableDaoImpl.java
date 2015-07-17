package model.dao.impl;

import model.DBWorker;
import model.Table;
import model.dao.TableDao;

import java.sql.*;

/**
 * Created by ооо on 14.07.2015.
 */
//Мы можем брать поля table, а можем их определять через getText и т.п.
//посмотреть, что будет удобнее передавать

public class TableDaoImpl implements TableDao{

    @Override
    public void addA(Table table, String title, String text) {
        DBWorker worker = new DBWorker();
        String INSERT_NEW_A = "INSERT INTO articles (title, text) VALUES(?,?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = worker.getConnection().prepareStatement(INSERT_NEW_A);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, text);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addC(Table table, int idc, String comment) {

        DBWorker worker = new DBWorker();
        String INSERT_NEW_C = "INSERT INTO comments (id_c, comm) VALUES(?,?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = worker.getConnection().prepareStatement(INSERT_NEW_C);
            preparedStatement.setInt(1, idc);
            preparedStatement.setString(2, comment);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Table table, int x) {

        DBWorker worker = new DBWorker();
        String DELETE = "DELETE FROM articles WHERE id=?";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = worker.getConnection().prepareStatement(DELETE);
            preparedStatement.setInt(1,x);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
