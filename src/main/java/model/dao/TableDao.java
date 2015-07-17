package model.dao;

import model.Table;

/**
 * Created by ооо on 14.07.2015.
 */
public interface TableDao {

    void addA(Table table, String title, String text);
    void addC(Table table, int idc, String comment);
    void delete(Table table, int x);

}
