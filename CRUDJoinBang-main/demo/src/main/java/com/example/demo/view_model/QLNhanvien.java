package com.example.demo.view_model;

import com.example.demo.controllers.entities.NhanVien;
import com.example.demo.request.Cuahang;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLNhanvien {
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

//    @NotBlank(message = "Không được để trống")
    private String chucVu;

    @NotBlank(message = "Không được để trống")
    private String trangThai;
    @NotBlank(message = "Không được để trống")

    private String matkhau;

    public void loadFromEntity(NhanVien nv){
        this.setMa(nv.getMa());
        this.setHo(nv.getHo());
        this.setTenDem(nv.getTenDem());
        this.setTen(nv.getTen());
        this.setGioiTinh(nv.getGioiTinh());
        this.setNgaySinh(nv.getNgaySinh());
        this.setDiaChi(nv.getDiaChi());
        this.setSdt(nv.getSdt());
        this.setChucVu(nv.getChucVu());

//        Cuahang vm = new Cuahang();
//        vm.setTen( nv.getCuaHang().getTen() );
//        vm.setMa( nv.getCuaHang().getMa() );
//        vm.setDiaChi( nv.getCuaHang().getDiaChi() );
//        vm.setThanhPho( nv.getCuaHang().getThanhPho() );
//        vm.setQuocGia( nv.getCuaHang().getQuocGia() );

        this.setCuaHangVM(nv.getCuaHang().getId());
        this.setTrangThai(nv.getTrangThai());
    }


}
