package tiennh21.sd17321.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tiennh21.sd17321.request.KhachHangVM;

import java.util.UUID;

@Entity(name="KhachHang")
@Table(name="KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="Ma")
    private String ma;

    @Column(name="Ho")
    private String ho;

    @Column(name="TenDem")
    private String tenDem;

    @Column(name="Ten")
    private String ten;

    @Column(name="NgaySinh")
    private String ngaySinh;

    @Column(name="Sdt")
    private String sdt;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="ThanhPho")
    private String thanhPho;

    @Column(name="QuocGia")
    private String quocGia;

    @Column(name="MatKhau")
    private String matKhau;

    public void loadFromVMKH(KhachHangVM vm)
    {
        this.setMa( vm.getMa() );
        this.setHo( vm.getHo() );
        this.setTenDem( vm.getTenDem() );
        this.setTen( vm.getTen() );
        this.setNgaySinh( vm.getNgaySinh() );
        this.setSdt( vm.getSdt() );
        this.setDiaChi( vm.getDiaChi() );
        this.setThanhPho( vm.getThanhPho() );
        this.setQuocGia( vm.getQuocGia() );
        this.setMatKhau( vm.getMatKhau() );
    }
}
