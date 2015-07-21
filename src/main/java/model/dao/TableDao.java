package model.dao;

import model.Table;

/**
 * Created by ооо on 14.07.2015.
 */
public interface TableDao {

    void addA(String title, String text);
    void addC(int idc, String comment);
    void delete(int x);

}
