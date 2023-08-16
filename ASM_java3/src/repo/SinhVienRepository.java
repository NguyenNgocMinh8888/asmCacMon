/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author nguye
 */
public class SinhVienRepository {
    private DBConnection connection;

    public ArrayList<SinhVien> getSinhVienFromDB() {
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        String sql = "select student.MaSV,student.Hoten,student.Email,student.SoDT,student.Gioitinh,student.Diachi"+" from student";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMaSV(rs.getString(1));
                sinhVien.setHoten(rs.getString(2));
                sinhVien.setEmail(rs.getString(3));
                sinhVien.setSoDT(rs.getString(4));
                sinhVien.setGioitinh(rs.getBoolean(5));
                sinhVien.setDiachi(rs.getString(6));

                listSinhVien.add(sinhVien);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listSinhVien;
    }
     public Boolean them(SinhVien sinhVien) {
        String query = "insert into student(MaSV,Hoten,Email,SoDT,Gioitinh,Diachi) values (?,?,?,?,?,?)";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sinhVien.getMaSV());
            ps.setObject(2, sinhVien.getHoten());
            ps.setObject(3, sinhVien.getEmail());
            ps.setObject(4, sinhVien.getSoDT());
            ps.setObject(5, sinhVien.getGioitinh());
            ps.setObject(6, sinhVien.getDiachi());
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            return false;
        }
    }
     public Boolean update(String ma, SinhVien sinhVien){
        String sql = "update student set  Hoten = ?, Email = ?, SoDT = ?, Gioitinh = ?, Diachi = ? where MaSV = ?";
       try(Connection con = DBConnection.getConnection();
           PreparedStatement ps = con.prepareStatement(sql)){
           ps.setObject(1, sinhVien.getHoten());
           ps.setObject(2, sinhVien.getEmail());
           ps.setObject(3, sinhVien.getSoDT());
           ps.setObject(4, sinhVien.getGioitinh());
           ps.setObject(5, sinhVien.getDiachi());
           ps.setObject(6, ma);
           
           ps.executeUpdate();
           
           return true;
           
       }catch (Exception ex) {
            ex.getMessage();
            return false;
       }
    }
      public Boolean delete(String viTri){
        String sql = "delete from student where MaSV = ?";
         try(Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)){
             
             ps.setObject(1, viTri);
             ps.executeUpdate();
             return true;
           
       }catch(Exception e){
           return false;
       }
    }

    
}
