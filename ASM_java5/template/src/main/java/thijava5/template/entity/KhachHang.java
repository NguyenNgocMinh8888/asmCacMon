package thijava5.template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thijava5.template.request.KhachHangVM;

@Entity(name="KhachHang")
@Table(name="KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "MaKhachHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maKhachHang;

    @Column(name = "TenKhachHang")
    private String tenKhachHang;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "SoDienThoai")
    private String soDienThoai;

    @ManyToOne()
    @JoinColumn(name="HangKhachHang")
    private HangKhachHang hangKhachHang;

    public void loadFromVM(KhachHangVM vm)
        {
            this.setMaKhachHang(vm.getMaKhachHang() );
            this.setTenKhachHang(vm.getTenKhachHang());
            this.setGioiTinh(vm.getGioiTinh());
            this.setSoDienThoai(vm.getSoDienThoai());

        }
}
