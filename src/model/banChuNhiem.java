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
public class banChuNhiem extends voSinh {
	private String chucVu;

        public banChuNhiem() {
        }

        public banChuNhiem(String chucVu, int idsv, String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String email, String sdt, int cap, int trangThai) {
            super(idsv, hoTen, ngaySinh, gioiTinh, diaChi, email, sdt, cap, trangThai);
            this.chucVu = chucVu;
        }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
  
        
   
        

        
}
