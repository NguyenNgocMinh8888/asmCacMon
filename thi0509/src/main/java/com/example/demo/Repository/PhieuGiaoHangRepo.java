package com.example.demo.Repository;

import com.example.demo.Entity.HoaDon;
import com.example.demo.Entity.PhieuGiaoHang;
import com.example.demo.dbo.PhieuGiaoHangCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PhieuGiaoHangRepo extends JpaRepository<PhieuGiaoHang, UUID> {


    @Query(value = "select hd.MaHoaDon,hd.NguoiLap,pgh.SdtNhan,pgh.PhiGiaoHang,dc.MaDiaChi from PhieuGiaoHang  pgh \n" +
            "join HoaDon hd on hd.MaHoaDon =pgh.HoaDonGiao\n" +
            "join DiaChi dc on dc.MaDiaChi= pgh.DiaChiGiao",nativeQuery = true)

    List<PhieuGiaoHangCustom> getPGHAll();
}
