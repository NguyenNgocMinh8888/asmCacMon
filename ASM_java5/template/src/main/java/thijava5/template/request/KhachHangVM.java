package thijava5.template.request;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thijava5.template.entity.KhachHang;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangVM {
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;
    private String gioiTinh;
    private String hangKhachHangVM;

    public void loadFromEntity(KhachHang khachHang)
        {
            this.setMaKhachHang( khachHang.getMaKhachHang() );
            this.setTenKhachHang(khachHang.getTenKhachHang());
            this.setSoDienThoai(khachHang.getSoDienThoai());
            this.setGioiTinh(khachHang.getGioiTinh());
            this.setHangKhachHangVM(khachHang.getHangKhachHang().getMaHang());
        }

}
