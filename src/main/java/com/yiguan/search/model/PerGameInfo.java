package com.yiguan.search.model;

import java.io.Serializable;
import java.util.Date;

public class PerGameInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String gname;

    private String area;

    private String rolename;

    private String achievement;

    private String lvl;

    private String gang;

    private String speech;

    private Date startTime;

    private String consume;

    private String gameExp;

    private String uuid;

    private Date ctime;

    private Date atime;

    public Long getId() {
        return id;
    }

    public static String getIdColumnString() {
        return "id";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public static String getGnameColumnString() {
        return "gname";
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getArea() {
        return area;
    }

    public static String getAreaColumnString() {
        return "area";
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public static String getRolenameColumnString() {
        return "rolename";
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public static String getAchievementColumnString() {
        return "achievement";
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public String getLvl() {
        return lvl;
    }

    public static String getLvlColumnString() {
        return "lvl";
    }

    public void setLvl(String lvl) {
        this.lvl = lvl == null ? null : lvl.trim();
    }

    public String getGang() {
        return gang;
    }

    public static String getGangColumnString() {
        return "gang";
    }

    public void setGang(String gang) {
        this.gang = gang == null ? null : gang.trim();
    }

    public String getSpeech() {
        return speech;
    }

    public static String getSpeechColumnString() {
        return "speech";
    }

    public void setSpeech(String speech) {
        this.speech = speech == null ? null : speech.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public static String getStartTimeColumnString() {
        return "startTime";
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getConsume() {
        return consume;
    }

    public static String getConsumeColumnString() {
        return "consume";
    }

    public void setConsume(String consume) {
        this.consume = consume == null ? null : consume.trim();
    }

    public String getGameExp() {
        return gameExp;
    }

    public static String getGameExpColumnString() {
        return "gameExp";
    }

    public void setGameExp(String gameExp) {
        this.gameExp = gameExp == null ? null : gameExp.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public static String getUuidColumnString() {
        return "uuid";
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public static String getCtimeColumnString() {
        return "ctime";
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getAtime() {
        return atime;
    }

    public static String getAtimeColumnString() {
        return "atime";
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    @Override
    public String toString() {
        String clazzName = "[<"+this.getClass().getSimpleName()+">";
        String colStr = "";
        colStr += getIdColumnString()+":"+getId();
        colStr += ", " + getGnameColumnString()+":"+getGname();
        colStr += ", " + getAreaColumnString()+":"+getArea();
        colStr += ", " + getRolenameColumnString()+":"+getRolename();
        colStr += ", " + getAchievementColumnString()+":"+getAchievement();
        colStr += ", " + getLvlColumnString()+":"+getLvl();
        colStr += ", " + getGangColumnString()+":"+getGang();
        colStr += ", " + getSpeechColumnString()+":"+getSpeech();
        colStr += ", " + getStartTimeColumnString()+":"+getStartTime();
        colStr += ", " + getConsumeColumnString()+":"+getConsume();
        colStr += ", " + getGameExpColumnString()+":"+getGameExp();
        colStr += ", " + getUuidColumnString()+":"+getUuid();
        colStr += ", " + getCtimeColumnString()+":"+getCtime();
        colStr += ", " + getAtimeColumnString()+":"+getAtime();
        
        return clazzName + colStr + "]";
    }
}