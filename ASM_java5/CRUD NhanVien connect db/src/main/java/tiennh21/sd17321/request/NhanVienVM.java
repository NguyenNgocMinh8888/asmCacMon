package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import tiennh21.sd17321.entities.NhanVien;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienVM {
    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ho;

    @NotBlank(message = "Không được để trống")
    private String tenDem;

    @NotBlank(message = "Không được để trống")
    private String ten;

    @NotBlank(message = "Không được để trống")
    private String gioiTinh;

    @NotBlank(message = "Không được để trống")
    private String ngaySinh;

    @NotBlank
    private String diaChi;

    @NotBlank
    private String sdt;

    @NotBlank
    private String matKhau;

    @NotBlank
    private String trangThai;

    public void loadFromEntityNV(NhanVien nv)
    {
        this.setMa( nv.getMa() );
        this.setHo( nv.getHo() );
        this.setTenDem( nv.getTenDem() );
        this.setTen( nv.getTen() );
        this.setGioiTinh( nv.getGioiTinh() );
        this.setNgaySinh( nv.getNgaySinh() );
        this.setDiaChi( nv.getDiaChi() );
        this.setSdt( nv.getSdt() );
        this.setMatKhau( nv.getMatKhau() );
        this.setTrangThai( nv.getTrangThai() );
    }
}
