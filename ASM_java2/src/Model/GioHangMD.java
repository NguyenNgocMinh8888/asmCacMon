/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nguye
 */
public class GioHangMD {
    private String Ma;
    private String Ten;
    private String Hang;
    private int soLuong;
    private float Gia;
    private Boolean TrangThai;
    

    public GioHangMD() {
    }

    public GioHangMD(String Ma, String Ten, String Hang, int soLuong, float Gia, Boolean TrangThai) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Hang = Hang;
        this.soLuong = soLuong;
        this.Gia = Gia;
        this.TrangThai = TrangThai;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    

    
    public float tongTien(){
        return (Gia * soLuong);
    }
   
}
