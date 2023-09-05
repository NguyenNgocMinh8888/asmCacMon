package com.example.demo.dbo;

//import com.example.demo.Entity.DiaChi;
import com.example.demo.Entity.HoaDon;
import com.example.demo.Entity.PhieuGiaoHang;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;
@Setter
@Getter
public class PhieuGiaoHangRequest {

    String nguoiLap;
    String sdtNhan;
    BigDecimal phiGiaoHang;
    UUID maDiaChi;
    Long maHoaDon;

    public PhieuGiaoHang map(PhieuGiaoHang pgh){
        pgh.setPhiGiaoHang(this.phiGiaoHang);
        pgh.setHoaDon(HoaDon.builder().maHoaDon(maHoaDon).nguoiLap(nguoiLap).build());
        pgh.setSdtNhan(sdtNhan);
//        pgh.setDiaChi(DiaChi.builder().maDiaChi(maDiaChi).build());
        return pgh;
    }
}
