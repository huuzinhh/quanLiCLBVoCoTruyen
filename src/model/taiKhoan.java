/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huuzinhh
 */
public class taiKhoan {
	private String tenDangNhap;
	private String matKhau;
	private String email;
	private String quyen;

    public taiKhoan() {
    }

    public taiKhoan(String tenDangNhap, String matKhau, String email, String quyen) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.quyen = quyen;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }
        
}
