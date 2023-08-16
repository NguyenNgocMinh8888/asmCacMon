package view_model;

public class QLHoaDonChiTiet {
        private String so_luopn;
        private String don_gia;

    public QLHoaDonChiTiet() {
    }

    public QLHoaDonChiTiet(String so_luopn, String don_gia) {
        this.so_luopn = so_luopn;
        this.don_gia = don_gia;
    }

    public String getSo_luopn() {
        return so_luopn;
    }

    public void setSo_luopn(String so_luopn) {
        this.so_luopn = so_luopn;
    }

    public String getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(String don_gia) {
        this.don_gia = don_gia;
    }
}
