/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.voSinh;

/**
 *
 * @author huuzinhh
 */
public class voSinhDAO {
public voSinh getAllThongTinVSTheoEmail(String email) {
        voSinh vs = new voSinh();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from voSinh where email='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vs.setIdsv(rs.getInt("idvs"));
                vs.setHoTen(rs.getString("hoTen"));
                vs.setNgaySinh(rs.getDate("ngaySinh"));
                vs.setGioiTinh(rs.getString("gioiTinh"));
                vs.setEmail(rs.getString("email"));
                vs.setSdt(rs.getString("sdt"));
                vs.setDiaChi(rs.getString("diaChi"));
                vs.setCap(rs.getInt("cap"));
                vs.setTrangThai(rs.getInt("trangThai"));
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return vs;
    }  
    public boolean KiemTraEmail(String email) {
        voSinh sv = new voSinh();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from voSinh where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }
    public boolean KiemTraTenDN(String tendangnhap) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taiKhoan where tenDangNhap ='" + tendangnhap + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }    
}
