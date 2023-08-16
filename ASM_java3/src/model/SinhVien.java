/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class SinhVien {
    private String MaSV;
    private String Hoten;
    private String Email;
    private String SoDT;
    private Boolean Gioitinh;
    private String Diachi;
    
    

    public SinhVien() {
    }

    public SinhVien(String MaSV, String Hoten, String Email, String SoDT, Boolean Gioitinh, String Diachi) {
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SoDT = SoDT;
        this.Gioitinh = Gioitinh;
        this.Diachi = Diachi;
        
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public Boolean getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(Boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

   
    public String hienThiGioiTinh() {
        if (Gioitinh) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    
    
}
