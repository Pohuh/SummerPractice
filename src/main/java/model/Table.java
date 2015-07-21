package model;

import java.io.Serializable;

/**
 * Created by ооо on 14.07.2015.
 */

public class Table implements Serializable {
    private int id;
    private String data;
    private String title;
    private String text;
    private int idc;
    private int num;
    private String comm;

    public Table(){

    }

    public Table(String title, String text){
        this.title = title;
        this.text = text;
    }

    public Table(int idc, int num, String comm){
        this.idc = idc;
        this.num = num;
        this.comm = comm;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdc(){
        return idc;
    }

    public void setIdc(int id) {
        this.idc = id;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComm(){
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}
