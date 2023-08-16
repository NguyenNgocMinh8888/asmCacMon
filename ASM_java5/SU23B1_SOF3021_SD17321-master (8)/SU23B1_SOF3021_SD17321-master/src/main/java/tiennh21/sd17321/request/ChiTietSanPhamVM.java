package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import tiennh21.sd17321.entities.ChiTietSanPham;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ChiTietSanPhamVM {
    private UUID id;

    @NotNull(message = "Không được để trống")
    private UUID sanPhamVM;

    @NotNull(message = "Không được để trống")
    private UUID nsxVM;

    @NotNull(message = "Không được để trống")
    private UUID mauSacVM;

    @NotNull(message = "Không được để trống")
    private UUID dongSPVM;

    @NotBlank(message = "Không được để trống")
    private String namBH;

    @NotBlank(message = "Không được để trống")
    private String moTa;

    @NotBlank(message = "Không được để trống")
    private String soLuongTon;

    @NotBlank(message = "Không được để trống")
    private String giaNhap;

    @NotBlank(message = "Không được để trống")
    private String giaBan;

    public void loadFromEntityCTSP(ChiTietSanPham ctsp)
    {
        this.setSanPhamVM(ctsp.getSanPham().getId());
        this.setNsxVM(ctsp.getNsx().getId());
        this.setMauSacVM(ctsp.getMauSac().getId());
        this.setDongSPVM(ctsp.getDongSP().getId());
        this.setNamBH( ctsp.getNamBH() );
        this.setMoTa( ctsp.getMoTa() );
        this.setSoLuongTon( ctsp.getSoLuongTon() );
        this.setGiaNhap( ctsp.getGiaNhap() );
        this.setGiaBan(ctsp.getGiaBan() );
    }
}
