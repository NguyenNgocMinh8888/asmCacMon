package domain_models;


import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name="HoaDon")
public class HoaDon {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "IdKH")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdKH;

    @Column(name = "IdNV")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdNV;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "NgayTao")
    private Date NgayTao;

    @Column(name = "NgayThanhToan")
    private Date NgayThanhToan;

    @Column(name = "NgayShip")
    private Date NgayShip;

    @Column(name = "NgayNhan")
    private Date NgayNhan;

    @Column(name = "TinhTrang")
    private int TinhTrang;

    @Column(name = "TenNguoiNhan")
    private String TenNguoiNhan;

    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "Sdt")
    private String Sdt;

    public HoaDon() {
    }

    public HoaDon(UUID id, UUID idKH, UUID idNV, String ma, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String tenNguoiNhan, String diaChi, String sdt) {
        Id = id;
        IdKH = idKH;
        IdNV = idNV;
        Ma = ma;
        NgayTao = ngayTao;
        NgayThanhToan = ngayThanhToan;
        NgayShip = ngayShip;
        NgayNhan = ngayNhan;
        TinhTrang = tinhTrang;
        TenNguoiNhan = tenNguoiNhan;
        DiaChi = diaChi;
        Sdt = sdt;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public UUID getIdKH() {
        return IdKH;
    }

    public void setIdKH(UUID idKH) {
        IdKH = idKH;
    }

    public UUID getIdNV() {
        return IdNV;
    }

    public void setIdNV(UUID idNV) {
        IdNV = idNV;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date ngayTao) {
        NgayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        NgayThanhToan = ngayThanhToan;
    }

    public Date getNgayShip() {
        return NgayShip;
    }

    public void setNgayShip(Date ngayShip) {
        NgayShip = ngayShip;
    }

    public Date getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        NgayNhan = ngayNhan;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        TenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }
}
