/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class thongBao {
	private int idtb;
	private int idvs;
	private String tieuDe;
	private String noiDung;   

    public thongBao() {
    }

    public thongBao(int idtb, int idvs, String tieuDe, String noiDung) {
        this.idtb = idtb;
        this.idvs = idvs;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
    }

    public int getIdtb() {
        return idtb;
    }

    public void setIdtb(int idtb) {
        this.idtb = idtb;
    }

    public int getIdvs() {
        return idvs;
    }

    public void setIdvs(int idvs) {
        this.idvs = idvs;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
        
}
