package com.example.demo.Enitity;

//import com.example.demo.DTO.KhachHangDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "KhachHang")
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhachHang")
    private Long maKhachHang;
    @Column(name = "TenKhachHang")
    private String tenKhachHang;
//    @Column(name = "SinhNhat")
//    private Date sinhNhat;
//    @Column(name = "DiaChi")
//    private String diaChi;
    @Column(name = "SoDienThoai")
    private String soDienThoai;
//    @Column(name = "Email")
//    private String email;
    @Column(name = "GioiTinh")
    private Boolean gioiTinh;
//    @Column(name = "ChungMinhThu")
//    private String chungMinhThu;
//    @Column(name = "SoCanCuoc")
//    private String soCanCuoc;
//    @Column(name = "AnhDaiDien")
//    private String anhDaiDien;
//    @Column(name = "MaKhachHang")
//    private int trangThai;
//    @Column(name = "MaKhachHang")
//    private int diemTichLuy;
    @ManyToOne()
    @JoinColumn(name="HangKhachHang")
    private HangKhachHang hangKhachHang;
//    public void loadFromVMNV(KhachHangDto dto)
//    {
//        this.setMaKhachHang( dto.ge );
//        this.setHo( vm.getHo() );
//        this.setTenDem( vm.getTenDem() );
//        this.setTen( vm.getTen() );
//        this.setGioiTinh( vm.getGioiTinh() );
//        this.setNgaySinh( vm.getNgaySinh() );
//        this.setDiaChi( vm.getDiaChi() );
//        this.setSdt( vm.getSdt() );
//        this.setMatKhau( vm.getMatKhau() );
//        this.setTrangThai( vm.getTrangThai());
//    }


}
