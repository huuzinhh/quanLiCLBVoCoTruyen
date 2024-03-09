/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class capDai {
	private int cap ;
	private String bac;
	private String mauDai;
	private String danhXung;
	private String thoigian; 

    public capDai() {
    }

    public capDai(int cap, String bac, String mauDai, String danhXung, String thoigian) {
        this.cap = cap;
        this.bac = bac;
        this.mauDai = mauDai;
        this.danhXung = danhXung;
        this.thoigian = thoigian;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getMauDai() {
        return mauDai;
    }

    public void setMauDai(String mauDai) {
        this.mauDai = mauDai;
    }

    public String getDanhXung() {
        return danhXung;
    }

    public void setDanhXung(String danhXung) {
        this.danhXung = danhXung;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }
        
}
