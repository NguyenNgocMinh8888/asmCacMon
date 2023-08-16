/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class SP implements Serializable{
    private String Ma;
    private String Ten;
    private String Hang;
    private String Mau;
    private float Gia;
    private int Loai;
    private Boolean TrangThai;
    private int soLuong;

    public SP() {
    }

    public SP(String Ma, String Ten, String Hang, String Mau, float Gia, int Loai, Boolean TrangThai, int soLuong) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Hang = Hang;
        this.Mau = Mau;
        this.Gia = Gia;
        this.Loai = Loai;
        this.TrangThai = TrangThai;
        this.soLuong = soLuong;
    }

   
    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public int getLoai() {
        return Loai;
    }

    public void setLoai(int Loai) {
        this.Loai = Loai;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float tongTien(){
        return (Gia * soLuong);
    }
}

    
   

