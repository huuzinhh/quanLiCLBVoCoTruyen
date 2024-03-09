/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class donHang {
	private int iddh;
	private int idvs;
	private int idDungCu;
	private int soLuong;
	private int trangThai;

    public donHang() {
    }

    public donHang(int iddh, int idvs, int idDungCu, int soLuong, int trangThai) {
        this.iddh = iddh;
        this.idvs = idvs;
        this.idDungCu = idDungCu;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public int getIddh() {
        return iddh;
    }

    public void setIddh(int iddh) {
        this.iddh = iddh;
    }

    public int getIdvs() {
        return idvs;
    }

    public void setIdvs(int idvs) {
        this.idvs = idvs;
    }

    public int getIdDungCu() {
        return idDungCu;
    }

    public void setIdDungCu(int idDungCu) {
        this.idDungCu = idDungCu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
        
}
