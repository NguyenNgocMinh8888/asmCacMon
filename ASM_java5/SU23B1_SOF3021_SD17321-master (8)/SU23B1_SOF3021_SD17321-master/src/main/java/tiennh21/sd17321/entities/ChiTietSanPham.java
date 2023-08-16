package tiennh21.sd17321.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tiennh21.sd17321.request.ChiTietSanPhamVM;

import java.util.UUID;

@Entity(name = "ChiTietSP")
@Table(name = "ChiTietSP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSanPham {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne()
    @JoinColumn(name="IdSP")
    private SanPham sanPham;

    @ManyToOne()
    @JoinColumn(name="IdNsx")
    private NSX nsx;

    @ManyToOne()
    @JoinColumn(name="IdMauSac")
    private MauSac mauSac;

    @ManyToOne()
    @JoinColumn(name="IdDongSP")
    private DongSP dongSP;

    @Column(name="NamBH")
    private String namBH;

    @Column(name="MoTa")
    private String moTa;

    @Column(name="SoLuongTon")
    private String soLuongTon;

    @Column(name="GiaNhap")
    private String giaNhap;

    @Column(name="GiaBan")
    private String giaBan;

    public void loadFromVMCTSP(ChiTietSanPhamVM vm)
    {
        this.setNamBH( vm.getNamBH() );
        this.setMoTa( vm.getMoTa() );
        this.setSoLuongTon( vm.getSoLuongTon() );
        this.setGiaNhap( vm.getGiaNhap() );
        this.setGiaBan(vm.getGiaBan() );
    }

}
