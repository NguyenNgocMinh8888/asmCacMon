package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    private UUID id;
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
    @NotBlank(message = "Không được để trống")

    private String sdt;
    @NotBlank(message = "Không được để trống")

    private String diaChi;

    @NotNull(message = "Không được để trống")
    private UUID cuaHangVM;

    @NotNull(message = "Không được để trống")
    private UUID chucVuVM;

    @NotBlank(message = "Không được để trống")
    private String trangThai;
    @NotBlank(message = "Không được để trống")

    private String matKhau;

    public void loadFromEntityNV(NhanVien nv){
        this.setMa(nv.getMa());
        this.setHo(nv.getHo());
        this.setTenDem(nv.getTenDem());
        this.setTen(nv.getTen());
        this.setGioiTinh(nv.getGioiTinh());
        this.setNgaySinh(nv.getNgaySinh());
        this.setDiaChi(nv.getDiaChi());
        this.setSdt(nv.getSdt());
        this.setCuaHangVM(nv.getCuaHang().getId());
        this.setChucVuVM(nv.getChucVu().getId());
        this.setTrangThai(nv.getTrangThai());
        this.setMatKhau(nv.getMatKhau());
    }
}
