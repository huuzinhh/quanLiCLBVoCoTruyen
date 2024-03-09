/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class dungCu {
	private int iddc;
	private String ten;
	private int gia;
        private String linkAnh;

    public dungCu() {
    }

    public dungCu(int iddc, String ten, int gia, String linkAnh) {
        this.iddc = iddc;
        this.ten = ten;
        this.gia = gia;
        this.linkAnh = linkAnh;
    }

    public int getIddc() {
        return iddc;
    }

    public void setIddc(int iddc) {
        this.iddc = iddc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getLinkAnh() {
        return linkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        this.linkAnh = linkAnh;
    }
        
}
