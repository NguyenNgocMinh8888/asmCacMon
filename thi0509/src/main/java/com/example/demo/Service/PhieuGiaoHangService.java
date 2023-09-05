package com.example.demo.Service;

//import com.example.demo.Entity.DiaChi;
import com.example.demo.Entity.HoaDon;
import com.example.demo.Entity.PhieuGiaoHang;
import com.example.demo.Repository.PhieuGiaoHangRepo;
import com.example.demo.dbo.PhieuGiaoHangCustom;
import com.example.demo.dbo.PhieuGiaoHangRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PhieuGiaoHangService {
    @Autowired
    private PhieuGiaoHangRepo phieuGiaoHangRepo;

    public List<PhieuGiaoHangCustom> getPGHAll() {
        return phieuGiaoHangRepo.getPGHAll();
    }

    public PhieuGiaoHang update(PhieuGiaoHangRequest phieuGiaoHangRequest, UUID ma) {
        Optional<PhieuGiaoHang> optional = phieuGiaoHangRepo.findById(ma);
        return optional.map(phieuGiaoHang -> {
            phieuGiaoHang.setSdtNhan(phieuGiaoHangRequest.getSdtNhan());
            phieuGiaoHang.setPhiGiaoHang((phieuGiaoHangRequest.getPhiGiaoHang()));
            phieuGiaoHang.setHoaDon(HoaDon.builder().maHoaDon(phieuGiaoHangRequest.getMaHoaDon()).build());
//            phieuGiaoHang.setDiaChi(DiaChi.builder().maDiaChi(phieuGiaoHangRequest.getMaDiaChi()).build());
            phieuGiaoHangRepo.save(phieuGiaoHang);
            return phieuGiaoHang;
        }).orElse(null);

    }
    public PhieuGiaoHang delete(UUID ma){
        Optional<PhieuGiaoHang> optional = phieuGiaoHangRepo.findById(ma);
        return optional.map(phieuGiaoHang -> {
            phieuGiaoHangRepo.delete(phieuGiaoHang);
            return phieuGiaoHang;
        }).orElse(null);
    }
    public PhieuGiaoHang add(PhieuGiaoHangRequest request){
        PhieuGiaoHang phieuGiaoHang = request.map(new PhieuGiaoHang());
        return phieuGiaoHangRepo.save(phieuGiaoHang);
    }
}
