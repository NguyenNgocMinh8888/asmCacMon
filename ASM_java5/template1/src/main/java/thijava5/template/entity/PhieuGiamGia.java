package thijava5.template.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thijava5.template.request.PhieuGiamGiaVM;

import java.util.Date;

@Entity(name="PhieuGiamGia")
@Table(name="PhieuGiamGia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhieuGiamGia {
    @Id
    @Column(name = "MaPhieu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maPhieu;

    @Column(name = "TenPhieu")
    private String tenPhieu;

    @Column(name = "NgayBatDau")
    private String ngayBatDau;

    @Column(name = "NgayKetThuc")
    private String ngayKetThuc;

    @Column(name = "GiaTriGiam")
    private String giaTriGiam;

    @Column(name = "TrangThai")
    private String trangThai;

    @ManyToOne()
    @JoinColumn(name="NguoiSoHuu")
    private KhachHang khachHang;

    public void loadFromVMPGG(PhieuGiamGiaVM vm)
    {
        this.setMaPhieu(vm.getMaPhieu() );
        this.setTenPhieu(vm.getTenPhieu());
        this.setNgayBatDau(vm.getNgayBatDau());
        this.setNgayKetThuc(vm.getNgayKetThuc());
        this.setGiaTriGiam(vm.getGiaTriGiam());
        this.setTrangThai( vm.getTrangThai());

    }


}

