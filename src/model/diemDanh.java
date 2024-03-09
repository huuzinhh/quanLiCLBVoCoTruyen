/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author huuzinhh
 */
public class diemDanh {
	private Date ngay;
	private int idvs;
        private boolean vang;

    public diemDanh() {
    }

    public diemDanh(Date ngay, int idvs, boolean vang) {
        this.ngay = ngay;
        this.idvs = idvs;
        this.vang = vang;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getIdvs() {
        return idvs;
    }

    public void setIdvs(int idvs) {
        this.idvs = idvs;
    }

    public boolean isVang() {
        return vang;
    }

    public void setVang(boolean vang) {
        this.vang = vang;
    }
        
}
