package view_model;

public class QLChiTietSanPham {
    private String namBH;
    private String mo_ta;
    private String so_luong_ton;
    private String gia_nhap;
    private String gia_ban;

    public QLChiTietSanPham() {
    }

    public QLChiTietSanPham(String namBH, String mo_ta, String so_luong_ton, String gia_nhap, String gia_ban) {
        this.namBH = namBH;
        this.mo_ta = mo_ta;
        this.so_luong_ton = so_luong_ton;
        this.gia_nhap = gia_nhap;
        this.gia_ban = gia_ban;
    }

    public String getNamBH() {
        return namBH;
    }

    public void setNamBH(String namBH) {
        this.namBH = namBH;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public String getSo_luong_ton() {
        return so_luong_ton;
    }

    public void setSo_luong_ton(String so_luong_ton) {
        this.so_luong_ton = so_luong_ton;
    }

    public String getGia_nhap() {
        return gia_nhap;
    }

    public void setGia_nhap(String gia_nhap) {
        this.gia_nhap = gia_nhap;
    }

    public String getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(String gia_ban) {
        this.gia_ban = gia_ban;
    }
}
