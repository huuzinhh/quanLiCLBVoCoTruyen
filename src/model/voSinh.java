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
public class voSinh {
        private int idsv;
	private String hoTen ;
	private Date ngaySinh ;
	private String gioiTinh ;
	private String diaChi ;
	private String email;
	private String sdt;
	private int cap ;
	private int trangThai ;   

    public voSinh() {
    }

    public voSinh(int idsv, String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String email, String sdt, int cap, int trangThai) {
        this.idsv = idsv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
        this.cap = cap;
        this.trangThai = trangThai;
    }

    public int getIdsv() {
        return idsv;
    }

    public void setIdsv(int idsv) {
        this.idsv = idsv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
        
}
