/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import model.Diem;
import model.SinhVien;





/**
 *
 * @author nguye
 */
public class DiemRepository {
    private DBConnection connection;

    public ArrayList<Diem> getDiemFromDB() {
        ArrayList<Diem> listDiem = new ArrayList<>();
        String sql = "select student.Hoten,grade.MaSV,grade.Tienganh,grade.Tinhoc,grade.GDTC"+" from student join grade"+" on student.MaSV = grade.MaSV";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Diem diem = new Diem();
                diem.setMaSV(rs.getString(1));
                diem.setTienganh(rs.getInt(3));
                diem.setTinhoc(rs.getInt(4));
                diem.setGDTC(rs.getInt(5));
                
                SinhVien sinhVien = new SinhVien();
                sinhVien.setHoten(rs.getString(2));
                diem.setSV(sinhVien);
                listDiem.add(diem);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return listDiem;
    }
    public Boolean them(Diem diem) {
        String query = "insert into grade VALUES (?,?,?,?)";
        try {Connection con = connection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, diem.getMaSV());
            ps.setObject(2, diem.getTienganh());
            ps.setObject(3, diem.getTinhoc());
            ps.setObject(4, diem.getGDTC());
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            
        }
        return false;
    }
    public Boolean update(String index ,Diem diem) {
        String query = "update grade set Tienganh = ?, Tinhoc = ?, GDTC = ? where MaSV = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(4, index);
            ps.setObject(1, diem.getTienganh());
            ps.setObject(2, diem.getTinhoc());
            ps.setObject(3, diem.getGDTC());
            
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            return false;
        }
    }
    public Boolean xoa(String index ) {
        String query = "delete from grade where MaSV = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, index);
            
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            return false;
        }
    }
    public ArrayList<Diem> timKiem(String tim) {
        ArrayList<Diem> listDiem = new ArrayList<>();
        
        String sql = "select grade.MaSV,student.Hoten,grade.Tienganh,grade.Tinhoc,grade.GDTC from grade join student on grade.MaSV = student.MaSV where grade.MaSV like '%" + tim + "%'";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Diem diem = new Diem();
                
                diem.setMaSV(rs.getString(2));
                diem.setTienganh(rs.getInt(3));
                diem.setTinhoc(rs.getInt(4));
                diem.setGDTC(rs.getInt(5));
                
                SinhVien sinhVien = new SinhVien();
                sinhVien.setHoten(rs.getString(1));
                
                diem.setSV(sinhVien);
                listDiem.add(diem);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listDiem;
    }
}
