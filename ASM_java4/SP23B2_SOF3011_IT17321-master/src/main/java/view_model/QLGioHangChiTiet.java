package view_model;

public class QLGioHangChiTiet {
    private String so_luong;
    private String don_gia;
    private String don_gia_khi_giam;

    public QLGioHangChiTiet() {
    }

    public QLGioHangChiTiet(String so_luong, String don_gia, String don_gia_khi_giam) {
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.don_gia_khi_giam = don_gia_khi_giam;
    }

    public String getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(String so_luong) {
        this.so_luong = so_luong;
    }

    public String getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(String don_gia) {
        this.don_gia = don_gia;
    }

    public String getDon_gia_khi_giam() {
        return don_gia_khi_giam;
    }

    public void setDon_gia_khi_giam(String don_gia_khi_giam) {
        this.don_gia_khi_giam = don_gia_khi_giam;
    }
}
