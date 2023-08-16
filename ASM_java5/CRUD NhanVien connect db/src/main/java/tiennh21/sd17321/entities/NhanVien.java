package tiennh21.sd17321.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tiennh21.sd17321.request.NhanVienVM;

import java.util.UUID;

    @Entity(name="NhanVien")
    @Table(name="NhanVien")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class NhanVien {
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

        @Column(name="GioiTinh")
        private String gioiTinh;

        @Column(name="NgaySinh")
        private String ngaySinh;

        @Column(name="DiaChi")
        private String diaChi;

        @Column(name="Sdt")
        private String sdt;

        @Column(name="MatKhau")
        private String matKhau;

        @Column(name="TrangThai")
        private String trangThai;

        public void loadFromVMNV(NhanVienVM vm)
        {
            this.setMa( vm.getMa() );
            this.setHo( vm.getHo() );
            this.setTenDem( vm.getTenDem() );
            this.setTen( vm.getTen() );
            this.setGioiTinh( vm.getGioiTinh() );
            this.setNgaySinh( vm.getNgaySinh() );
            this.setDiaChi( vm.getDiaChi() );
            this.setSdt( vm.getSdt() );
            this.setMatKhau( vm.getMatKhau() );
            this.setTrangThai( vm.getTrangThai());
        }
    }
