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
import model.chuongTrinhHoc;
/**
 *
 * @author huuzinhh
 */
public class chuongTrinhHocDAO {
     public List<chuongTrinhHoc> getAllThongTinCTH() {
        List<chuongTrinhHoc> listCTH = new ArrayList<chuongTrinhHoc>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from chuongTrinhHoc";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                chuongTrinhHoc cth = new chuongTrinhHoc();                
                cth.setCap(rs.getInt("cap"));
                cth.setQuyen(rs.getString("quyen"));
                cth.setThe(rs.getString("the"));
                cth.setTheLuc(rs.getString("theLuc"));
                cth.setLiLuanVoHoc(rs.getString("liLuanVoHoc"));
                cth.setLiLuanVoDao(rs.getString("liLuanVoDao"));                
                listCTH.add(cth);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCTH;
    }  
    public int SoLuongCTH() {
        int soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as sl from chuongTrinhHoc";
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
    
     public List<chuongTrinhHoc> getAllThongTinCTHSearch(String where, String text) {
        List<chuongTrinhHoc> listCTH = new ArrayList<chuongTrinhHoc>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from chuongTrinhHoc where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                chuongTrinhHoc cth = new chuongTrinhHoc();                
                cth.setCap(rs.getInt("cap"));
                cth.setQuyen(rs.getString("quyen"));
                cth.setThe(rs.getString("the"));
                cth.setTheLuc(rs.getString("theLuc"));
                cth.setLiLuanVoHoc(rs.getString("liLuanVoHoc"));
                cth.setLiLuanVoDao(rs.getString("liLuanVoDao"));                
                listCTH.add(cth);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCTH;
    }
}
