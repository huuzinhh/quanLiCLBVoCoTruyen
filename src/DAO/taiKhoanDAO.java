/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author huuzinhh
 */
public class taiKhoanDAO {
public String LayEmail(String tenDangNhap) {
        String email = null;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taiKhoan where tenDangNhap ='" + tenDangNhap + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                email = rs.getString("email");
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
        }
        return email;
    } 
    public boolean KiemTraEmail(String email) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taiKhoan where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
