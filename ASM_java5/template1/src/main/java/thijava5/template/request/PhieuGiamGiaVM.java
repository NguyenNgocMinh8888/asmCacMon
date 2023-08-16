package thijava5.template.request;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thijava5.template.entity.PhieuGiamGia;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhieuGiamGiaVM {
    @Id
    @NotBlank(message = "Không được để trống")
    private String MaPhieu;

    @NotBlank(message = "Không được để trống")
    private String TenPhieu;

    @NotBlank(message = "Khong duoc de trong")
    private String NgayBatDau;

    @NotBlank(message = "Khong duoc de trong")
    private String NgayKetThuc;

    @NotBlank(message =  "Khong duoc de trong")
    private String GiaTriGiam;

    @NotBlank(message = "Khong duoc de trong")
    private String TrangThai;

    @NotNull(message = "Không được để trống")
    private String phieuGiamGiaVM;
    public void loadFromEntityPGG(PhieuGiamGia phieuGiamGia)
    {
        this.setMaPhieu( phieuGiamGia.getMaPhieu() );
        this.setTenPhieu( phieuGiamGia.getTenPhieu() );
        this.setNgayBatDau( phieuGiamGia.getNgayBatDau());
        this.setNgayKetThuc( phieuGiamGia.getNgayKetThuc() );
        this.setGiaTriGiam(phieuGiamGia.getGiaTriGiam());
        this.setTrangThai(phieuGiamGia.getTrangThai());
        this.setPhieuGiamGiaVM(phieuGiamGia.getKhachHang().getMaKhachHang());
    }
}
