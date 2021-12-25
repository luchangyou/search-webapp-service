package com.yiguan.search.model;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String passWord;

    private String shenfen;

    public Integer getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public static String getUserNameColumnString() {
        return "userName";
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public static String getPassWordColumnString() {
        return "passWord";
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getShenfen() {
        return shenfen;
    }

    public static String getShenfenColumnString() {
        return "shenfen";
    }

    public void setShenfen(String shenfen) {
        this.shenfen = shenfen == null ? null : shenfen.trim();
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getUserNameColumnString()+":"+getUserName();
        colStr += ", " + getPassWordColumnString()+":"+getPassWord();
        colStr += ", " + getShenfenColumnString()+":"+getShenfen();
        
        return clazzName + colStr + "]";
    }
}