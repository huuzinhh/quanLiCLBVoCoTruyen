/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class diem {
        private int id;
        private int idvs;
        private String dotThi;
        private Float diemQuyen;
        private Float diemThe;
        private Float diemTheLuc;
        private Float diemLiThuyet;
        private boolean ketQua;  

    public diem() {
    }

    public diem(int id, int idvs, String dotThi, Float diemQuyen, Float diemThe, Float diemTheLuc, Float diemLiThuyet, boolean ketQua) {
        this.id = id;
        this.idvs = idvs;
        this.dotThi = dotThi;
        this.diemQuyen = diemQuyen;
        this.diemThe = diemThe;
        this.diemTheLuc = diemTheLuc;
        this.diemLiThuyet = diemLiThuyet;
        this.ketQua = ketQua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdvs() {
        return idvs;
    }

    public void setIdvs(int idvs) {
        this.idvs = idvs;
    }

    public String getDotThi() {
        return dotThi;
    }

    public void setDotThi(String dotThi) {
        this.dotThi = dotThi;
    }

    public Float getDiemQuyen() {
        return diemQuyen;
    }

    public void setDiemQuyen(Float diemQuyen) {
        this.diemQuyen = diemQuyen;
    }

    public Float getDiemThe() {
        return diemThe;
    }

    public void setDiemThe(Float diemThe) {
        this.diemThe = diemThe;
    }

    public Float getDiemTheLuc() {
        return diemTheLuc;
    }

    public void setDiemTheLuc(Float diemTheLuc) {
        this.diemTheLuc = diemTheLuc;
    }

    public Float getDiemLiThuyet() {
        return diemLiThuyet;
    }

    public void setDiemLiThuyet(Float diemLiThuyet) {
        this.diemLiThuyet = diemLiThuyet;
    }

    public boolean isKetQua() {
        return ketQua;
    }

    public void setKetQua(boolean ketQua) {
        this.ketQua = ketQua;
    }
        
}
