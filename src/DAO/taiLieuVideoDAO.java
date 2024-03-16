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
import model.taiLieuVideo;

/**
 *
 * @author huuzinhh
 */
public class taiLieuVideoDAO {
     public List<taiLieuVideo> getAllThongTinTLV() {
        List<taiLieuVideo> listTLV = new ArrayList<taiLieuVideo>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taiLieuVideo";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                taiLieuVideo tl = new taiLieuVideo();
                tl.setId(rs.getInt("id"));
                tl.setTenBai(rs.getString("tenBai"));
                tl.setLinkVideo(rs.getString("linkVideo"));
                listTLV.add(tl);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listTLV;
    } 
    public int SoLuongTLV() {
        int soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as sl from taiLieu";
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
    
     public List<taiLieuVideo> getAllThongTinTLVSearch(String where, String text) {
        List<taiLieuVideo> listTLV = new ArrayList<taiLieuVideo>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taiLieu where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                taiLieuVideo tlv = new taiLieuVideo();     
                tlv.setId(rs.getInt("id"));
                tlv.setTenBai(rs.getString("tenBai"));
                tlv.setLinkVideo(rs.getString("linkVideo"));
                listTLV.add(tlv);               
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listTLV;
    }     
}
