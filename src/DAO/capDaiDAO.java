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
import model.capDai;

/**
 *
 * @author huuzinhh
 */
public class capDaiDAO {
     public List<capDai> getAllThongTinCD() {
        List<capDai> listCD = new ArrayList<capDai>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from capDai";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                capDai cd = new capDai();
                cd.setCap(rs.getInt("cap"));
                cd.setBac(rs.getString("bac"));                
                cd.setMauDai(rs.getString("mauDai"));                
                cd.setDanhXung(rs.getString("danhXung"));                
                cd.setThoiGian(rs.getString("thoiGian"));             
                listCD.add(cd);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCD;
    }  
    public int SoLuongCD() {
        int soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as sl from capDai";
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
    
     public List<capDai> getAllThongTinCDSearch(String where, String text) {
        List<capDai> listCD = new ArrayList<capDai>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from capDai where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                capDai cd = new capDai();
                cd.setCap(rs.getInt("cap"));
                cd.setBac(rs.getString("bac"));                
                cd.setMauDai(rs.getString("mauDai"));                
                cd.setDanhXung(rs.getString("danhXung"));                
                cd.setThoiGian(rs.getString("thoiGian"));             
                listCD.add(cd);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCD;
    }   
}
