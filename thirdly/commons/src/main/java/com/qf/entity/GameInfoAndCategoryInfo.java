package com.qf.entity;

import java.util.Date;

public class GameInfoAndCategoryInfo {
    private long gameId;
    private String gameName;
    private String logo;
    private double size;
    private long firmId;
    private String os;
    private Integer flag;
    private Integer gameDel;
    private long downloads;
    private long weight;
    private double score;
    private String link;
    private Date gameCreated;
    private Date gameUpdated;
    private long id;
    private String name;
    private Date created;
    private Date updated;
    private String del;

    public GameInfoAndCategoryInfo() {
    }

    public GameInfoAndCategoryInfo(String gameName, String logo, double size, long firmId, String os, long downloads, double score, String link, Date gameCreated, Date gameUpdated, String name, Date created, Date updated) {
        this.gameName = gameName;
        this.logo = logo;
        this.size = size;
        this.firmId = firmId;
        this.os = os;
        this.downloads = downloads;
        this.score = score;
        this.link = link;
        this.gameCreated = gameCreated;
        this.gameUpdated = gameUpdated;
        this.name = name;
        this.created = created;
        this.updated = updated;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public long getFirmId() {
        return firmId;
    }

    public void setFirmId(long firmId) {
        this.firmId = firmId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getGameDel() {
        return gameDel;
    }

    public void setGameDel(Integer gameDel) {
        this.gameDel = gameDel;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getGameCreated() {
        return gameCreated;
    }

    public void setGameCreated(Date gameCreated) {
        this.gameCreated = gameCreated;
    }

    public Date getGameUpdated() {
        return gameUpdated;
    }

    public void setGameUpdated(Date gameUpdated) {
        this.gameUpdated = gameUpdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}
