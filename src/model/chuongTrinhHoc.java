/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class chuongTrinhHoc {
        private int cap;
	private String quyen;
	private String the;
	private String theLuc;
	private String liLuanVoHoc;
	private String liLuanVoDao;

    public chuongTrinhHoc() {
    }

    public chuongTrinhHoc(int cap, String quyen, String the, String theLuc, String liLuanVoHoc, String liLuanVoDao) {
        this.cap = cap;
        this.quyen = quyen;
        this.the = the;
        this.theLuc = theLuc;
        this.liLuanVoHoc = liLuanVoHoc;
        this.liLuanVoDao = liLuanVoDao;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getThe() {
        return the;
    }

    public void setThe(String the) {
        this.the = the;
    }

    public String getTheLuc() {
        return theLuc;
    }

    public void setTheLuc(String theLuc) {
        this.theLuc = theLuc;
    }

    public String getLiLuanVoHoc() {
        return liLuanVoHoc;
    }

    public void setLiLuanVoHoc(String liLuanVoHoc) {
        this.liLuanVoHoc = liLuanVoHoc;
    }

    public String getLiLuanVoDao() {
        return liLuanVoDao;
    }

    public void setLiLuanVoDao(String liLuanVoDao) {
        this.liLuanVoDao = liLuanVoDao;
    }
        
}
