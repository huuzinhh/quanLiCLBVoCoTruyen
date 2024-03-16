/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.diem;

/**
 *
 * @author huuzinhh
 */
public class diemDAO {
    public List<diem> getAllThongTinDiem() {
        List<diem> listD = new ArrayList<diem>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from diem";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                diem d = new diem();
                d.setId(rs.getInt("id"));
                d.setIdvs(rs.getInt("idvs"));                
                d.setCap(rs.getInt("cap"));                
                d.setDotThi(rs.getString("dotThi"));             
                d.setDiemQuyen(rs.getFloat("diemQuyen"));                
                d.setDiemThe(rs.getFloat("diemThe"));             
                d.setDiemTheLuc(rs.getFloat("diemTheLuc"));             
                d.setDiemLiThuyet(rs.getFloat("diemLiThuyet"));  
                d.setKetQua(rs.getBoolean("ketQua"));
                listD.add(d);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listD;
    }
    public int SoLuongD() {
        int soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as sl from diem";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getInt("sl");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }    
    
     public List<diem> getAllThongTinCDSearch(String where, String text) {
        List<diem> listD = new ArrayList<diem>();     
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from diem where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                diem d = new diem();
                d.setId(rs.getInt("id"));
                d.setIdvs(rs.getInt("idvs"));                
                d.setCap(rs.getInt("cao"));                
                d.setDotThi(rs.getString("dotThi"));             
                d.setDiemQuyen(rs.getFloat("diemQuyen"));                
                d.setDiemThe(rs.getFloat("diemThe"));             
                d.setDiemTheLuc(rs.getFloat("diemTheLuc"));             
                d.setDiemLiThuyet(rs.getFloat("diemLiThuyet"));  
                d.setKetQua(rs.getBoolean("ketQua"));
                listD.add(d);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listD;
    } 
    
}
