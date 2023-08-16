package com.example.demo.Services;

import com.example.demo.Enitity.KhachHang;
import com.example.demo.Repostory.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    public List<KhachHang> getAll(){
        return khachHangRepository.findAll();
    }
    public KhachHang add(KhachHang kh){
        return khachHangRepository.save(kh);
    }
    public KhachHang update(KhachHang khachHang,  Long ma){
        Optional<KhachHang> optional = khachHangRepository.findById(ma);
        return optional.map(o-> {
            o.setTenKhachHang(khachHang.getTenKhachHang());
            o.setGioiTinh(khachHang.getGioiTinh());
            o.setSoDienThoai(khachHang.getSoDienThoai());
            return khachHangRepository.save(o);
        }).orElse(null);
    }
    public KhachHang delete(Long ma){
        Optional<KhachHang> optional = khachHangRepository.findById(ma);
        return optional.map(o->{
            khachHangRepository.delete(o);
            return o;
        }).orElse(null);
    }
}
