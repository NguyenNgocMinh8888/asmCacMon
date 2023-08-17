package com.example.demo.DTO;

import com.example.demo.Enitity.HangKhachHang;
import com.example.demo.Enitity.KhachHang;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

public class KhachHangDto {
    @NotBlank(message = "Khong duoc de trong")
    private Long maKhachHang;
    @NotBlank(message = "Khong duoc de trong")

    private String tenKhachHang;
    @NotBlank(message = "Khong duoc de trong")

    private String soDienThoai;
    @NotBlank(message = "Khong duoc de trong")

    private Boolean gioiTinh;
    @NotBlank(message = "Khong duoc de trong")

    private Long maHang;
    @NotBlank(message = "Khong duoc de trong")

    private String TenHang;

//    public void loadFromEntityNV(KhachHang kh)
//    {
//        this.setMa( kh.getMaKhachHang() );
//        this.setHo( nv.getHo() );
//        this.setTenDem( nv.getTenDem() );
//        this.setTen( nv.getTen() );
//        this.setGioiTinh( nv.getGioiTinh() );
//        this.setNgaySinh( nv.getNgaySinh() );
//        this.setDiaChi( nv.getDiaChi() );
//        this.setSdt( nv.getSdt() );
//        this.setMatKhau( nv.getMatKhau() );
//        this.setTrangThai( nv.getTrangThai() );
//    }

//    private HangKhachHang hangKhachHang;
}
