/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.banChuNhiem;

/**
 *
 * @author huuzinhh
 */
public class banChuNhiemDAO {
   public boolean KiemTraEmail(String email) {
        banChuNhiem sv = new banChuNhiem();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from banChuNhiem where email ='" + email + "'";
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
    public banChuNhiem getAllThongTinBCNTheoEmail(String email) {
        banChuNhiem bcn = new banChuNhiem();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from banChuNhiem where email='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                bcn.setIdsv(rs.getInt("idvs"));
                bcn.setHoTen(rs.getString("hoTen"));
                bcn.setNgaySinh(rs.getDate("ngaySinh"));
                bcn.setGioiTinh(rs.getString("gioiTinh"));
                bcn.setEmail(rs.getString("email"));
                bcn.setSdt(rs.getString("sdt"));
                bcn.setDiaChi(rs.getString("diaChi"));
                bcn.setCap(rs.getInt("cap"));
                bcn.setChucVu(rs.getString("chucVu"));
                bcn.setTrangThai(rs.getInt("trangThai"));
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bcn;
    } 
}
