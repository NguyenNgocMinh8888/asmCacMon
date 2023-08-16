package thijava5.template.request;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thijava5.template.entity.KhachHang;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangVM {
    @Id
    @Column(name = "MaKhachHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maKhachHang;

    @Column(name = "TenKhachHang")
    private String tenKhachHang;

    public void loadFromEntity(KhachHang khachHang)
    {
        this.setMaKhachHang( khachHang.getMaKhachHang() );
        this.setTenKhachHang( khachHang.getTenKhachHang() );

    }
}
