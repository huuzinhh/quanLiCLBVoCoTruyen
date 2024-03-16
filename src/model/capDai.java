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
	private String thoiGian; 

    public capDai() {
    }

    public capDai(int cap, String bac, String mauDai, String danhXung, String thoiGian) {
        this.cap = cap;
        this.bac = bac;
        this.mauDai = mauDai;
        this.danhXung = danhXung;
        this.thoiGian = thoiGian;
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

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
        
}
